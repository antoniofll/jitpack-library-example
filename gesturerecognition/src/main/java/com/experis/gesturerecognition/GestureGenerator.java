package com.experis.gesturerecognition;

import java.util.Random;

/**
 * Created by Antonio on 16/01/2018.
 */

public class GestureGenerator {
    public String [] welcome_messages = {"UP", "DOWN", "RIGHT", "LEFT"};

    public GestureGenerator(){

    }

    public String getGesture(){
        int i = new Random().nextInt(welcome_messages.length);
        return welcome_messages[i];
    }
}
