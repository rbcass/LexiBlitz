package src;

import java.util.Scanner;

public class Player {

    private String input;
    private int count = 0;
    public Player(){

        this.input = input();

    }

    public String input(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter word: ");
        String input = scan.nextLine();


        return input;
    }

    public int count(){

        return ++count;
    }




}
