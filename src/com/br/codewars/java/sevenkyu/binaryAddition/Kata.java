package com.br.codewars.java.sevenkyu.binaryAddition;

public class Kata {

    public static void main(String[] args) {
        System.out.println(binaryAddition(1,1));
        System.out.println(binaryAddition(5,9));
    }

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }

}
