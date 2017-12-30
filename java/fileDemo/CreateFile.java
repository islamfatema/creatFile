package fileDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		System.out.println("Write here :");
	Scanner scan=new Scanner(System.in);
	try {
		String s;
		PrintWriter print=new PrintWriter("/Users/fatemaislam/Documents/newfile.txt");
		s=scan.nextLine();
		print.append(s);
		print.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	System.out.println("Written:");
	}

}
