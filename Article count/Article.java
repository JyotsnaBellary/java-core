
public class Article extends Thread{
	//Your code here
	String line;
	int count;
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Article(String line, Integer count) {
		super();
		this.line = line;
		this.count = count;
	}
	
	public void run() {
		String[] strArray = null;    
		strArray = line.split(" ");  
		for(String i : strArray) {
			if("a".equals(i)) {
				count++;
			}
			else if("an".equals(i)) {
				count++;
			}
			else if("the".equals(i)) {
				count++;
			}
			else {
				continue;
			}
		}
	}
}
