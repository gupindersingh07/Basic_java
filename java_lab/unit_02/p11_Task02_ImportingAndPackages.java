package Unit_02;
import static java.lang.System.*;
import static java.lang.Math.*;
import Unit_01.Sampleclass;

public class p11_Task02_ImportingAndPackages {

	public static void main(String[] args) {
		out.println("Welcome to package");
		out.println(sqrt(4));
		System.out.println(pow(2,2));
		System.out.println(abs(6.3));
		Sampleclass obj=new Sampleclass();
		System.out.println(obj.a);
	}

}
