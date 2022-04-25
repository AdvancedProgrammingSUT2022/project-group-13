import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexMaker {
    private Matcher getCommandMatcher(String input, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m;
    }

    @Test
    public void loginRegex()
    {
//        user login --username <username> --password <password>
        String input = "user login --username hossein --password 12345";
        String input2 = "user login --password 12345 --username hossein";
        Matcher m = getCommandMatcher(input2, "(user){1}(\\s+)(login){1}(\\s+)(--{1}\\S+)(\\s+)(\\S+)(\\s+)(--{1}\\S+)(\\s+)(\\S+)");
        System.out.println(m.matches());
        String username = m.group(7);
        String password = m.group(11);
        String first = m.group(5);
        String second = m.group(9);
        System.out.println(username);
        System.out.println(password);
        System.out.println(first);
        System.out.println(second);
    }


    @Test
    public void loginRegex2()
    {
//        user login -p <password> -u <username>
        String input = "user login -p 12345 -u hossein";
        String input2 = "user login -u hossein -p 12345";
        Matcher m = getCommandMatcher(input2, "(user){1}(\\s+)(login){1}(\\s+)(-{1}\\S)(\\s+)(\\S+)(\\s+)(-{1}\\S)(\\s+)(\\S+)");
        System.out.println(m.matches());
        String username = m.group(7);
        String password = m.group(11);
        String first = m.group(5);
        String second = m.group(9);
        System.out.println(username);
        System.out.println(password);
        System.out.println(first);
        System.out.println(second);
    }


    @Test
    public void EnterToaMenu() {
//        menu enter <menu name>
        String command = "menu enter MainMenu";
        String goToMenu = "(menu){1}(\\s+)(enter){1}(\\s+)([a-zA-Z ]+)";
        Matcher matcher = getCommandMatcher(command, goToMenu);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(5));
    }

    @Test
    public void showCurrentMenu() {
//      menu show-current
        String command = "menu show-current";
        String showCurrentMenu = "(menu){1}(\\s+)(show-current){1}";
        Matcher matcher = getCommandMatcher(command, showCurrentMenu);
        System.out.println(matcher.matches());
    }

    @Test
    public void Register() {
//        user create --username <username> --nickname <nickname> --password <password>
        String command = "user create --username aryan --nickname ary --password aA123";
        String Abbreviation_Register = "(user){1}(\\s+)(create){1}(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)";
        Matcher matcher = getCommandMatcher(command, Abbreviation_Register);
        System.out.println(matcher.matches());
        String first = matcher.group(5);
        String second = matcher.group(9);
        String third = matcher.group(13);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    @Test
    public void Register2() {
//        user create --username <username> --nickname <nickname> --password <password>
        String command = "user create -u aryan -n ary -p aA123";
        String Register = "(user){1}(\\s+)(create){1}(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)";
        Matcher matcher = getCommandMatcher(command, Register);
        System.out.println(matcher.matches());
        String first = matcher.group(5);
        String second = matcher.group(9);
        String third = matcher.group(13);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    @Test
    public void changeNickname() {
//        profile change --nickname <nickname>
        String command = "profile change --nickname hosseinJob";
        String changeNickname = "(profile){1}(\\s+)(change){1}(\\s+)(--nickname){1}(\\s+)(\\S+)";
        Matcher matcher = getCommandMatcher(command, changeNickname);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(7));
    }

    @Test
    public void changePassword() {
//        profile change password --current <current password> --new <new password>
        String command = "profile change password --current 12345 --new 9789";
        String changePassword = "(profile){1}(\\s+)(change){1}(\\s+)(password){1}(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)";
        Matcher matcher = getCommandMatcher(command, changePassword);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(9));
        System.out.println(matcher.group(13));
        System.out.println(matcher.group(7));
        System.out.println(matcher.group(11));
    }

    @Test
    public void changePassword2() {
//        profile change password --current <current password> --new <new password>
        String command3 = "profile change password -c 12345 -n 9789";
        String command = "profile change password -c 123aA -n 123";
        String Abbreviation_changePassword = "(profile){1}(\\s+)(change){1}(\\s+)(password){1}(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)";
        Matcher matcher = getCommandMatcher(command, Abbreviation_changePassword);
        System.out.println(matcher.matches());
        System.out.println(matcher.group(9));
        System.out.println(matcher.group(13));
        System.out.println(matcher.group(7));
        System.out.println(matcher.group(11));
    }

    @Test
    public void playGame() {
//        play game --player1 <username> --player2 <username>
        String command = "play game --player1 hossein --player2 aryan --player3 abas --player4 reza --player5 sina";
        String playGame = "play game(?<command>( --player\\d+ \\S+)+)";
        Matcher matcher = getCommandMatcher(command, playGame);
        System.out.println(matcher.matches());
        String[] splitCommand = matcher.group("command").split(" --player\\d+ ");
        for (int i = 1; i < splitCommand.length; i++) {
            System.out.println(splitCommand[i]);
        }
    }
}
