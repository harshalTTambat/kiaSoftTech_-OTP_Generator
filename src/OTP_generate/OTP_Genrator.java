package OTP_generate;

import java.util.concurrent.ThreadLocalRandom;

public class OTP_Genrator{
    protected void getOTP(){
        System.out.println("OTP is : "+ ThreadLocalRandom.current().nextInt(100000,999999));
    }
}