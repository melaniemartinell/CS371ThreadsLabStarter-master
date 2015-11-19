package edu.up.cs301threadslab;

import java.util.Random;

/**
 * Created by martinme18 on 11/18/2015.
 */
public class AddRemoveStarThread extends Thread {

    private StarAnimation starAni;

    public AddRemoveStarThread(StarAnimation g){
            starAni = g;

    }


        @Override
        public void run() {
            while(true){

                //int rand = (int)Math.random()*10;

                if(Math.random() < 0.5){
                    starAni.addStar();
                }
                else{

                    starAni.removeStar();
                }
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

}
