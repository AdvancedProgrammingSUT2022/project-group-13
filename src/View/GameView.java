package View;

import Controller.GamePageController;
import Controller.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GameView {

    private GamePageController gamePageController;

    public GameView(GamePageController gamePageController) {
        this.gamePageController = gamePageController;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String command = in.nextLine().trim();
            Matcher ExitPatternMatcher = getCommandMatcher(command, Regexes.Exit);
            if (ExitPatternMatcher.matches()) {
                break;
            }
            Matcher showCurrentMenuPattern = getCommandMatcher(command, Regexes.showCurrentMenu);
            if (showCurrentMenuPattern.matches()) {
                showCurrentMenu();
                continue;
            }
            Matcher goToMenu = getCommandMatcher(command, Regexes.goToMenu);
            if (goToMenu.matches()) {
                goToNextMenu(goToMenu);
                continue;
            }
            Matcher playGame = getCommandMatcher(command, Regexes.playGame);
            if (playGame.matches()) {
                PlayGame(playGame);
                continue;
            }
            Matcher Abbreviation_playGame = getCommandMatcher(command, Regexes.Abbreviation_playGame);
            if (Abbreviation_playGame.matches()) {
                PlayGame(Abbreviation_playGame);
                continue;
            }
            invalidMessage();
        }
    }
    public void showMenu() {
        run();
    }

    private Matcher getCommandMatcher(String input, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m;
    }

    private void invalidMessage() {
        System.out.println("invalid command");
    }

    public void showCurrentMenu() {
        System.out.println("Game Menu");
    }

    public void goToNextMenu(Matcher matcher) {
        System.out.println("menu navigation is not possible");
    }

    public void PlayGame(Matcher matcher) {
        String[] subCommands = matcher.group("command").split(" --player\\d+ ");
        ArrayList<User> players = new ArrayList<>();
        for (int i = 1; i < subCommands.length; i++) {
            User player = gamePageController.getPlayerDataBase().getUser(subCommands[i]);
            if (player == null)
            {
                System.out.println("player " + subCommands[i] + " was not exist!");
                return;
            }
        }
        gamePageController.PlayGame(players);
    }
}
