package View;

public class Regexes {
    static String Exit = "(menu){1}(\\s+)(exit){1}";
    static String login = "(user){1}(\\s+)(login){1}(\\s+)(--{1}\\S+)(\\s+)(\\S+)(\\s+)(--{1}\\S+)(\\s+)(\\S+)";
    static String Abbreviation_login = "(user){1}(\\s+)(login){1}(\\s+)(-{1}\\S)(\\s+)(\\S+)(\\s+)(-{1}\\S)(\\s+)(\\S+)";
    static String goToMenu = "(menu){1}(\\s+)(enter){1}(\\s+)([a-zA-Z ]+)";
    static String showCurrentMenu = "(menu){1}(\\s+)(show-current){1}";
    static String logout = "(user){1}(\\s+)(logout){1}";
    static String Register = "(user){1}(\\s+)(create){1}(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)";
    static String Abbreviation_Register = "(user){1}(\\s+)(create){1}(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)";
    static String changeNickname = "(profile){1}(\\s+)(change){1}(\\s+)(--nickname){1}(\\s+)(\\S+)";
    static String Abbreviation_changeNickname = "(profile){1}(\\s+)(change){1}(\\s+)(-n){1}(\\s+)(\\S+)";
    static String changePassword = "(profile){1}(\\s+)(change){1}(\\s+)(password){1}(\\s+)(--\\S+)(\\s+)(\\S+)(\\s+)(--\\S+)(\\s+)(\\S+)";
    static String Abbreviation_changePassword = "(profile){1}(\\s+)(change){1}(\\s+)(password){1}(\\s+)(-\\S)(\\s+)(\\S+)(\\s+)(-\\S)(\\s+)(\\S+)";
    static String playGame = "play game(?<command>( --player\\d+ \\S+)+)";
    static String Abbreviation_playGame = "play game(?<command>( -p\\d+ \\S+)+)";
}
