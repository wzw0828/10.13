class Cmath{
    public static void  power(int x,int n){
        int sum=1;
        for(int i=1;i<=n;i++){
        sum*+n; 
        }
        System.out.println(x+"的"+n+"次方="+sum);
   }
}
public class class07{
	public static void main(String[] args) {
	    Cmath.power(2,5);
	    Cmath.power(3,2);
	}
}
