package edu.pxu.kiemtra.model;

public class Choi   extends VuKhi  {

	private int phep;
	private double tocdobay;
	public Choi(int phep, double tocdobay) {
		super();
		this.phep = phep;
		this.tocdobay = tocdobay;
	}
	public int getPhep() {
		return phep;
	}
	public void setPhep(int phep) {
		this.phep = phep;
	}
	public double getTocdobay() {
		return tocdobay;
	}
	public void setTocdobay(double tocdobay) {
		this.tocdobay = tocdobay;
	}
	@Override
	public String toString() {
		return "Choi [phep=" + phep + ", tocdobay=" + tocdobay + "]";
	}
	@Override
	public double sucTanCong() {
		// TODO Auto-generated method stub
		return  phep * 5;
	}
	
	
	
	
}
