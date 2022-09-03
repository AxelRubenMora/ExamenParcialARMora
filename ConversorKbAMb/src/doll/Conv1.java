package doll;

public class Conv1 {
	
	private double kylobyte;
	private double megabytes;
	
	public Conv1(double kylobyte) {
		super();
		this.kylobyte = kylobyte;
		this.megabytes = 0;
	}
	public double getKylobyte() {
		return kylobyte;
	}
	public void setKylobyte(double kylobyte) {
		this.kylobyte = kylobyte;
	}
	public double getMegabytes() {
		return megabytes;
	}
	public void setMegabytes() {
		this.megabytes = this.kylobyte/1000;
	}
	
	
}
