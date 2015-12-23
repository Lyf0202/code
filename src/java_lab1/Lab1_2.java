package java_lab1;


/**
 * 第二次修改
 */
import java.util.Scanner;

public class Lab1_2 {

	
	public static void showCountNum(double startingNum,double increase,int days){	
		for(int i = 1;i<=days;i++){
			System.out.print("Day "+i+": ");
			startingNum = startingNum * (1 + increase);
			System.out.println(startingNum);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startingNum = 0;
		double increase = 0;
		int days = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the starting number of organism:");
		startingNum = in.nextDouble();
		System.out.print("Enter the daily increase(percentage):");
		increase = in.nextDouble();
		System.out.print("Enter the number of days:");
		days = in.nextInt();
		while(startingNum < 2 || increase < 0 || days < 1){
			System.out.println("The input is invalid!");
			System.out.print("Enter the starting number of organism:");
			startingNum = in.nextDouble();
			System.out.print("Enter the daily increase(percentage):");
			increase = in.nextDouble();
			System.out.print("Enter the number of days:");
			days = in.nextInt();
		}
		System.out.println();
		showCountNum(startingNum, increase, days);
	}

}
