package homework7;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array =new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(0,100);
            System.out.println(array[i]);
            if (i == a){
                System.out.println(i);
            }else {
                System.out.println("Мындай сан массивте жок!");
            }
        }



    }
}