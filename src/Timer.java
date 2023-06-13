package src;

import java.util.TimerTask;

public class Timer {

    private java.util.Timer timer;
    private TimerTask task;

    private int counter;

    public Timer(){

        this.timer = new java.util.Timer();

        counter=0;




    }

    public void incrementCount() {
        counter++;
    }

    public void resetCount() {
        counter = 0;
    }

    public int getCount(){
        return counter;
    }

    public void schedule( long delay){

        task = new TimerTask() {
            @Override
            public void run() {
                counter++;
                System.out.println("T: " + counter);
            }
        };

        timer.schedule(task, delay);
    }

    public void cancel(){
        if(task != null){
            task.cancel();
        }
    }
}
