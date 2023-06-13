package src;

import java.util.TimerTask;

public class Timer {

    private java.util.Timer timer;
    private TimerTask task;

    public Timer(){

        this.timer = new java.util.Timer();
        this.task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("sjsjf");
            }
        };


    }

    public void schedule( long delay){

        timer.schedule(task,delay);
    }

    public void cancel(){
        if(task != null){
            task.cancel();
        }
    }
}
