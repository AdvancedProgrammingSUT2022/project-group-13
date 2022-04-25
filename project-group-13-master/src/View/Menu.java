package View;

import java.util.Scanner;

import Database.User;

public abstract class Menu {
    protected User currentuser;
    protected Scanner scanner;
    public Menu()
    {
      this.currentuser=null;
      this.scanner=new Scanner(System.in);
    }
}
