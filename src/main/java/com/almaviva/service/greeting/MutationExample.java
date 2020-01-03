package com.almaviva.service.greeting;

public class MutationExample {

    public String oddOrEven(Integer i) {
        String result = "odd";
        if(i%2==0){
            result = "even";
        }
        return result;
    }
}
