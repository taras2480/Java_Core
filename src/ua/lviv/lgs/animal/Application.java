package ua.lviv.lgs.animal;

public class Application {
	public static void main(String[] args) {

		Animal bull = new Animal("���", 2, 14);
		String bullName = bull.getName();
		double bullSpeed = bull.getSpeed();
		int bullAge = bull.getAge();
		Animal leopard = new Animal("�������", 20, 7);
		String leopardName = leopard.getName();
		double leopardSpeed = leopard.getSpeed();
		int leopardAge = leopard.getAge();

		System.out.println("\"����� �������=" + leopard.getName() + ",�������� �������=" + leopard.getSpeed()
				+ "��/���. ³� �������=" + leopard.getAge() + "����\""
				+ "\"_ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _  _ _ _\"" + "\"����� �������=" + bull.getName()
				+ ",�������� �������=" + bull.getSpeed() + "��/���. ³� �������=" + bull.getAge() + "����\"");

		bull.setName("ʳ�");
		bull.setSpeed(10);
		bull.setAge(5);
		leopard.setName("������");
		leopard.setSpeed(11);
		leopard.setAge(8);
		System.out.println("\"����� �������=" + leopard.getName() + ",�������� �������=" + leopard.getSpeed()
				+ "��/���. ³� �������=" + leopard.getAge() + "����\""
				+ "\"_ _ _ _ _ _ _ _ _  _ _ _ _ _ _ _ _ _  _ _ _\"" + "\"����� �������=" + bull.getName()
				+ ",�������� �������=" + bull.getSpeed() + "��/���. ³� �������=" + bull.getAge() + "����\"");

	}

}
