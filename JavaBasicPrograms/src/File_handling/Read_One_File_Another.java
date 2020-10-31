package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Read_One_File_Another 
{
	public static void main(String[] args) 
	{
		
		try
		{
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/Amir/Desktop/abc5.txt"));
		
        String str;
		
		while((str=br.readLine())!=null)
		{
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/Amir/Desktop/abc8.txt",true));
		
		bw.write(str);
		bw.newLine();
		bw.close();
		
	
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
