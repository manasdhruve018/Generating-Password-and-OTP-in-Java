import java.util.*;
public class GeneratePassword {
	public static void main(String args[]){
		int length=8;
		System.out.println(GeneratingPassword(length));
	}
	static char[] GeneratingPassword(int length){
		System.out.println("Your Password is: ");
		String Capital_Characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_Characters="abcdefghijklmnopqrstuvwxyz";
		String Numbers="0123456789";
		String Special_Characters="!@#$%^&*()-=_+{}[]:;<>.?|/";
		String FINAL = Capital_Characters + Small_Characters + Numbers + Special_Characters;
		Random random=new Random();
		char[] Password=new char[length];
		for(int i=0;i<length;i++){
			Password[i]=FINAL.charAt(random.nextInt(FINAL.length()));
		}
		return Password;
	}
}
