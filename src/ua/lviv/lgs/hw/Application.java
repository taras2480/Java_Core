package ua.lviv.lgs.hw;

public class Application {

	public static void main(String[] args) {

		Robot r = new Robot("� Robot � � ������ ������");
		System.out.println(r);
		CoffeRobot cr = new CoffeRobot("� CoffeRobot � � ���� ����");
		System.out.println(cr);
		RobotCoocker rc = new RobotCoocker("� RobotCoocker � � ������ �����");
		System.out.println(rc);
		RobotDancer rd = new RobotDancer("� RobotDancer � � ������ ������");
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
