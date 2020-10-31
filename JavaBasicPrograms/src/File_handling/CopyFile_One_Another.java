package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile_One_Another 
{
	public static void main(String[] args) 
	{
		
		try
		{
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/Amir/Desktop/abc5.txt"));
			
			bw.write("Hi My Self Shariq");
			bw.newLine();
			bw.write("I'm a Software Enginer");
			bw.close();
		}
		
		catch(Exception exp)
		{
			exp.getCause();
			exp.getMessage();
			exp.printStackTrace();
		}
		
		
		try
		{
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/Amir/Desktop/abc5.txt"));
		
           String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
			
			
		}
		catch(Exception e)
		{
			e.getMessage();
			e.getCause();
			
		}
		
		
	}

}
