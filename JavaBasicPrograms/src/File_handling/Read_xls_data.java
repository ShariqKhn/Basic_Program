package File_handling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class Read_xls_data 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		Workbook wk=Workbook.getWorkbook(new File("C:/Users/Amir/Desktop/xyz.xls"));
		
			Sheet s=wk.getSheet(0);
			
		    int r=s.getRows();
			int c=s.getColumns();
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					Cell c1=s.getCell(j,i);
					System.out.println(c1.getContents());
					
			}
				
		}
			
			System.out.println(wk.getClass());
			System.out.println(s.getClass()); 
			
			
		
		
	}

}
