package ua.lviv.lgs.coin;

public class Coin {

	private boolean head;
	private int turn;

	public Coin(boolean head, int turn) {
		super();
		this.head = head;// ���� ������ ����� ������
		this.turn = turn;// ������� ������ ������ � �����

		// ��������� ���� ������ - ����� ������� ������ ��� �������� - ����
		// ����-������� ������� ������ ��� ��������- ������
		// ������ - ����� ������� ������ ��� ��������- ������
		// ������ - ������� ������� ������ ��� ��������- ����

		if (turn % 2 < 1 & head == true) {

			System.out.println("������ ������");
		}

		else if (turn % 2 > 0 & head == false) {

			System.out.println("������ ������");

		} else {
			System.out.println("����� ����");

		}

	}

}
