package ua.lviv.lgs.animal;

public class Application {
	public static void main(String[] args) {

		Animal bull = new Animal("Бик", 2, 14);
		String bullName = bull.getName();
		double bullSpeed = bull.getSpeed();
		int bullAge = bull.getAge();
		Animal leopard = new Animal("Леопард", 20, 7);
		String leopardName = leopard.getName();
		double leopardSpeed = leopard.getSpeed();
		int leopardAge = leopard.getAge();

		System.out.println("\"Назва тварини=" + leopard.getName() + ",швидкість тварини=" + leopard.getSpeed()
				+ "км/год. Вік тварини=" + leopard.getAge() + "років\""
				+ "\"_ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _  _ _ _\"" + "\"Назва тварини=" + bull.getName()
				+ ",швидкість тварини=" + bull.getSpeed() + "км/год. Вік тварини=" + bull.getAge() + "років\"");

		bull.setName("Кіт");
		bull.setSpeed(10);
		bull.setAge(5);
		leopard.setName("Собака");
		leopard.setSpeed(11);
		leopard.setAge(8);
		System.out.println("\"Назва тварини=" + leopard.getName() + ",швидкість тварини=" + leopard.getSpeed()
				+ "км/год. Вік тварини=" + leopard.getAge() + "років\""
				+ "\"_ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _  _ _ _\"" + "\"Назва тварини=" + bull.getName()
				+ ",швидкість тварини=" + bull.getSpeed() + "км/год. Вік тварини=" + bull.getAge() + "років\"");

	}

}
