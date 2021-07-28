package com.main.whiteBoard.design;

import com.main.whiteBoard.design.MailSender;
import com.main.whiteBoard.design.Sender;

public class SendFactory {

    public Sender produceMail(){

        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }


}

