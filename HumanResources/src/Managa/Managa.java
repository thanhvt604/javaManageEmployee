package Managa;

public class Managa extends Staff implements ICalculator {
	private String chucVu;
	public static final int LUONG_CB = 5000000;// Lương cơ bản
	public static final int LUONG_TNBL = 8000000;// Lương trách nhiệm Business Leader
	public static final int LUONG_TNPL = 5000000;// Lương trách nhiệm Project Leader
	public static final int LUONG_TNTL = 6000000;// Lương trách nhiệm Teanical Leader
	// tạo biến lương để gán vào return lương;
	int luong = 0;

	public Managa() {

	}

	public Managa(String maNV, String tenNV, int tuoiNV, int heSoLuong, String ngayVaoLam, String boPhan, int nghiPhep,
			String chucVu) {
		super(maNV, tenNV, tuoiNV, heSoLuong, ngayVaoLam, boPhan, nghiPhep);
		this.chucVu = chucVu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	@Override
	// Hiển thị thông tin quản lí
	public void displayInformation() {
		System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", getMaNV(), getTenNV(), getTuoiNV(),
				getHeSoLuong(), getNgayVaoLam(), getBoPhan(), getNghiPhep(), getChucVu());
	}

	@Override
	// Tính lương nếu trùng với chucVu ở class Managa
	public int calculateSalary() {
		if ((chucVu).equals("Business Leader")) {
			luong = getHeSoLuong() * LUONG_CB + LUONG_TNBL;
		} else if ((chucVu).equals("Project Leader")) {
			luong = getHeSoLuong() * LUONG_CB + LUONG_TNPL;
		} else if ((chucVu).equals("Technical Leader")) {
			luong = getHeSoLuong() * LUONG_CB + LUONG_TNTL;
		}
		return luong;
	}

}
