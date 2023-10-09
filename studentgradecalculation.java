package codsoft__project;

import java.util.Scanner;

public class studentgradecalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Subjects:");
		int numsubjects = sc.nextInt();
		int[] marks =new int[numsubjects];
		int totalmarks = 0;
		for(int i=0;i<numsubjects;i++)
		{
		System.out.println("Enter marks obtained in each subjects   "+(i+1) +"  :");	
		marks[i]= sc.nextInt();
		totalmarks += marks[i];
		}
		double averagePercentage = (double) totalmarks/(numsubjects*100)*100;
		System.out.println("result");
		System.out.println(" total marks:"+ totalmarks);
		System.out.println("average Percentage: "+ averagePercentage + "%");
		String grade = calculateGrade(averagePercentage);
		System.out.println("Grade:" + grade);
		sc.close();
	}

	public static String calculateGrade(double Percentage)
	{
		
		if (Percentage>=90)
		{
		return "A+";
	}
		else if
		(Percentage>=80)
		{
		return "A";
	}
		else if
		(Percentage>=70)
		{
		return "B";
	}
		else if 
		(Percentage>=60)
		{
		return "c";
	}
		else if 
		(Percentage>=50)
		{
		return "D";
	}
		else
		{
		return "F";
	}
	}


}
