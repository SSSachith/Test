import java.util.Comparator;

public class StudentDTO implements Comparable<StudentDTO>, Comparator<StudentDTO> {

	private int ID;
	private String firstName;
	private double GPA;

	public StudentDTO() {

	}

	public StudentDTO(int ID, String firstName, double GPA) {
		this.ID = ID;
		this.firstName = firstName;
		this.GPA = GPA;

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public int compare(StudentDTO std1, StudentDTO std2) {
		if (std1.GPA == std2.GPA) {
			if (std1.firstName.equals(std2.firstName)) {
				return (std1.ID - std2.ID);
			} else {
				return String.CASE_INSENSITIVE_ORDER.compare(std1.firstName, std2.firstName);
			}

		} else {
			return (std1.GPA - std2.GPA) > 0 ? -1 : 1;
		}
	}

	@Override
	public int compareTo(StudentDTO std2) {
		return this.compare(this, std2);

	}

}
