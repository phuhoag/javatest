package edu.pxu.kiemtra.model;

import java.util.ArrayList;
import java.util.List;

public class BinhDoan  implements Cloneable {

	private int maBD;
    private String tenBD;
    List<NhanVat> dsnv;

    public BinhDoan(int maBD, String tenBD, List<NhanVat> dsnv) {
        this.maBD = maBD;
        this.tenBD = tenBD;
        this.dsnv = dsnv;
    }

    public BinhDoan(int maBD) {
        this.maBD = maBD;
        this.dsnv = new ArrayList<NhanVat>();
    }

    public void addNhanVat(NhanVat nv) throws CloneNotSupportedException {
        NhanVat tam = (NhanVat) nv.clone();
        this.dsnv.add(tam);
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public String getTenBD() {
        return tenBD;
    }

    public void setTenBD(String tenBD) {
        this.tenBD = tenBD;
    }

    public List<NhanVat> getDsnv() {
        return dsnv;
    }

    public void setDsnv(List<NhanVat> dsnv) {
        this.dsnv = dsnv;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "maBD=" + maBD + ", tenBD=" + tenBD + ", dsnv=" + dsnv + '}';
    }
	    
}
