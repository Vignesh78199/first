
public class Line {
		String threadId = "";
		String className = "";

		public void setThreadId(String threadId){
			this.threadId = threadId;
		}

		public void setClassName(String className){
			this.className = className;
		}

		public String getThreadId(){
			return this.threadId;
		}

		public String getClassName(){
			return this.className;
		}
		
		public String toString(){
			return "threadId = " + this.threadId +"\n className ="+this.className+"\n";
		}
}
