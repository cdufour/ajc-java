package project.test;
 
import java.util.Date;
 
import project.school.Student;
import project.school.Sector;
 
public class Test {
 
	public static void main(String[] args) {
		Sector[] sectors = new Sector[3];
		sectors[0] = new Sector("INF", "Informatique");
		sectors[1] = new Sector("BIO", "Biologie");
		sectors[2] = new Sector("MAT", "Maths");
 
		System.out.println("La liste des filieres de notre ecole: ");
		for (Sector s : sectors)
			System.out.println(s);
 
		Student students[] = new Student[3];
		students[0] = new Student("Alessandro Del Piero", new Date("1974/09/11"), sectors[0]);
		students[1] = new Student("Marcel Vincent", new Date("1920/05/05"), sectors[0]);
		students[2] = new Student("Truc Machin", new Date("1986/05/05"), sectors[1]);
 
		System.out.println("Liste des etudiants par filiere :");
		for (Sector sector : sectors) {
			System.out.println(sector);
			for (Student student : students) {
				if (student.getSector().getId() == sector.getId()) {
					System.out.println("\t\t" + student);
				}
			}
		}
	}
}