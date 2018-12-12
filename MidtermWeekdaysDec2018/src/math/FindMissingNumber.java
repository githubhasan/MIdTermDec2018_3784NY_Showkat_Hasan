

/**
 * Created by mrahman on 04/22/17.
 */

        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        package math;
        import java.util.Arrays;
        import java.util.HashSet;


    public class FindMissingNumber {

    public static void main(String[] args) {

        int [] a1 = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
                Arrays.sort(a1);
                HashSet hs=new HashSet();
                int j=0;
                for(int i=1; i<10; i++)
                {
                    if (j<a1.length && i==a1[j])
                    {
                        j++;
                    }
                    else
                    {
                        hs.add(i);
                    }
                }
                System.out.println(hs);
            }
        }

