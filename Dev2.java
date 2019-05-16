import java.io.*;
import java.util.*;


public class Dev1{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
                //System.out.println("Enter number of tests : ");
		int testCount = sc.nextInt();
		List<int[]> testCases = new ArrayList<>();
		List<Integer> results = new ArrayList<>();
		for(int test=0 ; test < testCount ; test++) {
			//System.out.println("Enter arrayLength : ");
			int arrayLength = sc.nextInt();
                	//System.out.println("Enter result sum : ");
               		int result  = sc.nextInt();
                	int input[] = new int[arrayLength];
                	for( int i = 0 ; i< arrayLength ; i++ ) {
                		//System.out.println("Enter input number : "+(i+1));
                		input[i] = sc.nextInt();
                	}
			testCases.add(input);
			results.add(result);
		}

		for(int test = 0 ; test < testCount ; test++) {
			int input[] = testCases.get(test);
			int arrayLength = input.length;
			int result = results.get(test);
			boolean flag = false;
			for( int i = 0 ; i< arrayLength ; i++ ) {
				//System.out.println("Inside find loop : "+ input[i] );
				int sum = 0; 
				for( int j = i ; j >= 0  ; j-- ) {
					
					sum += input[j];
					//System.out.println("Insdie loop 1 sum : "+sum);
					if (sum == result){ 
                                        	System.out.println((j +1)+" "+(i+1));
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
