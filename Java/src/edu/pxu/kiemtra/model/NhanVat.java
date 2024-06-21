package edu.pxu.kiemtra.model;




public class NhanVat implements HanhDong {

    private String ten;
    private String id;
    private double nangluong;

    
        public NhanVat(String ten, String id, double nangluong) {
        this.ten = ten;
        this.id = id;
        this.nangluong = nangluong;
    }

   
    public String getTen() {
        return ten;
    }

   
    public void setTen(String ten) {
        this.ten = ten;
    }

    
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

    
    public double getNangluong() {
        return nangluong;
    }

   
     
    public void setNangluong(double nangluong) {
        this.nangluong = nangluong;
    }

   
    @Override
    public void DiChuyen() {
        System.out.println("NhânVat đang di chuyển");
    }

    public void TanCong() {
        System.out.println("nhan vat tan cong");
    }

    
    @Override
    public String toString() {
        return "NhanVat [ten=" + ten + ", id=" + id + ", nangluong=" + nangluong + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
