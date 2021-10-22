package Virtualkey;

import java.util.Scanner;

public class Welcome {
	
	public static void welcome() {
		System.out.println("Welcome to Virtual Key for Your Repositories");
		System.out.println("Developer:Samyak Jain");
	}
	
	public static void menu1() {
		System.out.println("1.Show files in Ascending order");
		System.out.println("2.Show file options");
		System.out.println("3.Quit");
	}
	
	public static void menu2() {
		System.out.println("1.Add a file");
		System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Return to main menu");
		System.out.println("5.Quit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		FileFunctions f=new FileFunctions();
		welcome();
		System.out.println(" ");
		boolean flag=true;
		
		while(flag) {
			menu1();
			System.out.println("Enter your choice");
			try {
			
			int choices=sc.nextInt();
			
			switch(choices) {
			case 1:
				System.out.println("Files are:");
				f.showFiles();
				break;
			case 2:
				menu2();
			System.out.println("Enter input");
			
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				f.AddFile();
				continue;
			case 2:
				f.DeleteFile();
				continue;
			case 3:
				f.SearchFile();
				continue;
			case 4:
				continue;
			case 5:
				System.exit(1);
			default:
				System.out.println("Invalid option.Please choose valid option");
				continue;
			}
			
			case 3:
				
				System.out.println("Exit Successfull");
				System.exit(1);
				break;
				
			default:
				System.out.println("Invalid choice.Please Enter a valid choice");
				break;
			}
		}catch(Exception e) {
			System.out.println("Enter valid choice");
			break;
			
		}
		}
		sc.close();

	}

}
