package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Random val = new Random();
        int[] A = new int[25];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            A[i] = i;
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);

        }
        System.out.println(Arrays.toString(A));
        System.out.println("Минимальный элемент: " + A[min]);
        System.out.println("Максимальный элемент: " + A[max]);  // Максимальный элемент Выводится!

        //System.out.println("Минимальный элемент: "+min);
        //System.out.println("Максимальный элемент: "+max);

        int ex = A[min];
        A[min] = A[max];
        A[max] = ex;
        System.out.println("Меняем их местами:");
        System.out.println(Arrays.toString(A));

        int[] B = new int[25];
        for (int i = 0; i < B.length; i++) {
            B[i] = val.nextInt(50);
        }
        System.out.println("Неупорядоченный массив:");
        System.out.println(Arrays.toString(B));
        Arrays.sort(B);
        System.out.println("Упорядоченный массив:");
        System.out.println(Arrays.toString(B));

        int[] C = new int[20];
        for (int i = 0; i < C.length; i++) {
            C[i] = val.nextInt(50);
        }
        System.out.println("Массив С:");
        System.out.println(Arrays.toString(C));
        double s=0;
        for(int i=0;i<C.length;i++){
            s=s+C[i];
        }
        double cent=s/C.length;
        System.out.println("Средние арифметическое значение массива С: "+cent);

        int[] D = new int[30];
        int e = 0;
        int o = 0;
        int esum = 0;
        int osum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = i;
            if (i % 2 == 0) {
                e += i;
            } else {
                o += i;
            }
            esum = (e+e)/2;
            osum = (o+o)/2;
        }
        System.out.println("Массив D:");
        System.out.println(Arrays.toString(D));
        System.out.println("Сумма четных элементов: "+esum+"\n Сумма нечетных элементов: "+osum);

        System.out.println("Таблица 3х5 случайных элементов (a(i,j)< 10):");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(val.nextInt(10) + " ");
            }
            System.out.println();
        }
        String [] AS = new String[]{"Строка 1 и Строка 2"," должны объединится!","Строка 3","Строки 4 и 5 одинаковые","Строки 4 и 5 одинаковые"};
        String s1 =AS[0];
        String s2 =AS[1];
        String s3 =AS[2];
        String s4 =AS[3];
        String s5 =AS[4];
        System.out.println(Arrays.toString(AS));
        if(s4==s5){ System.out.println("\n"+s1+s2); }
        else{System.out.println("\n"+s1+s3);}
    }
}