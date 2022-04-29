package View;

import Controller.PlayerDataBase;
import Controller.ProfilePageController;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfilePageView
{
    private ProfilePageController profilePageController;

    public ProfilePageView(ProfilePageController profilePageController) {
        this.profilePageController = profilePageController;
    }

    public void showMenu() {
        run();
    }

    public void run()
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            String command = in.nextLine().trim();
            Matcher ExitPatternMatcher = getCommandMatcher(command, Regexes.Exit);
            if (ExitPatternMatcher.matches()) {
                break;
            }
            Matcher changeNickName = getCommandMatcher(command, Regexes.changeNickname);
            if (changeNickName.matches())
            {
                ChangeNickName(changeNickName);
                continue;
            }
            Matcher Abbreviation_changeNickName = getCommandMatcher(command, Regexes.Abbreviation_changeNickname);
            if (Abbreviation_changeNickName.matches())
            {
                ChangeNickName(Abbreviation_changeNickName);
                continue;
            }
            Matcher changePassword = getCommandMatcher(command, Regexes.changePassword);
            if (changePassword.matches())
            {
                ChangePassword(changePassword);
                continue;
            }
            Matcher Abbreviation_changePassword = getCommandMatcher(command, Regexes.Abbreviation_changePassword);
            if (Abbreviation_changePassword.matches()) {
                ChangePassword(Abbreviation_changePassword);
                continue;
            }
            Matcher showCurrentMenuPattern = getCommandMatcher(command, Regexes.showCurrentMenu);
            if (showCurrentMenuPattern.matches()) {
                showCurrentMenu();
                continue;
            }
            Matcher goToMenu = getCommandMatcher(command, Regexes.goToMenu);
            if (goToMenu.matches())
            {
                goToNextMenu(goToMenu);
                continue;
            }

            invalidMessage();
        }
    }


    public void showCurrentMenu() {
        System.out.println("Profile Menu");
    }
    public void goToNextMenu(Matcher matcher) {
        System.out.println("menu navigation is not possible");
    }

    private Matcher getCommandMatcher(String input, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m;
    }

    private void invalidMessage() {
        System.out.println("invalid command");
    }

    public void ChangeNickName(Matcher matcher) {
        String newNickname = matcher.group(7);
        PlayerDataBase playerDataBase = profilePageController.getPlayerDataBase();
        if (playerDataBase.getUserByNickname(newNickname) != null) {
            System.out.println("user with nickname "+newNickname+" already exists");
            return;
        }
        profilePageController.ChangeNickName(newNickname);
        System.out.println("nickname changed successfully!");
    }

    public void ChangePassword(Matcher matcher) {
        String currentPassword = "";
        String newPassword = "";
        String first = matcher.group(7);
        String second = matcher.group(11);

        if (first.equals("--current") || first.equals("-c")) {
            currentPassword = matcher.group(9);
        }
        else if (second.equals("--current") || second.equals("-c"))
        {
            currentPassword = matcher.group(13);
        }

        if (first.equals("--new") || first.equals("-n")) {
            newPassword = matcher.group(9);
        }
        else if (second.equals("--new") || second.equals("-n"))
        {
            newPassword = matcher.group(13);
        }

        if (currentPassword.equals("") || newPassword.equals("")) {
            invalidMessage();
            return;
        }
        PlayerDataBase playerDataBase = profilePageController.getPlayerDataBase();
        if (!playerDataBase.getLoggedInUser().getPassword().equals(currentPassword))
        {
            System.out.println("current password is invalid");
            return;
        }
        if (currentPassword.equals(newPassword))
        {
            System.out.println("please enter a new password");
            return;
        }
        profilePageController.ChangePassword(newPassword);
        System.out.println("password changed successfully!");
    }
}
