package sách;

import java.util.Scanner;

public class sach2 {
private String Tensach;
private String Tacgia;
private int NamXB;
private int soluong;

public sach2() {
	
}
public sach2(String Tensach,String Tacgia,int NamXB,int soluong) {
	this.Tensach = Tensach;;
	this.Tacgia = Tacgia;
	this.NamXB = NamXB;
	this.soluong = soluong;
}
public String getTensach() {
	return Tensach;
}
public void setTensach(String Tensach) {
	this.Tensach = Tensach;
}
public String getTacgia() {
	return Tacgia;
}
public void setTacgia(String Tacgia) {
	this.Tacgia = Tacgia;
}
public int getNamXB() {
	return NamXB;
}
public void setNamXB(int NamXB) {
	this.NamXB = NamXB;
}
public int getsoluong() {
	return soluong;
}
public void setsoluong(int soluong) {
	this.soluong = soluong;
}
public void input() {
	Scanner sc = new Scanner(System.in);

	System.out.print("ten sach la: ");
	setTensach(sc.nextLine());
	
	System.out.print("ten tac gia la: ");
	setTacgia(sc.nextLine());
	
	System.out.print("nam xuat ban la: ");
	setNamXB(sc.nextInt());
	
	System.out.print("so luong la: ");
	setsoluong(sc.nextInt());
}
public void output() {
	System.out.println("ten sach la: " + getTensach());
	System.out.println("ten tac gia la: " + getTacgia());
	System.out.println("nam xuat ban la: " + getNamXB());
	System.out.println("so luong la: " + getsoluong());
}
}