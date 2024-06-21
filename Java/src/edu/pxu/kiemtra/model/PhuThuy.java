package edu.pxu.kiemtra.model;

public class PhuThuy extends NhanVat {

	private boolean choi;
	private boolean gay;
	public PhuThuy(String ten, String id, double nangluong, boolean choi, boolean gay) {
		super(ten, id, nangluong);
		this.choi = choi;
		this.gay = gay;
	}
	
	public boolean getChoi() {
		return choi;
	}
	public void setChoi(boolean choi) {
		this.choi = choi;
	}
	public boolean getGay() {
		return gay;
	}
	public void setGay(boolean gay) {
		this.gay = gay;
	}
	@Override
	public String toString() {
		return "PhuThuy [choi=" + choi + ", gay=" + gay + "]";
	}
	
	
	  @Override
	    public void TanCong() {
	        System.out.println("Ban cau lua");
	    }

	    @Override
	    public void DiChuyen() {
	        System.out.println("Cuoi choi bay");
	    }
	    
	    

}
