//package datastructure;
//
//
//		/*
//		 * User API to read the below textFile and print to console.
//		 * Use BufferedReader class.
//		 * Use try....catch block to handle Exception.
//		 *
//		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
//		 *
//		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
//		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
//		 * order from LinkedList and retrieve as FILO order from Stack.
//		 *
//		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
//		 * Use For Each loop/while loop/Iterator to retrieve data.
//		 */
//
//		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
//
//import java.io.BufferedReader;
//
//import java.io.File;
//import java.io.FileReader;
//
//import java.sql.SQLException;
//import java.sql.DriverManager;
//import java.sql.Connection;
//import java.sql.Statement;
//
//public class DataReader {
//
//
//
//			private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
//
//			static
//			{
//				try
//				{
//					Class.forName(DRIVER_NAME).newInstance();
//					System.out.println("*** Driver loaded");
//				}
//				catch(Exception e)
//				{
//					System.out.println("*** Error : "+e.toString());
//					System.out.println("*** ");
//					System.out.println("*** Error : ");
//					e.printStackTrace();
//				}
//
//			}
//
//			private static final String URL = "jdbc:mysql://localhost:3306/testdb";
//			private static final String USER = "root";
//			private static final String PASSWORD = "macpassword007";
//			private static String INSTRUCTIONS = new String();
//
//			public static Connection getConnection() throws SQLException
//			{
//				return DriverManager.getConnection(URL, USER, PASSWORD);
//			}
//
//			public static void resetDatabase() throws SQLException
//			{
//				String s            = new String();
//				StringBuffer sb = new StringBuffer();
//
//				try
//				{
//					FileReader fr = new FileReader(new File("jdbc:mysql://localhost:3306/testdb/profile.sql"));
//					// be sure to not have line starting with "--" or "/*" or any other non aplhabetical character
//
//					BufferedReader br = new BufferedReader(fr);
//
//					while((s = br.readLine()) != null)
//					{
//						sb.append(s);
//					}
//					br.close();
//
//					// here is our splitter ! We use ";" as a delimiter for each request
//					// then we are sure to have well formed statements
//					String[] inst = sb.toString().split(";");
//
//					Connection c = Databases.getConnection(getConnection();
//					Statement st = c.createStatement();
//
//					for(int i = 0; i<inst.length; i++)
//					{
//						// we ensure that there is no spaces before or after the request string
//						// in order to not execute empty statements
//						if(!inst[i].trim().equals(""))
//						{
//							st.executeUpdate(inst[i]);
//							System.out.println(">>"+inst[i]);
//						}
//					}
//
//				}
//				catch(Exception e)
//				{
//					System.out.println("*** Error : "+e.toString());
//					System.out.println("*** ");
//					System.out.println("*** Error : ");
//					e.printStackTrace();
//					System.out.println("################################################");
//					System.out.println(sb.toString());
//				}
//
//			}
//
//
//
//	}
//
//
