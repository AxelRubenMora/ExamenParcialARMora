package doll;

public class Conv2 {
	private double kilobytes;
	private double bytes;
	
	
	
	public Conv2(double bytes) {
		super();
		this.kilobytes=0;
		this.bytes = bytes;
	}
	public double getKilobytes() {
		return kilobytes;
	}
	public void setKilobytes() {
		this.kilobytes = this.bytes/1000;
	}
	public double getBytes() {
		return bytes;
	}
	public void setBytes(double bytes) {
		this.bytes = bytes;
	}
	
	
}
