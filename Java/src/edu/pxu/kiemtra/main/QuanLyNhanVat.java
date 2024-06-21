package edu.pxu.kiemtra.main;

import java.util.ArrayList;
import java.util.List;

import edu.pxu.kiemtra.model.BinhDoan;
import edu.pxu.kiemtra.model.Choi;
import edu.pxu.kiemtra.model.CungTen;
import edu.pxu.kiemtra.model.KyBinh;
import edu.pxu.kiemtra.model.NhanVat;
import edu.pxu.kiemtra.model.PhuThuy;

public class QuanLyNhanVat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<NhanVat> dsnv1 = new ArrayList<NhanVat>();
		KyBinh nv1 = new KyBinh("Phu", 70, new CungTen(70, 300), true, true);
        	dsnv1.add(nv1);
        	KyBinh nv2 = new KyBinh("huy", 55, new CungTen(20, 200), false, true);
        	dsnv1.add(nv2);
        	KyBinh nv3 = new KyBinh("do", 92, new CungTen(100, 500), true, true);
        	dsnv1.add(nv3);
       	 	PhuThuy nv4 = new PhuThuy("Tuan", 63, new Choi(50, 40), true);
        	dsnv1.add(nv4);
        	BinhDoan bd1 = new BinhDoan(1509, "Binh doan tien cong", dsnv1);
        	System.out.println("Danh sach binh doan " + bd1.getTenBD());
        	System.out.println(bd1);
		
		
		
	}

}
