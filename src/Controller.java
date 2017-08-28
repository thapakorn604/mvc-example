
public class Controller {

	private Database db;
	private Student dtmodel;
	private View view;

	public Controller(Database db, Student dtmodel, View view) {
		this.db = db;
		this.dtmodel = dtmodel;
		this.view = view;
		saveData();

	}

	public boolean isValues() {

		boolean result = false;
		String name = view.getName();
		String lastname = view.getLastname();
		String email = view.getEmail();

		if (!name.equals("") && !lastname.equals("") && !email.equals("")) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public void saveData() {

		if (isValues()) {

			dtmodel = new Student();
			dtmodel.setName(view.getName());
			dtmodel.setLastname(view.getLastname());
			dtmodel.setEmail(view.getEmail());

			if (db.isInsert(dtmodel)) {
				System.out.println("Saved!!");
				System.exit(0);
			} else {
				System.out.println("Cannot save!!");
				this.view = new View();
			}

		} else {
			System.out.println("Please fill all your form");
			this.view = new View();
		}
	}

}
