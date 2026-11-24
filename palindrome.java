class palindrome{
static void isPalindrome(int n)
{
int s=n;
int rev=0;
while(n!=0){
int d=n%10;
rev=rev*10+d;
n=n/10;
}
//System.out.println(rev);
if(s==rev){
System.out.println("the given number is palindrome "+rev);
}else{
System.out.println("the given number is not a palindrome number "+rev);
}
}
public static void main(String []args){
isPalindrome(121);
isPalindrome(123);

}
}