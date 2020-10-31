package File_handling;

import java.io.File;

import java.io.FileReader;


public class Read_data
{
	public static void main(String[] args) throws Exception 
	{
	  FileReader fr=new FileReader(new File("C:\\Users\\Amir\\Desktop\\abc.txt"));
	   
	   int v;
	   while((v=fr.read())!=-1)
	   {
		   System.out.println((char)v);
	   }
	   
		fr.close();
	}
	

}
