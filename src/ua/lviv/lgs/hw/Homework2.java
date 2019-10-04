package homework;

public class Application {
	public static void main(String[] args) {

		// 1. Записати по одній змінній кожного примітивних типів данних
		
		
		boolean a = false;// bolean

		char ch = 'a';// char. Нижче перевірка , якому значенню відповідає змінна 'a'

		int intCh = (int) ch;

		System.out.println("a corresponds with " + intCh);

		Byte b = 127;
		Byte c = -127; // byte

		short d = 32767;
		short e = -32768;// short

		int f = 2147483647;
		int g = -2147483648; // int

		long h = 9223372036854775807L;
		long j = -9223372036854775808L;// long

		float k = 315.75f;// float

		double l = 16.87;
		
		System.out.println("");
		System.out.println("");
		
		//2. Вивести на консоль мінімальне та максимальне значення типів даних, викоростовуючи Wrappers

		System.out.println(" 2. Вивести на консоль мінімальне та максимальне значення типів даних, викоростовуючи Wrappers");
		
		System.out.println("Byte="+Byte.MAX_VALUE);
		System.out.println("Byte="+Byte.MIN_VALUE);
		System.out.println("Short="+Short.MIN_VALUE);
		System.out.println("Short="+Short.MAX_VALUE);
		System.out.println("Integer="+Integer.MAX_VALUE);
		System.out.println("Integer="+Integer.MIN_VALUE);
		System.out.println("Long="+Long.MAX_VALUE);
		System.out.println("Long="+Long.MIN_VALUE);
		System.out.println("Float="+Float.MAX_VALUE);
		System.out.println("Float="+Float.MIN_VALUE);
		System.out.println("Double="+Double.MAX_VALUE);
		System.out.println("Double="+Double.MIN_VALUE);
		System.out.println("Boolean="+Boolean.TRUE);
		System.out.println("Boolean="+Boolean.FALSE);
		System.out.println("Character="+Character.MAX_VALUE);
		System.out.println("Character="+Character.MIN_VALUE);
		
		System.out.println("");
		System.out.println("");
		
		//3. Мінімальне та максимальне значення в масиві
		
		System.out.println(" 3. Мінімальне та максимальне значення в масиві");
		
int [] array = {33,5,56,765,47,378,4,67,543,23,689,322,159};
		
		boolean isSorted=false;
		int data=0;
		
		while(!isSorted) {
			
			isSorted=true;
			
		
		
		for (int i = 0; i < array.length-1; i++) {
			
		if(array[i]>array[i+1]) {
			isSorted=false;
			data=array[i];
			array[i]=array[i+1];
			array[i+1]=data;
		}
		
		
		}
		}
		
		System.out.println("max="+array[12]);
		System.out.println("min="+array[0]);

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
