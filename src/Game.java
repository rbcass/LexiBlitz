package src;

public class Game {

    private Word word;
    private Player player;

    private Timer timer;

    public Game(){

        this.word = new Word();
        this.player = new Player();
        this.timer = new Timer();


        startGame();
    }

    public void startGame(){

        timer.schedule(1000);
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
            startGame();
            timer.cancel();
            timer.schedule(1000);
        }else{
            System.out.println("x");
            startGame();
            timer.cancel();
            timer.schedule(1000);
        }



    }
}
