package com.brillio.training.entity;

//By pressing F4 on television , we can see that television is inherited from product and product is inherited from object
//Hence product is a superclass of television , and object is a superclass of only product and not television
public class Television extends product {
private int size; //in inchs
private String screenType; // TFT,LCD,LED,CRT,PLASMA,PROJECTION
//private String resolution; //1080*720

public Television() {
	// TODO Auto-generated constructor stub
}
public Television(int productId, String productName, double unitPrice, int size, String screenType) {
	//super is a keyword used for calling superclass constructor
	//only one super keyword can be used at a time
	//constuctor call must be the first one,that is super must be in first otherwise it would result in error
	super(productId, productName, unitPrice);
	this.size = size;
	this.screenType = screenType;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getScreenType() {
	return screenType;
}
public void setScreenType(String screenType) {
	this.screenType = screenType;
}
//override is used only when we use the function with the same function name from inherited classes 
@Override
public String toString() {
	return super.toString()+ "Television [size=" + size + ", screenType=" + screenType + "]";
}
//this method overwrites the inherited print() method
//from the product class. We use an annotation @override
//to inform the compiler to check if it is really overriding
@Override
public void print(){
	
	System.out.println("size     :"+size);
	System.out.println("screen type     :"+screenType);
	super.print();
}
}
