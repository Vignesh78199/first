import java.io.*;
import java.util.*;
public class NotEqual extends LogQueryProcess{
	synchronized void NotEqual(String name,String value) throws IOException, ClassNotFoundException
	{
		serial obj=new serial();
		File file=new File("/home/local/ZOHOCORP/vignesh-pt4085/Desktop/service.txt");
		Scanner scan=new Scanner(file);
		String Line=scan.nextLine();
		String[] stringarray = Line.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		while(scan.hasNextLine())
        {
			int i=0;
			obj.str1=scan.nextLine();
			File fi=new File("obj.txt");	
			FileOutputStream fos=new FileOutputStream(fi);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
			FileInputStream fis=new FileInputStream(fi);
			ObjectInputStream ois=new ObjectInputStream(fis);
			serial obj1=(serial)ois.readObject();
			System.out.println(obj1);
             String[] st=scan.nextLine().split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
             List<String> list = new ArrayList<String>();
            list= Arrays.asList(st);
            if(!(list.contains(value)))
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
