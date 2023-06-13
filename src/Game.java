package src;

import java.util.TimerTask;

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

    public void resetGame(){
        timer.cancel();
        startGame();
    }

    public void startGame(){


        System.out.println("------------------------------");
        System.out.println("TYPE A WORD CONTAINING: ");
        char[] word1 = word.generateWord();
        System.out.println(word1);
        timer.schedule(1000);

//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("Timer: " + timer.getCount());
//                timer.incrementCount();
//            }
//        };

        String input = player.input();

        String check = new String(word1);

        if(input.contains(check)){
            System.out.println("congrats");
            player.count();
            System.out.println(player.count());
            startGame();
        }else{
            System.out.println("x");
            resetGame();

        }



    }
}
