import java.io.*;
import java.util.*;
public class Equal extends LogQueryProcess  {
	void Equal(String name,String value) throws FileNotFoundException
	{	
		File file=new File("/home/local/ZOHOCORP/vignesh-pt4085/Desktop/service.txt");
		Scanner scan=new Scanner(file);
		String Line=scan.nextLine();
		String[] stringarray = Line.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		while(scan.hasNextLine())
        {
        int i=0;
             String[] st=scan.nextLine().split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
             List<String> list = new ArrayList<String>();
            list= Arrays.asList(st);
            if(list.contains(value))
            	{
            			for(String s3: list){
                                System.out.println(stringarray[i]+":"+s3);
                                		i++;
            								}
            	}
        	}
		scan.close();
		}
}