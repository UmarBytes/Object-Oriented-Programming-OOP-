import java.io.*;
public class FileOutputLab3{
  	public static void main(String[] args) throws IOException{
  
	PrintWriter output = new PrintWriter("Output-1-3.txt");

	output.println("IQRA");
	output.println("191370242");
	output.println("BS Computer Science");

	output.close();
	System.out.println("Data written to the file named \"output-1-3.txt\".");
  

	}
	
	}
	