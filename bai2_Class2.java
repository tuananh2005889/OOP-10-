package meomeo;

import java.util.Scanner;
public class cat2 {
	private String Ten;
	private String Giong;
	private String Gioitinh;
	private int Tuoi;
	
	public cat2() {
		
	}
	public cat2(String Ten, String Giong, String Gioitinh, int Tuoi) {
		this.Ten = Ten;
		this.Giong = Giong;
		this.Gioitinh = Gioitinh;
		this.Tuoi = Tuoi;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String Ten) {
		this.Ten = Ten;
}
	public String getGiong() {
		return Giong;
	}
	public void setGiong(String Giong) {
		this.Giong = Giong;
}
	public String getGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(String Gioitinh) {
		this.Gioitinh = Gioitinh;
}
	public int getTuoi() {
		return Tuoi;
	}
	public void setTuoi(int Tuoi) {
		this.Tuoi = Tuoi;
}
	public void input()  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("tên con mèo là: ");
		setTen(sc.nextLine());
		
	    System.out.print("Giống mèo: ");
	    setGiong(sc.nextLine());
	    
	    System.out.print("Giới tính mèo là: ");
	    setGioitinh(sc.nextLine());
	
	    System.out.print("tuổi mèo là: ");
	    setTuoi(sc.nextInt());
	}
	public void output() {
		System.out.println("tên mèo là: " + getTen());
		System.out.println("Giống mèo: " + getGiong());
		System.out.println("Giới tính mèo là: " + getGioitinh());
		System.out.println("tuổi mèo là: " + getTuoi());
		// giới tính mèo chỉ có đực với cái k có gay nhe :)))
	}
}