package View;

import Controller.MainPageController;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPageView {
    private MainPageController mainPageController;

    public MainPageView(MainPageController mainPageController) {
        this.mainPageController = mainPageController;
    }

    public void run() {
        showMenu();
    }

    public void showMenu() {
        Scanner in = new Scanner(System.in);

        while (true)
        {
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
            Matcher logout = getCommandMatcher(command, Regexes.logout);
            if (logout.matches()) {
                Logout();
                break;
            }
            Matcher goToMenu = getCommandMatcher(command, Regexes.goToMenu);
            if (goToMenu.matches())
            {
                goToNextMenu(goToMenu);
                continue;
            }
        }
    }

    public void playGame() {

    }

    public void goToNextMenu(Matcher matcher) {
        String menu = matcher.group(5);
        if (menu.equals("Main Menu") || (!menu.equals("Profile Menu") && !menu.equals("Game Menu"))) {
            invalidMessage();
            return;
        }
        mainPageController.goToNextMenu(matcher);
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
        System.out.println("Main Menu");
    }

    public void Logout() {
        mainPageController.Logout();
        System.out.println("user logged out successfully!");
    }

}
