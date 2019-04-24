package com.company;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,String> myMap = new HashMap<Integer,String>();
        int value =0;
        myMap.put(1,"one");
        myMap.put(2,"two");
        myMap.put(3,"three");
        myMap.put(4,"four");
        myMap.put(5,"five");
        System.out.print("Enter a number : ");
        int num = scan.nextInt();
        for(Integer key: myMap.keySet()){
            if(key==num){
                value++;
            }


        }
        if(value>0){
        System.out.print(num+" Response ");
        System.out.println("you entered: " + myMap.get(num));
    }
            else{
        System.out.println("enter speling of " + num);
            scan.nextLine();
        String name = scan.nextLine();
        System.out.println();
        myMap.put(num,name);
    }
        System.out.println(myMap);

    }
}
