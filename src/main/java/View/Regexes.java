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
    static String ShowInfo = "(show info){1}";

    //info
    static String ShowExploreInformation = "(show){1}(\\s+)(explore){1}(\\s+)(information){1}";
    static String ShowUnits = "(show){1}(\\s+)(units){1}";
    static String ShowCities = "(show){1}(\\s+)(cities){1}";
    static String ShowDiplomacyInformation = "(show){1}(\\s+)(diplomacy){1}(\\s+)(information){1}";
    static String VictoryInformation = "(show victory information){1}";
    static String show_demographics_information = "(show demographics information){1}";
    static String showNotifications = "(show notifications){1}";
    static String show_military_information = "(show military information$){1}";
    static String show_economic_information = "(show economic information){1}";
    static String show_diplomatic_information = "(show diplomatic information){1}";
    static String show_deals = "(show deals){1}";
}
