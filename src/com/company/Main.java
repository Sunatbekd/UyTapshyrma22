package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> obshNum = new ArrayList<>();
        ArrayList<Integer> jupMass = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            obshNum.add(a);
            if (a%2==1){
                number.add(a);
            }else {
                jupMass.add(a);
            }
        }
        System.out.println("Massive: "+obshNum);
        System.out.println("Tak sandar: "+number);
        System.out.println("Jup sandar: "+jupMass);
    }
}
