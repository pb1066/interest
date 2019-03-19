package interest;
import java.io.*;

public class interest {
	public static void main(String[] args) {
		double a;
		a=SimpleInterest(100.0,2.0,2.0);
		System.out.println(a);
		
		
	}
	public static double SimpleInterest(double principal,double rate,double time) {
		double si;
		si=principal*rate*time/100;
		return si;
	}
	public static double CompoundInterest(double principal,double rate,double time) {
		double amount;
		amount=principal*(Math.pow((1+(rate/100)),time));
		return amount;
	}

}
