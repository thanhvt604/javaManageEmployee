package Managa;

import java.util.Scanner;

// Lớp cha trừu tượng  
abstract class Staff {

	public static Scanner sc = new Scanner(System.in);

	private String maNV;
	private String tenNV;
	private int tuoiNV;
	private int heSoLuong;
	private String ngayVaoLam;
	private String boPhan;
	private int nghiPhep;

	public Staff() {

	}

	public Staff(String maNV, String tenNV, int tuoiNV, int heSoLuong, String ngayVaoLam, String boPhan, int nghiPhep) {

		this.maNV = maNV;
		this.tenNV = tenNV;
		this.tuoiNV = tuoiNV;
		this.heSoLuong = heSoLuong;
		this.ngayVaoLam = ngayVaoLam;
		this.boPhan = boPhan;
		this.nghiPhep = nghiPhep;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public int getTuoiNV() {
		return tuoiNV;
	}

	public void setTuoiNV(int tuoiNV) {
		this.tuoiNV = tuoiNV;
	}

	public int getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(int heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getNgayVaoLam() {
		return ngayVaoLam;
	}

	public void setNgayVaoLam(String ngayVaoLam) {
		this.ngayVaoLam = ngayVaoLam;
	}

	public String getBoPhan() {
		return boPhan;
	}

	public void setBoPhan(String boPhan) {
		this.boPhan = boPhan;
	}

	public int getNghiPhep() {
		return nghiPhep;
	}

	public void setNghiPhep(int nghiPhep) {
		this.nghiPhep = nghiPhep;
	}
	// Hiển thị thông tin nhân viên
	
	abstract void displayInformation();
	
}
