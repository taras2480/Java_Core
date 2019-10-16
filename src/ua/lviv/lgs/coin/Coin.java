package ua.lviv.lgs.coin;

public class Coin {

	private boolean head;
	private int turn;

	public Coin(boolean head, int turn) {
		super();
		this.head = head;// верх монети перед кидком
		this.turn = turn;// кількість обертів монети в повітрі

		// Початково Орел зверху - парна кількість обертів при підкиданні - орел
		// Орел-непарна кількість обертів при підкиданні- копійка
		// Копійка - парна кількість обертів при підкиданні- копійка
		// Копійка - непарна кількість обертів при підкиданні- орел

		if (turn % 2 < 1 & head == true) {

			System.out.println("Випала копійка");
		}

		else if (turn % 2 > 0 & head == false) {

			System.out.println("Випала копійка");

		} else {
			System.out.println("Випав герб");

		}

	}

}
