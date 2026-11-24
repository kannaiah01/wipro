import java.util.*;
class circle2{
double findArea(double r){
return Math.PI*r*r;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
circle2 c=new circle2();
double res=c.findArea(r);
System.out.println(res);
}
}