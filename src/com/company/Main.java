package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
	int[] array= {1,2,3,4,5,6,7,8,9};
        int inputnumber = checkNumber(array,number);
        System.out.println("số đã nhập nằm ở vị trí " + (inputnumber + 1) + " trong mảng");
        int[] endArray = newArray(array,number,inputnumber);
        System.out.print("Mảng cuối cùng có được là: ");
        for (int i = 0; i < endArray.length; i++) {
            System.out.print(endArray[i] + ", ");
        }
    }
    public static int checkNumber(int[]array,int number){
        int i;
        for (i=0;i<array.length;i++){
            if (array[i]==number){
                break;
            }
        }
        return i;
    }
    public static int[] newArray(int[] array,int number,int i){
        for ( ; i < array.length; i++){
            if( i == array.length -1) {
                array[array.length-1] = 0;
            } else {
                array[i] = array[i + 1];
            }
        }
        return array;
    }

}
