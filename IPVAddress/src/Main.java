import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();

		String line = "";

		try {
			FileReader fileReader = new FileReader("src/IPAddresses.txt");

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("IP address " + line + " is " + main.isValidIP(line));
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file");
		} catch (IOException ex) {
			System.out.println("Error reading file");
		}

	}

	//This method will take a string argument and will return true if the pattern for IP address is there
	public boolean isValidIP(String ip) {

		if (ip != null && !ip.isEmpty() && !ip.equals("")) {

			String pattern = "(((\\d{1,2})|([0-2][0-5]{0,2})|([0-1]\\d\\d))\\.){3}((\\d{1,2})|([0-2][0-5]{0,2})|([0-1]\\d\\d))";

			return ip.matches(pattern) ? true : false;
		}
		return false;
	}

}
