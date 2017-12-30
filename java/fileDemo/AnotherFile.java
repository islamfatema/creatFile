package fileDemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.testng.annotations.Test;

public class AnotherFile {
@Test
public void creatFile() {
	System.out.println("Write here :");
	Scanner scan=new Scanner(System.in);
	try {
		String s;
		PrintWriter print=new PrintWriter("/Users/fatemaislam/Documents/dani.txt");
	    s=scan.nextLine();
	    print.append(s);
	    print.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	System.out.println("Written");
}
}
