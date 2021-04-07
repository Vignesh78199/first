import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Line> lineList=new ArrayList<Line>();
		Line lineOne=new Line();
		Line lineTwo=new Line();
		lineOne.setThreadId("one");
		lineTwo.setThreadId("two");
		lineOne.setClassName("classOne");
		lineTwo.setClassName("classTwo");
		lineList.add(lineOne);
		lineList.add(lineTwo);
		System.out.println(lineList);
		for(Line line:lineList)
		{
			if(line.isCriteriaMatched(null, null, null))
			{
				System.out.println();
			}
		}
			
		

	}

}
