package session3_assignment;

import java.util.Scanner;
public class TestPrime {
public static String prime(int num)
{
	String isPrm = "null";

	if(num == 2){
	isPrm = "Prime Nummber";
	}
	for (int i = num-1; i > 1; i--){
	if(num%i == 0){
		isPrm = "Not a Prime Number";
	}
	else
	{
		isPrm = "Prime Nummber";
	}
	}

	//System.out.println(isPrm); 
	return isPrm;
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The number entered : " + num );
		System.out.println(prime(num));
			
	}

}
