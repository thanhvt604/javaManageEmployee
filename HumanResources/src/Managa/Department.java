package Managa;

public class Department  {

private	String maBoPhan;
int soLuong = 0;
String boPhan;
private String[] listBoPhan= {"Kỹ thuật","Nhân sự","Dự án","Kinh doanh"};
	public Department() {
	}

	public Department(String maBoPhan, String boPhan, int soLuong) {
		this.boPhan=boPhan;
		this.maBoPhan = maBoPhan;
		this.soLuong = soLuong;
	}

	public String getMaBoPhan() {
		return maBoPhan;
	}

	public void setMaBoPhan(String maBoPhan) {
		this.maBoPhan = maBoPhan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	// Hiển thị thông tin bộ phận
	public String toString() {
		return "Mã bộ phận : " + maBoPhan + " || Số Lượng : " + getSoLuong() +" || Tên bộ phận : " + boPhan ;
	}

	public String[] getListBoPhan() {
		return listBoPhan;
	}

	public void setListBoPhan(String[] listBoPhan) {
		this.listBoPhan = listBoPhan;
	}

	

}
