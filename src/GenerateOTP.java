import java.util.*;
public class GenerateOTP {
	public static void main(String args[]){
		int length=5;
		System.out.println(GeneratingOTP(length));
	}
	static char[] GeneratingOTP(int length){
		System.out.println("One Time Password is: ");
		String Numbers="0123456789";
		Random random=new Random();
		char[] OTP=new char[length];
		for(int i=0;i<length;i++){
			OTP[i]=Numbers.charAt(random.nextInt(Numbers.length()));
		}
		return OTP;
	}
}
