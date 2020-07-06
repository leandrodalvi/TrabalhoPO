package TrabalhoPO;

public class Result {
	
		private long time;
	private String description;
	
	public Result(long time, String description) {
		super();
		this.time = time;
		this.description = description;
		
	}
		
	
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
