package problems;

/**
 * Created by mrahman on 04/22/17.
 */

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
/*
 * One way to find if two Strings are anagram in Java. This method
 * assumes both arguments are not null and in lowercase.
 *
 * @return true, if both String are anagram
 */

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

        public static void main(String args[])
        {
            boolean anagramw = true;
            Scanner scan= new Scanner(System.in);

            System.out.println("First Word:");
            String input1 =scan.nextLine();
            System.out.println("Second Word:");
            String input2= scan.nextLine();
            char[] A=input1.toCharArray();
            char[] B=input2.toCharArray();
            for(int i=0;i<A.length;i++)
            {
                for(int j=0;j<B.length;j++)
                {
                    Arrays.sort(A);
                    Arrays.sort(B);
                    if(A[i]==B[i])
                    {

                        anagramw = true;

                            System.out.println(anagramw + " and Both words are anagram words!!");

                    }
                    else
                    {
                        anagramw = false;

                            System.out.println(anagramw + " and They are not anagram words!!");

                    }
                }
            }

        }
    }
