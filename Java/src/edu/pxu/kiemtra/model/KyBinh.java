package edu.pxu.kiemtra.model;

public class KyBinh extends NhanVat implements HanhDong {

	VuKhi vk;
    private boolean giap;
    private boolean ngua;

    
    

    public KyBinh(String ten, String id, double nangluong, VuKhi vk, boolean giap, boolean ngua) {
		super(vk, giap, ngua);
		this.vk = vk;
		this.giap = giap;
		this.ngua = ngua;
	}

	public VuKhi getVk() {
        return vk;
    }

    public void setVk(VuKhi vk) {
        this.vk = vk;
    }

    public boolean getGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public boolean getNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }

    @Override
    public String toString() {
        return "KyBinh{" + super.toString() + "vk=" + vk + ", giap=" + giap + ", ngua=" + ngua + '}';
    }

    @Override
    public void DiChuyen() {
        System.out.println("Phi ngua");
    }

    @Override
    public void TanCong() {
        System.out.println("Ban cung");
    }

    
	    
	
}
