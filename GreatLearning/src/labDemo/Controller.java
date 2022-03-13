package labDemo;

import demoCredentialService.CredentialService;

import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		boolean flag = false;

		Controller lab = new Controller(); // Object to access dept methods
		Scanner sn = new Scanner(System.in);
		CredentialService cred = new CredentialService(); // Object to access Credential service methods

		System.out.println(
				"\n This is IT Support Administration!\n\n Please provide the following information to proceed");

		Employee emp = new Employee("Aravind", "SivaPrakash"); // Assign first and Last Names

		System.out.println("\n Welcome " + emp.getFirstname() + " " + emp.getLastname() + "!");

		do {
			System.out.println(
					"\n\n Please choose the appropriate Department\n\n 1. Technical \n 2. Administration \n 3. Human Resource \n 4. Legal \n");
			
			int val = sn.nextInt(); // get the Department

			switch (val) {
			case 1:
				cred.showCredentials(emp.getFirstname() + emp.getLastname(), lab.tech()); // generate Email and password for Technical dept
				flag = true;
				break;
			case 2:
				cred.showCredentials(emp.getFirstname() + emp.getLastname(), lab.admin()); // generate Email and password for Administration dept													
				flag = true;
				break;
			case 3:
				cred.showCredentials(emp.getFirstname() + emp.getLastname(), lab.hr()); // generate Email and password for Human Resource dept
				flag = true;
				break;
			case 4:
				cred.showCredentials(emp.getFirstname() + emp.getLastname(), lab.legal()); // generate Email and password for Legal dept
				flag = true;
				break;
			default:
				System.out.println("\n Invalid Choice!");
				flag = false;

			}

		} while (flag == false);
		
		sn.close();

	}

	public String tech() {
		return "tech";
	}

	public String admin() {
		return "admin";
	}

	public String hr() {
		return "hr";
	}

	public String legal() {
		return "legal";
	}
}
