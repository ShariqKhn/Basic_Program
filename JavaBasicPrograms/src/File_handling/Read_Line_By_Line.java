package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class Read_Line_By_Line 
{
	public static void main(String[] args) 
	{
		try
		{
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/Amir/Desktop/abc.txt"));
		
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
			e.printStackTrace();
		}
		

	}
	

}
