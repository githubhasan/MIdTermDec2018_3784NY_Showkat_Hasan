package math;


		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

import java.util.Scanner;

public class PrimeNumber
{
	static boolean checkForPrime(int inputNumber)
	{
		boolean isItPrime = true;

		if(inputNumber <= 1)
		{
			isItPrime = false;

			return isItPrime;
		}
		else
		{
			for (int i = 2; i <= inputNumber/2; i++)
			{
				if ((inputNumber % i) == 0)
				{
					isItPrime = false;

					break;
				}
			}

			return isItPrime;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start value : ");

		int start = sc.nextInt();

		System.out.println("Enter the end value : ");

		int end = sc.nextInt();

		int first, second;

		System.out.println("Twin prime numbers between "+start+" and "+end+" :");

		for (int i = start; i <= end; i++)
		{
			first = i;

			second = i + 2;

			if(checkForPrime(first) && checkForPrime(second))
			{
				System.out.println("("+first+", "+second+")");
			}
		}

		sc.close();
	}
}