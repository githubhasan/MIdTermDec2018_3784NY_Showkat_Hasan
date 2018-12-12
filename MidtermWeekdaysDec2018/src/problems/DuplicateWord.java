package problems;

/**
 * Created by mrahman on 04/22/17.
 */

        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

       // String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class DuplicateWord {

    public static void main(String[] args) {
                String test = "This sentence contains two words, one and two";
                Set<String> duplicates = duplicateWords(test);
                System.out.println("input : " + test);
                System.out.println("output : " + duplicates);
            }


            public static Set<String> duplicateWords(String input){

                if(input == null || input.isEmpty()){
                    return Collections.emptySet();
                }
                Set<String> duplicates = new HashSet<>();

                String[] words = input.split("\\s+");
                Set<String> set = new HashSet<>();

                for(String word : words){
                    if(!set.add(word)){
                        duplicates.add(word);
                    }
                }
                return duplicates;
            }


        }


