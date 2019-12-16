package com.inja.test;

public class InterfaceEx {

	public static void main(String[] args) {
	 Television tv = new Television("삼성","파브", 65, 3000000);
	 Computer com = new Computer("삼성", "나인", 1300000, 256, 62 );
	 tv.ProudctInfo();
	 com.ProudctInfo();
	 
	}
}

interface ProductInter{
	void ProudctInfo();
}

abstract class Product implements ProductInter{
	String company = "";
	String name = "";
	int price = 0;
	
	public Product(){
		
	}
	
	public Product(String company, String name, int price){
		this.company =company;
		this.name = name;
		this.price = price;
	}
}

class Television extends Product{
	int inchSize = 0;
	
	public Television(){
		
	}
	
	public Television(String company, String name, int inchSize, int price){
		super(company, name, price);
		this.inchSize = inchSize;				
	}
	
	@Override
	public void ProudctInfo() {
		System.out.println("제조사 :" + company + "\rTV명 :" + "\r크기 :" +inchSize+ "인치" + "\r가격 :"+ price);
	}
	
}

class Computer extends Product{
	int hddSize = 0;
	int memorySize = 0;
	
	public Computer (){
		
	}
	
	public Computer(String company, String name, int price, int hddSize, int memorySize){
		super(company, name, price);
		this.hddSize =hddSize;
		this.memorySize =memorySize;
	}
	@Override
	public void ProudctInfo() {
		System.out.println("\r제조사 :" + company + "\r 컴퓨터명 :"+ name + "\r 가격 :" + price + "\r 하드용량 : " + hddSize +"GB"+ "\r 메모리용량 :" + memorySize +"GB");
	}
}