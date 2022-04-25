package View;

import Controller.LoginPageController;
import Controller.MainPageController;
import Controller.PlayerDataBase;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogInPageView {
    private LoginPageController loginPageController;

    public LogInPageView(LoginPageController loginPageController) {
        this.loginPageController = loginPageController;
    }

    public void run() {
        PlayerDataBase playerDataBase = loginPageController.getPlayerDataBase();
        playerDataBase.loadData();
        Scanner in = new Scanner(System.in);
        while (true)
        {
            String command = in.nextLine().trim();
            Matcher ExitPatternMatcher = getCommandMatcher(command, Regexes.Exit);
            if (ExitPatternMatcher.matches()) {
                playerDataBase.saveData();
                break;
            }

            Matcher login = getCommandMatcher(command, Regexes.login);
            if (login.matches()) {
                Login(login);
                continue;
            }
            Matcher Abbreviation_login = getCommandMatcher(command, Regexes.Abbreviation_login);
            if (Abbreviation_login.matches()) {
                Login(Abbreviation_login);
                continue;
            }
            Matcher goToMenu = getCommandMatcher(command, Regexes.goToMenu);
            if (goToMenu.matches())
            {
                goToNextMenu(goToMenu);
                continue;
            }
            Matcher showCurrentMenuPattern = getCommandMatcher(command, Regexes.showCurrentMenu);
            if (showCurrentMenuPattern.matches()) {
                showCurrentMenu();
                continue;
            }
            Matcher register = getCommandMatcher(command, Regexes.Register);
            if (register.matches()) {
                Register(register);
                continue;
            }
            Matcher AbbreviationRegister = getCommandMatcher(command, Regexes.Abbreviation_Register);
            if (AbbreviationRegister.matches())
            {
                Register(AbbreviationRegister);
                continue;
            }
            invalidMessage();
            continue;
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
        System.out.println("Login Menu");
    }

    public void Login (Matcher matcher) {
        String first = matcher.group(5);
        String second = matcher.group(9);
        String username = "";
        String password = "";
        if (first.equals("--username") || first.equals("-u"))
        {
            username = matcher.group(7);
        }
        else if (second.equals("--username") || second.equals("-u")) {
            username = matcher.group(11);
        }
        if (first.equals("--password") || first.equals("-p"))
        {
            password = matcher.group(7);
        }
        else if (second.equals("--password") || second.equals("-p")) {
            password = matcher.group(11);
        }
        if (first.equals("") || second.equals("")) {
            invalidMessage();
            return;
        }
        if (loginPageController.login(username, password)) {
            System.out.println("user logged in successfully!");
            MainPageController mainPageController = new MainPageController(loginPageController.getPlayerDataBase());
            MainPageView mainPageView = new MainPageView(mainPageController);
            mainPageView.showMenu();
        }
        else {
            System.out.println("Username and password didn’t match!");
        }
    }

    public void Register(Matcher matcher) {
        String name = "";
        String nickname = "";
        String password = "";
        String first = matcher.group(5);
        String second = matcher.group(9);
        String third = matcher.group(13);
        if (first.equals("--username") || first.equals("-u")) {
            name = matcher.group(7);
        }
        else if (second.equals("--username") || second.equals("-u")) {
            name = matcher.group(11);
        }
        else if (third.equals("--username") || third.equals("-u")) {
            name = matcher.group(15);
        }

        if (first.equals("--nickname") || first.equals("-n")) {
            nickname = matcher.group(7);
        }
        else if (second.equals("--nickname") || second.equals("-n")) {
            nickname = matcher.group(11);
        }
        else if (third.equals("--nickname") || third.equals("-n")) {
            nickname = matcher.group(15);
        }

        if (first.equals("--password") || first.equals("-p")) {
            password = matcher.group(7);
        }
        else if (second.equals("--password") || second.equals("-p")) {
            password = matcher.group(11);
        }
        else if (third.equals("--password") || third.equals("-p")) {
            password = matcher.group(15);
        }

        if (name.equals("") || nickname.equals("") || password.equals("")) {
            invalidMessage();
            return;
        }

        PlayerDataBase playerDataBase = loginPageController.getPlayerDataBase();
        if (playerDataBase.getUser(name) != null)
        {
            System.out.println("user with username "+ name +" already exists");
            return;
        }

        if (playerDataBase.getUserByNickname(nickname) != null)
        {
            System.out.println("user with nickname "+ nickname +" already exists");
            return;
        }
        loginPageController.register(name, nickname, password);
        System.out.println("user created successfully!");
    }

    public void goToNextMenu(Matcher matcher) {
        String menu = matcher.group(5);
        PlayerDataBase playerDataBase = loginPageController.getPlayerDataBase();
        if (playerDataBase.getLoggedInUser() == null) {
            System.out.println("please login first");
            return;
        }
        if (menu.equals("Main Menu"))
        {
            MainPageController mainPageController = new MainPageController(loginPageController.getPlayerDataBase());
            MainPageView mainPageView = new MainPageView(mainPageController);
            mainPageView.showMenu();
            return;
        }
        invalidMessage();
    }
}
