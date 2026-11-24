class perfect{
static void isPerfect(int n){
int sum=0;
for(int i=1;i<=n/2;i++){
if(n%i==0){
sum+=i;
}
}
if(sum==n)
System.out.println(n+ " is perfect number");
else
System.out.println(n+ " is not perfect number");
}
public static void main(String []args){
isPerfect(6);
isPerfect(28);
}
}