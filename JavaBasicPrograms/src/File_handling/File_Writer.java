package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class File_Writer 
{
	public static void main(String[] args) {
		
		try
		{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/Amir/Desktop/abc1.txt",true));
		
		bw.write("Selenium is Automation Tool");
		bw.newLine();
		bw.write("Selenium is Java Based");
		bw.newLine();
		bw.write("Java is Basic Language");
		bw.close();
		
		
		}
		catch(Exception exp)
		{
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}

}
