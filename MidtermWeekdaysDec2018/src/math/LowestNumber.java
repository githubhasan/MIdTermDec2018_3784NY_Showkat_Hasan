package math;

import java.util.Arrays;




		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */


		//find lowest number from the array

public class LowestNumber {
			public static int getSmallest(int[] a, int total){
				Arrays.sort(a);
				return a[0];
			}
			public static void main(String args[]){
				int  a[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};

				System.out.println("Smallest: "+getSmallest(a,26));

			}



//	ConnectDB connectDB = new ConnectDB();
//		List<String> lowestValue = new ArrayList<String>();
//
//		try {
//			connectDB.insertDataFromArrayToMySql(array, "tbl_lowestNumber", "column_lowestNumber");
//			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
//		for(String st:lowestValue){
//			System.out.println(st);
//		}
	}


