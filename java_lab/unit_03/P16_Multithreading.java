package Unit_03;
import java.util.Scanner;

public class P16_Multithreading {
public static void main(String args[]) {
//	c1 obj1=new c1();
//	c2 obj2=new c2();
//	obj1.show1();
//	obj2.show2();
	//after creating the objects of thread it get add to the JVM queue.
	Thread t1=new Thread(new T1(),"T1");
	Thread t2=new Thread(new T2(),"T2");
	Thread t3=new Thread(new T3(),"T3");
	t1.start();
	t2.start();
	t3.start();

}
}
//class c1{
//	void show1() {
//		Scanner sc = new Scanner(System.in);
//		int r=sc.nextInt();
//		System.out.println(r);
//		System.out.println("Done with show1()!");
//		sc.close();
//	}
//}
//class c2{
//	void show2() {
//		for(int i=0;i<10;i++) {
//			System.out.println(i +"-hey ");
//		}
//	}
//}

class T1 extends Thread{
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(r);
      //System.out.println("Done with show1()!");
      System.out.println(Thread.currentThread().getName());
		sc.close();
	}
}
//user can only do three things:-
//1.identify the dependent and independent task in respective process or our code can be parallel executed. 
//2.insert selective task into thread 
//3.start those threads.
//multi-threading is not a concept of a java.
//threads operates with the help of JVM.
//threads contain:-
//1.independent code.
//2.upper most branch of the tree.
//3.
class T2 extends Thread{
//	//method overriding.
//	//why use only run method?
//	// because until compiler find run method in the thread it does not get add to JVM.
	public void run() {
		for(int i=0;i<10;i++) {
			//System.out.println(i+"-hey ");
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class T3 extends Thread{
	//method overriding.
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}