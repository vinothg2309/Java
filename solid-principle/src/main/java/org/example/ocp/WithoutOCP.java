package org.example.ocp;

public class WithoutOCP {

    public void sendOTP(String medium){
        if(medium.equals("email")){
            // Email Logic
        }
        if(medium.equals("mobile")){
            // Mobile Notification
        }
    }
}
