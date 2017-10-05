
public class Class2 {

	
	public void processOne() {

		long count = 0;
		for (long i = 0; i < 10000000; i++) {

			i += count;

		}

	}

	public void processTwo() {

		long count = 0;
		for (long i = 0; i < 10000; i++) {

			i += count;

		}
	}
	
}
