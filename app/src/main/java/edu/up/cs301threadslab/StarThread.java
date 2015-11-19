package edu.up.cs301threadslab;

/**
 * Created by martinme18 on 11/18/2015.
 */
public class StarThread extends Thread {


    private AnimationView canvas;
    private boolean t = true;


    public StarThread(AnimationView v) {
        canvas = v;



    }


        @Override
        public void run() {

            while (t) {

                canvas.postInvalidate();

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }


}







