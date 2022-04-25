package ControllerTest;
import Controller.*;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginControllerTest {

    private Matcher getCommandMatcher(String input, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m;
    }


    @Test
    public void Login()
    {
        PlayerDataBase playerDataBase = new PlayerDataBase();
        LoginPageController loginPageController = new LoginPageController(playerDataBase);
        String command = "user login --username hossein --password 12345";
        String command2 = "user login --password 12345 --username hossein";
        Matcher matcher = getCommandMatcher(command, "(user){1}(\\s+)(login){1}(\\s+)(--{1}\\S+)(\\s+)(\\S+)(\\s+)(--{1}\\S+)(\\s+)(\\S+)");
        matcher.matches();
        String first = matcher.group(5);
        String second = matcher.group(9);
        String username = "";
        String password = "";
        if (first.equals("--username"))
        {
            username = matcher.group(7);
        }
        else if (second.equals("--username")) {
            username = matcher.group(11);
        }
        if (first.equals("--password"))
        {
            password = matcher.group(7);
        }
        else if (second.equals("--password")) {
            password = matcher.group(11);
        }
        System.out.println(username + " " + password);
        if (loginPageController.login(username, password)) {
            System.out.println("login successfully!");
        }
        else {
            System.out.println("incorrect username or password!");
        }
    }


}
