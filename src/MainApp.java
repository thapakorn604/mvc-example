
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		Student model = new Student();
		View view = new View();
		Controller controll = new Controller(db, model, view);
	}

}
