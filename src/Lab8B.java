//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 8

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;
import java.lang.Math.*;

public class Lab8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        int[] arr1 = new int[15];

        for (int i = 0; i < 15; i++){
            out.print("Enter slot "+ i + ": ");
            arr1[i] = input.nextInt();
        }


//delete this later
        //for (int i = 0; i < 15; i++) {
        //    arr1[i] = i;
        //}


        //target
        out.print("Enter a target: ");
        int user = input.nextInt();
        for (int i = 0; i < 15; i++){
            out.print(arr1[i] + "|");
        }

        //liniar
        //out.println("Starting liniar...");
        out.print("\n");
        for (int i = 0; i < 15; i++){
            if (arr1[i] == user){
                out.print(arr1[i] + " ");
                break;
            }else{
                out.print(arr1[i] + " ");
            }
        }
        boolean notfound = true;
        int index = 7;
        int w = 0;
        //binary
        //out.println("Starting binary...");
        while(notfound) {
            if (arr1[index] == user) {
                out.print(arr1[index] + " ");
                out.print(index);
                notfound = false;
                break;
            } else if (arr1[index] > user) {
                out.print(index + " ");
                index = (int) Math.floor(index / 2);
            } else if (arr1[index] < user) {
                out.print(index + " ");
                index = (int) ((index) + Math.floor((14) - index)/2);
            } else {
                out.print("error");
                notfound = false;
                break;
            }
        }
    }
}
