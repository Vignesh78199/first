import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ObjectText {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("obj.txt");
		Scanner scan=new Scanner(file);
		while(scan.hasNextLine())
		{
			 System.out.println(scan.nextLine());
            	
        	
		}
		scan.close();
	}

}
