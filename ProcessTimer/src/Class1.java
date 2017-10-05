
public class Class1 {

	public void processOne() {

		long count = 0;
		for (long i = 0; i < 1000000; i++) {

			i += count;

		}

	}

	public void processTwo() {

		long count = 0;
		for (long i = 0; i < 1000; i++) {

			i += count;

		}
	}
}
