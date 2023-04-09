package baitaplab3;

public class Test3_2 {
	public static void main(String[] args) {
		TamGiac tg = new TamGiac(0, 0);
		tg.nhapTG();
		tg.inTG();
		tg.kiemTra();
		tg.tinhCV();
		tg.tinhDT();
		System.out.println("--------");
		DuongTron dt= new DuongTron(0, 0);
		dt.nhapDT();
		dt.inDT();
		dt.tinhCVDT();
		dt.tinhDTDT();
	}
}
