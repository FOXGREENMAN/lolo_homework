package com.main.whiteBoard.design;

import com.main.whiteBoard.design.Sender;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms Sender!");
    }
}