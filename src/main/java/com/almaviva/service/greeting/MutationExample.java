package com.almaviva.service.greeting;

public class MutationExample {

    public String oddOrEven(int i) {
        String result = "odd";
        if(i%2==0){
            result = "even";
        }
        return result;
    }
}
