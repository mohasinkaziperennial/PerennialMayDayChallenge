import java.io.*;
import java.util.*;


public class Dev1{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of tests : ");
		int testCount = sc.nextInt();
		for(int test=0 ; test < testCount ; test++) {
			System.out.println("Enter array length : ");
			int arrayLength = sc.nextInt();
			System.out.println("Enter result sum : ");
			int result  = sc.nextInt();
			int input[] = new int[arrayLength];
			for( int i = 0 ; i< arrayLength ; i++ ) {
		                System.out.println("Enter input number : "+(i+1));
				input[i] = sc.nextInt();
			 }

			boolean flag = false;
			for( int i = 0 ; i< arrayLength ; i++ ) {
				//System.out.println("Inside find loop : "+ input[i] );
				int sum = 0; 
				for( int j = i ; j >= 0  ; j-- ) {
					
					sum += input[j];
					//System.out.println("Insdie loop 1 sum : "+sum);
					if (sum == result){ 
                                        	System.out.println("Result : \t"+(j +1)+"\t"+(i+1));
						//Result found flag
						flag = true;
						break;
                                	} else if(sum > result) {
						//System.out.println("Sum Greater, exiting ");
						break;
					}
				}
				if(flag) {
					
					break;
				}else{
				//Continue
				}
			}
		}
	}


}
