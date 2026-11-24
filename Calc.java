package com.test;
import pack.*;
class TestCalc{
public static void main(String[]args){
Calc ob=new Calc();
System.out.println("value of a: "+ob.a);
System.out.println("value of b: "+ob.b);
ob.sum();
ob.sub();
}
}