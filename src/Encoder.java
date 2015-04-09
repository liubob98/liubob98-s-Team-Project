import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Encoder
{
	private File file;
	
	public Encoder(String filename){
		file = new File(filename);
	}
	
	public void write(String plaintext)
	{
		try
		{
			PrintWriter writer = new PrintWriter(file);
			for(char x : plaintext.toCharArray()){
				writer.write((char)(x - 350));
			}
			writer.append("\n");
			writer.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> read()
	{
		try
		{
			Scanner scan = new Scanner(file);
			ArrayList<String> arrlist = new ArrayList<String>();
			while(scan.hasNextLine()){
				String s = scan.nextLine();
				String p = "";
				for(char x : s.toCharArray())
				{
					p += (char)(x + 350);
				}
				arrlist.add(p);
			}
			scan.close();
			return arrlist;
		}
		catch (FileNotFoundException swag){
			swag.printStackTrace();
		}
		
		return null;
	}
}