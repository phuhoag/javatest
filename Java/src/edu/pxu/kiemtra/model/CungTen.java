package edu.pxu.kiemtra.model;

public class CungTen extends VuKhi {
	
	private int soluong;
	private double tamban;
	public CungTen(int soluong, double tamban) {
		super();
		this.soluong = soluong;
		this.tamban = tamban;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public double getTamban() {
		return tamban;
	}
	public void setTamban(double tamban) {
		this.tamban = tamban;
	}
	@Override
	public String toString() {
		return "CungTen [soluong=" + soluong + ", tamban=" + tamban + "]";
	}
	@Override
	public double sucTanCong() {
		// TODO Auto-generated method stub
		return tamban * 4;
	}
	
	
	
}
