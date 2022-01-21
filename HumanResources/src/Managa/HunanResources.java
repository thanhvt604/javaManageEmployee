package Managa;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HunanResources {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Menu
		System.out.println("*************ỨNG DỤNG QUẢN LÝ NHÂN LỰC******************");
		System.out.println("1.Hiển thị danh sách nhân viên hiện có của công ty");
		System.out.println("2.Hiển thị các bộ phận trong công ty");
		System.out.println("3.Hiển thị nhân viên theo từng bộ phận");
		System.out.println("4.Thêm nhân viên mới vào");
		System.out.println("5.Tìm kiếm nhân viên theo tên hoặc mã nhân viên");
		System.out.println("6.Hiển thị bảng lương toàn công ty");
		System.out.println("7.Hiển thị bảng lương theo thứ tự tăng dần");
		System.out.println("8.Hiển thị bảng lương theo thứ tự giảm dần");
		System.out.println("0.Thoát");

		int button;// biến switch
		

		Department a1 = new Department();
		Scanner sc = new Scanner(System.in);
		// Tạo mảng Object Staff
		List<Staff> list = new ArrayList<>();
	
		// Thêm thông tin nhân viên vào mảng

		Staff s1 = new Employee("E001", "Nguyễn Văn Tân", 30, 2, "27-2-2021", "Kỹ thuật", 6, 1);
		Staff s2 = new Employee("E002", "Trần Văn Kiên", 26, 2, "01-01-2021", "Kỹ thuật", 6, 2);
		Staff s3 = new Employee("E003", "Lê Văn Linh", 23, 2, "01-01-2019", "Nhân sự", 6, 3);
		Staff s4 = new Employee("E004", "Lê Hồng Minh", 25, 2, "01-01-2020", "Kinh doanh", 6, 4);
		// Thêm thông tin quản lí vào mảng
		Staff s5 = new Managa("Q001", "Lê Hải Anh", 19, 3, "25-6-2019", "Kinh doanh", 4, "Business Leader");
		Staff s6 = new Managa("Q002", "Trần Quốc Vinh", 32, 3, "18-6-2020", "Dự án", 4, "Project Leader");
		Staff s7 = new Managa("Q003", "Lê Hải Anh", 19, 3, "25-6-2019", "Kỹ thuật", 5, "Technical Leader");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
	
		

		// Bảng chọn

		do {
			// Chọn số để sử dụng cho menu 1-8
			System.out.print("Bạn chọn : ");
			button = sc.nextInt();
			switch (button) {
			// Hiển thị danh sách nhân viên toàn công ty
			case 1: {

				System.out.println("Hiển thị danh sách nhân viên hiện có trong công ty : ");
				System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
						"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
				System.out.println(
						"==========================================================================================================================================");
				for (Staff o : list) {
					o.displayInformation();
				}
				System.out.println();
				break;
			}
			// Hiển thị bộ phận nhân viên công ty
			case 2: {
				//Tạo Array List bộ phận
			List<Department> list1 = new ArrayList<>();	
			int countKyThuat = 0;// biến đếm bộ phận kỹ thuật
			int countNhanSu = 0;// biến đếm bộ phận nhân sự
			int countDuAn = 0;// biến đếm bộ phận dự án
			int countKinhDoanh = 0;// biến đếm bộ phận kinh doanh
			// Xét vòng lặp để tính ra số lượng nhân viên các phòng ban
				
				// Xét vòng lặp để tính ra số lượng nhân viên các phòng ban
				for (Staff o : list) {
					if (o.getBoPhan().equals("Kinh doanh")) {

						countKinhDoanh++;
						a1.setSoLuong(countKinhDoanh);

					}

				}
				for (Staff o : list) {
					if (o.getBoPhan().equals("Nhân sự")) {

						countNhanSu++;
						a1.setSoLuong(countNhanSu);
					}

				}
				for (Staff o : list) {
					if (o.getBoPhan().equals("Kỹ thuật")) {

						countKyThuat++;
						a1.setSoLuong(countKyThuat);
					}

				}
				for (Staff o : list) {
					if (o.getBoPhan().equals("Dự án")) {

						countDuAn++;
						a1.setSoLuong(countDuAn);
					}

				}
				// thông tin về bộ phận
				Department h1 = new Department("KD",  "Kinh doanh",countKinhDoanh);
				Department h2 = new Department("DA", "Dự án", countDuAn);
				Department h3 = new Department("KT" ,"Kỹ thuật" ,countKyThuat);
				Department h4 = new Department("NS", "Nhân sự",countNhanSu );
				list1.add(h1);
				list1.add(h2);
				list1.add(h3);
				list1.add(h4);

			
				// Xét biển đếm qua vòng lặp ArrayList

				System.out.println("Thông tin về bộ phận công ty");
				for (Department o : list1) {
					System.out.println(o);
				}
				break;

			}
			// Hiển thị thông tin nhân viên theo bộ phận
			case 3: {

				int buttonBP;
				// Nhập từ 1 đến 4 để tìm bộ phận , nhập 0 đế thoát
				do {

					System.out.println(
							"Nhập bộ phận cần tìm : 1.Bộ phận kinh doanh , 2.Bộ phận nhân sự , 3.Bộ phận dự án, 4.Bộ phận kỹ thuật , 0.Thoát");
					System.out.print("Bạn chọn bộ phận : ");
					buttonBP = sc.nextInt();
					switch (buttonBP) {
					case 1: {
						System.out.println("Hiển thị nhân viên bộ phận kinh doanh");
						System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
								"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
						System.out.println(
								"=========================================================================================================================");
						for (Staff o : list) {
							if (o.getBoPhan().equals("Kinh doanh")) {
								o.displayInformation();
							}
						}
						break;
					}
					case 2: {

						System.out.println("Hiển thị nhân viên bộ phận nhân sự");
						System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
								"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
						System.out.println(
								"=====================================================================================================================");
						for (Staff o : list) {
							if (o.getBoPhan().equals("Nhân sự")) {
								o.displayInformation();
							}
						}
						break;
					}
					case 3: {

						System.out.println("Hiển thị nhân viên bộ phận dự án");
						System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
								"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
						System.out.println(
								"============================================================================================================================");
						for (Staff o : list) {
							if (o.getBoPhan().equals("Dự án")) {
								o.displayInformation();
							}
						}
						break;
					}
					case 4: {

						System.out.println("Hiển thị nhân viên bộ phận kỹ thuật");
						System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
								"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
						System.out.println(
								"=================================================================================================================================");
						for (Staff o : list) {
							if (o.getBoPhan().equals("Kỹ thuật")) {
								o.displayInformation();
							}
						}
						break;
					}
					}
				} while (buttonBP != 0);

				break;
			}
			// Nhập thêm nhân viên hoặc quản lí vào Bảng
			case 4:

			{
				System.out.println("Nhập quản lí chọn b, nhập nhân viên chọn a");
				// Nhập nhân viên
				if (sc.next().equals("a")) {

					System.out.print("Nhập mã nhân viên : ");
					String maNV = sc.next();
					sc.nextLine();
					System.out.print("Nhập tên nhân viên : ");
					String tenNV = sc.nextLine();
					System.out.print("Nhập tuổi nhân viên : ");
					int tuoiNV = sc.nextInt();
					System.out.print("Nhập hệ số lương : ");
					int heSoLuong = sc.nextInt();
					System.out.print("Nhập ngày vào làm : ");
					String ngayVaoLam = sc.next();
					sc.nextLine();
					System.out.print("Nhập bộ phận : ");
					String boPhan = sc.nextLine();
					boolean z = false;
					for (int i = 0; i < a1.getListBoPhan().length; i++) {
						if (boPhan.equals(a1.getListBoPhan()[i])) {
							z = true;
						}
					}
					while (z == false) {
						System.out.print("Bộ phận không có trong danh sách vui lòng nhập lại : ");
						boPhan = sc.nextLine();
						for (int i = 0; i < a1.getListBoPhan().length; i++) {
							if (boPhan.equals(a1.getListBoPhan()[i])) {
								z = true;
							}
						}
					}
					System.out.print("Nhập số ngày nghỉ phép : ");
					int nghiPhep = sc.nextInt();
					System.out.print("Nhập số giờ làm thêm : ");
					int gioLamThem = sc.nextInt();
					System.out.println();

					list.add(new Employee(maNV, tenNV, tuoiNV, heSoLuong, ngayVaoLam, boPhan, nghiPhep, gioLamThem));
					break;
				} else {
					// Nhập quản lí
					System.out.print("Nhập mã quản lí : ");
					String maNV = sc.next();
					sc.nextLine();
					System.out.print("Nhập tên nhân viên : ");
					String tenNV = sc.nextLine();
					System.out.print("Nhập tuổi nhân viên : ");
					int tuoiNV = sc.nextInt();
					System.out.print("Nhập hệ số lương : ");
					int heSoLuong = sc.nextInt();
					System.out.print("Nhập ngày vào làm : ");
					String ngayVaoLam = sc.next();
					sc.nextLine();
					System.out.print("Nhập bộ phận : ");
					String boPhan = sc.nextLine();
					// tạo z để xét đúng sai trùng với nhập hay ko
					boolean z = false;
					// duyệt mảng trong Department nếu trùng với nhập boPhan thì z= true
					for (int i = 0; i < a1.getListBoPhan().length; i++) {
						if (boPhan.equals(a1.getListBoPhan()[i])) {
							z = true;
						}
					}
					// không trùng thì nhập lại
					while (z == false) {
						System.out.print("Bộ phận không có trong danh sách vui lòng nhập lại : ");
						boPhan = sc.nextLine();
						for (int i = 0; i < a1.getListBoPhan().length; i++) {
							if (boPhan.equals(a1.getListBoPhan()[i])) {
								z = true;
							}
						}
					}
					System.out.print("Nhập số ngày nghỉ phép : ");
					int nghiPhep = sc.nextInt();
					sc.nextLine();
					System.out.print("Nhập chức vụ : ");
					String chucVu = sc.nextLine();
					while(!chucVu.equals("Business Leader")&&!chucVu.equals("Project Leader")&&!chucVu.equals("Technical Leader")) {
						System.out.print("Chức vụ không có vui lòng nhập lại 1 trong những chức vụ sau:[Business Leader,Project Leader,Technical Leader] ");
						chucVu = sc.nextLine();
					}
					System.out.println();
					list.add(new Managa(maNV, tenNV, tuoiNV, heSoLuong, ngayVaoLam, boPhan, nghiPhep, chucVu));
					break;
				}

			}
			// Tìm nhân viên theo mã hoặc tên
			case 5: {

				System.out.println("Nhập tên hoặc mã nhân viên bạn muốn tìm : ");
				sc.nextLine();
				String find = (sc.nextLine()).toLowerCase();
				for (Staff o : list) {
					// nếu Mã nhân viên trùng với find thì hiển thị , có thể nhập chữ hoa hoặc
					// thường
					if ((find.equals((o.getMaNV()).toLowerCase()) | find.equals((o.getTenNV()).toLowerCase()))) {
						System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", "Mã Nhân Viên", "Tên Nhân Viên",
								"Tuổi Nhân Viên", "Hệ Số Lương", "Ngày vào làm", "Bộ phận", "Nghỉ phép", "Chức vụ");
						System.out.println(
								"==========================================================================================================================================");
						o.displayInformation();
					}
				}
				break;
			}
			// Hiển thị bảng lương của nhân viên công ty
			case 6: {
				System.out.println("Bảng lương nhân viên bao gồm mã nhân viên , tên ,lương : ");
				for (Staff o : list) {
					System.out.print(o.getMaNV() + " ");
					System.out.printf("%-20s", o.getTenNV());
					System.out.println(((ICalculator) o).calculateSalary());

				}
				break;
			}
			// Hiển thị bảng lương tăng dần
			case 7: {
				System.out.println("Bảng lương nhân viên tăng dần bao gồm mã nhân viên , tên ,lương : ");

				Collections.sort(list, new Comparator<Staff>() {

					public int compare(Staff d1, Staff d2) {

						return Integer.compare(((ICalculator) d1).calculateSalary(),
								(((ICalculator) d2).calculateSalary()));
					}
				});
				for (Staff o : list) {
					System.out.print(o.getMaNV() + " ");
					System.out.printf("%-20s", o.getTenNV());
					System.out.println(((ICalculator) o).calculateSalary());
				}
				break;
			}
			// Hiển thị bảng lương giảm dần
			case 8: {
				System.out.println("Bảng lương nhân viên giảm dần bao gồm mã nhân viên , tên ,lương : ");
				Collections.sort(list, new Comparator<Staff>() {
					public int compare(Staff d1, Staff d2) {
						return Integer.compare(((ICalculator) d2).calculateSalary(),
								(((ICalculator) d1).calculateSalary()));
					}
				});
				for (Staff o : list) {
					System.out.print(o.getMaNV() + " ");
					System.out.printf("%-20s", o.getTenNV());	
					System.out.println(((ICalculator) o).calculateSalary());
				
				}
				break;
			}
			}

		} while (button != 0); // Nếu trường nhập button =0 thì kết thúc
		System.out.println("Kết thúc chương trình!");

	}
}
