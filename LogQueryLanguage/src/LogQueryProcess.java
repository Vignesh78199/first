import java.io.*;
import java.util.*;
public class LogQueryProcess {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int num=1;
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		while(num>0)
		{
		InputSeparation separate=new InputSeparation();
		String[] ForCriteria=separate.InputSeparate(str);
		String name=ForCriteria[0];
		String operator=ForCriteria[1];
		String value=ForCriteria[2];
		 CriteriaMatch match=new CriteriaMatch();
		 match.CriteriaMatched(name,operator,value);
		 System.out.println("if You want to continue enter one else enter zero ");
			num=sc.nextInt();
			if(num==0)
			{
			break;
			}
			str=sc.nextLine();
			str=sc.nextLine();
		}		
   }
}