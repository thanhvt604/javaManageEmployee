package Managa;

class Employee extends Staff implements ICalculator {
	private int gioLamThem;
	public int getGioLamThem() {
		return gioLamThem;
	}

	public void setGioLamThem(int gioLamThem) {
		this.gioLamThem = gioLamThem;
	}

	public static final int LUONG_CB=3000000;
	public static final int LUONG_NG=200000;
	public Employee() {

	}

	public Employee(String maNV, String tenNV, int tuoiNV, int heSoLuong, String ngayVaoLam, String boPhan,
			int nghiPhep,int gioLamThem) {
		super(maNV, tenNV, tuoiNV, heSoLuong, ngayVaoLam, boPhan, nghiPhep);
			this.gioLamThem=gioLamThem;
		// TODO Auto-generated constructor stub
	}
	// Hiển thi thông tin nhân viên
	public void displayInformation() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n",getMaNV(),getTenNV(),getTuoiNV(),getHeSoLuong(),getNgayVaoLam(),getBoPhan(),getNghiPhep());

	}

	@Override
	public int calculateSalary() {
		return LUONG_CB*getHeSoLuong()+gioLamThem*LUONG_NG;
	}
	
}