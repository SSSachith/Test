
public class Main {

	public static void main(String[] args) {
		
		
		Class1 cl1 = new Class1();
		Class2 cl2 = new Class2();
		
		long previousTime;
		long timeDiff;
		
		
		previousTime = System.currentTimeMillis();
		cl1.processOne();
		timeDiff = System.currentTimeMillis() - previousTime;
		System.out.println("Process processOne of class Class1 ran for "+timeDiff+" milliseconds");
		
		previousTime = System.currentTimeMillis();
		cl1.processTwo();
		timeDiff = System.currentTimeMillis() - previousTime;
		System.out.println("Process processTwo of class Class1 ran for "+timeDiff+" milliseconds");
		
		previousTime = System.currentTimeMillis();
		cl2.processOne();
		timeDiff = System.currentTimeMillis() - previousTime;
		System.out.println("Process processOne of class Class2 ran for "+timeDiff+" milliseconds");
		
		previousTime = System.currentTimeMillis();
		cl2.processTwo();
		timeDiff = System.currentTimeMillis() - previousTime;
		System.out.println("Process processTwo of class Class2 ran for "+timeDiff+" milliseconds");
		
	}

}
