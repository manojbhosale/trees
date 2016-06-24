package atgcCounter;

public class BaseCount {

	private int aCount;
	private int tCount;
	private int gCount;
	private int cCount;
	
	
	public BaseCount(int aCount, int tCount, int gCount, int cCount) {
		super();
		this.aCount = aCount;
		this.tCount = tCount;
		this.gCount = gCount;
		this.cCount = cCount;
	}
	public BaseCount() {
		super();
		this.aCount = 0;
		this.tCount = 0;
		this.gCount = 0;
		this.cCount = 0;
	}
	@Override
	public String toString() {
		return "BaseCount [aCount=" + aCount + ", tCount=" + tCount
				+ ", gCount=" + gCount + ", cCount=" + cCount + "]";
	}
	public int getaCount() {
		return aCount;
	}
	public void setaCount(int aCount) {
		this.aCount = aCount;
	}
	public int gettCount() {
		return tCount;
	}
	public void settCount(int tCount) {
		this.tCount = tCount;
	}
	public int getgCount() {
		return gCount;
	}
	public void setgCount(int gCount) {
		this.gCount = gCount;
	}
	public int getcCount() {
		return cCount;
	}
	public void setcCount(int cCount) {
		this.cCount = cCount;
	}
	
	
	
}
