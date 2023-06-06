package src;

public class Game {

    private Word word;
    private Player player;

    public Game(){

        this.word = new Word();
        this.player = new Player();


        startGame();
    }

    public void startGame(){

        System.out.println("------------------------------");
        System.out.println("TYPE A WORD CONTAINING: ");
        char[] word1 = word.generateWord();
        System.out.println(word1);
        String input = player.input();

        String check = new String(word1);

        if(input.contains(check)){
            System.out.println("congrats");
            player.count();
            System.out.println(player.count());
        }else{
            System.out.println("x");
            player.input();
        }



    }
}
