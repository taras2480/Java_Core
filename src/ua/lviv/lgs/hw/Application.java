package ua.lviv.lgs.hw;

public class Application {

	public static void main(String[] args) {

		Robot r = new Robot("я Robot Ц € просто працюю");
		System.out.println(r);
		CoffeRobot cr = new CoffeRobot("я CoffeRobot Ц € варю каву");
		System.out.println(cr);
		RobotCoocker rc = new RobotCoocker("я RobotCoocker Ц € просто готую");
		System.out.println(rc);
		RobotDancer rd = new RobotDancer("я RobotDancer Ц € просто танцюю");
		System.out.println(rd);
		System.out.println("");

		String[] array = { "Robot", "CoffeRobot", "RobotCoocker", "RobotDancer" };

		for (int i = 0; i < 4; i++) {

			array[0] = new String(r.getWorking());
			array[1] = new String(cr.getWorking());
			array[2] = new String(rc.getWorking());
			array[3] = new String(rd.getWorking());
			System.out.println(array[i]);

		}

	}

}
