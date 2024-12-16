package labprograms;

public class Outer {
	int x;
	void  display() {
		System.out.println("Outer class display x"+x);
		Inner inner = new Inner();
		inner.x=100;
		inner.display();
	}
	class Inner{
		int x;
		void display() {
			System.out.println("inner display x"+x);
		}
	}
	public static void main(String[] args) {	
		Outer out= new Outer();
		out.x=200;
		out.display();

	}

}
