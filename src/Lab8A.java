//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 8

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class Lab8A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        int[] arr1 = new int[10];
        int e = 0;
        int temp;

        //input array
        for (int i = 0; i < 10; i++){
            out.print("Enter slot "+ i + ": ");
            arr1[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) {
                if (arr1[i] < arr1[j])
                {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                    e++;
                    for (int w = 0; w < 10; w++) {
                        out.print(arr1[w] + "|");

                    }
                    out.print(" Num swaps: " + e + "\n");
                }
            }
        }
    }
}
