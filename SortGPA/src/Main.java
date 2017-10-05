import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		List<StudentDTO> stdList = assignAndGetList();
		
		Collections.sort(stdList);
		
		for(StudentDTO student: stdList){
			//System.out.println("First Name: "+student.getFirstName()+" | GPA:"+student.getGPA()+" | ID:"+student.getID());
			System.out.println("First Name: "+student.getFirstName());
		}
	}
	
	//This method will create a list of StudenDTO objects, initialize them with default values and will return the list
	public static List<StudentDTO> assignAndGetList() {
		
		List<StudentDTO> studentsList = new ArrayList<>();
		
		studentsList.add(new StudentDTO(1223, "Zena", 3.74));
		studentsList.add(new StudentDTO(33, "Tina", 3.68));
		studentsList.add(new StudentDTO(31, "Tina", 3.68));
		studentsList.add(new StudentDTO(85, "Louis", 3.85));
		studentsList.add(new StudentDTO(56, "Samil", 3.75));
		studentsList.add(new StudentDTO(19, "Samar", 3.75));
		studentsList.add(new StudentDTO(22, "Lorry", 3.76));
		studentsList.add(new StudentDTO(23, "Barry", 3.76));
		studentsList.add(new StudentDTO(26, "Lorry", 3.76));
		
		
		return studentsList;
	}

}
