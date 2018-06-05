package com;
interface A{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void a(){System.out.println("NAME-SUTAPA");}  
}  
  
class M extends B{  
public void b(){System.out.println("DEPARTMENT-ECE");}  
public void c(){System.out.println("ROLLNO-112");}  
public void d(){System.out.println("COMPANY-PROLIFICS");}  
}  
  
class test{  
public static void main(String args[]){  
A ob=new M();  
ob.a();  
ob.b();  
ob.c();  
ob.d();  
}}  