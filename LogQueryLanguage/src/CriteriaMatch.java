import java.io.FileNotFoundException;
import java.io.IOException;
public class CriteriaMatch {
	void CriteriaMatched(String name,String operator,String value) throws ClassNotFoundException, IOException
	{
		Equal equal=new Equal();
		NotEqual notequal=new NotEqual();
		Contains contains=new Contains();
		switch(operator)
			{
				case "=":
					equal.Equal(name,value);
					break;
				case "!=":
					notequal.NotEqual(name, value);
					break;
				case "contains":
					contains.Contains(name, value);
					break;
			}
	}

}
