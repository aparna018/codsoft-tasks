package codsoft__project;

import java.util.Scanner;

public class numbergame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances=9;
		int finals=0;
		boolean playagain=true;
		System.out.println("Welcome buddy!");
		System.out.println("hey buddy you have about  " +chances+"  to win the game");
		while(playagain) {
			int rand =getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++)
			{
				System.out.println("chance"+(i+1) + "  Enter your guess:");
				int user =sc.nextInt();
						if (user==rand) {
							guess=true;
							finals+=1;
							System.out.println("you won.");
							break;
						}
						else if (user>rand) {
							System.out.println("too high");
						}
						else {
							System.out.println("too low");
						}
					}
			if(guess==false) {
				System.out.println("sorry buddy.you lost the chances.The Number is "+rand);
				}
			System.out.println("do you want to play again(y/n)");
			String pA=sc.next();
			playagain=pA.equalsIgnoreCase("y");
		}
		System.out.println("that's it buddy");
		System.out.println("Here your score"+finals);
	}
		public static int getrandN(int min,int max)
		{
			return (int)(Math.random()*(max-min+1)+min);
			
		}
	}



