import java.util.Scanner;

public class View {

	private Scanner scan;
	private String name;
	private String lastname;
	private String email;

	public View() {
		scan = new Scanner(System.in);
		input();
	}

	public void input() {
		System.out.println("Name : ");
		name = scan.next();
		System.out.println("Lastname : ");
		lastname = scan.next();
		System.out.println("Email :");
		email = scan.next();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
