import java.io.*;
import java.util.*;


public class Dev2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
                //System.out.println("Enter number of tests : ");
		int testCount = sc.nextInt();
		List<int[]> testCases = new ArrayList<>();

		for(int test=0 ; test < testCount ; test++) {
                        System.out.println("Enter arrayLength : ");
                        int arrayLength = sc.nextInt();
                        int input[] = new int[arrayLength];
                        for( int i = 0 ; i< arrayLength ; i++ ) {
                                System.out.println("Enter input number : "+(i+1));
                                input[i] = sc.nextInt();
                        }
                        testCases.add(input);
                }
		
		for( int[] input : testCases){
			int  lenght  = input.length - 1;
			

			for(int i = 0; i <= length; i++) {

				int sumLeft = 0;
				int sumRight = 0;
				for( int j = i ; j >= 0  ; j-- ) {
                                        sumLeft += input[j];
				}

				for( int j = length ; j >  i  ; j-- ) {
                                        sumright += input[j];
					if(sumLeft <= sumRight){
						if( sumLeft == sumRight){
							System.out.println(i+1 +" " length+1-1);
						}	
					break;
					}
				}
			}

		}


	}
}
