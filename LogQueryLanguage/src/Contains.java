import java.io.*;
import java.util.*;
public class Contains extends LogQueryProcess {
	void Contains(String name,String value) throws FileNotFoundException
	{
		int pos = 0;
		File file=new File("/home/local/ZOHOCORP/vignesh-pt4085/Desktop/service.txt");
		Scanner scan=new Scanner(file);
		String Line=scan.nextLine();
		String[] stringarray = Line.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		for(int i=0;i<stringarray.length;i++)
		{
			if(stringarray[i].equals(name))
				{
				pos=i;	
				}									
		}
		while(scan.hasNextLine())
        {	int count1=0,i=0;
             String[] st=scan.nextLine().split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
             List<String> list = new ArrayList<String>();
             list= Arrays.asList(st);
             for(int j=0;j<st.length;j++)
				{
					if(st[pos].contains(value))
					{
						count1++;	
					}	
				}
				if(count1>0)
				{
				for(String s3: list){
					System.out.println(stringarray[i]+":"+s3);
						i++;
				}						
			}
				count1=0;
        }
		scan.close();
	}
}
