package com.br.HackerRank.java.easy.JavaStringIntroduction;

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        int somaLength = A.length() + B.length();

        System.out.println(somaLength);

        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        String maiusculoA = A.substring(0,1).toUpperCase() + A.substring(1);
        String maiusculoB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(maiusculoA + " " + maiusculoB);


    }

}
