import java.util.Scanner;
public class Labirint {
	// Описать структуру данных
	static byte[][] field = {
		{1,0,1,1,1},
		{1,0,0,1,1},
		{1,1,0,1,1},
		{1,0,0,0,0},
		{1,1,1,1,1}
	};
	static char[][] status = {
		{'_','*','_','_','_'},
		{'_','_','_','_','_'},
		{'_','_','_','_','_'},
		{'_','_','_','_','_'},
		{'_','_','_','_','_'}
	};
	static int posRow = 0;
	static int posColumn = 1;
	static int exitRow = 3;
	static int exitColumn = 4;
	static int countStep = 0;
	
	public static void main(String[] args) {
		while (true) {
			showStatus();
			moves();
		}
		System.out.print("Победа, кол-во шагов: " + countStep);
	}
	
	// Вывод состояния
	public static void showStatus() {
		for (int i = 0; i < status.length; i++) {
			for (int j = 0; j < status[i].length; j++) {
				System.out.print(status[i][j]);
			}
			System.out.println();
		}
	}
	// Ввод направления
	static String getDirection() {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите направление: ");
			String direction = sc.nextLine();
			switch (direction) {
				case "U":
				case "D":
				case "L":
				case "R":
				case "u":
				case "d":
				case "l":
				case "r":
					return (direction);
				default:
					System.out.println("WRONG");
			}
		}

	}
	// Анализ хода, перерасчет состояния
	static void moves() {
		String direction = getDirection();
		countStep++;
		switch (direction) {
			case "U": case "u":
				if (posRow == 0) {break;}
				if (field[posRow - 1][posColumn] == 1) {
					status[posRow - 1][posColumn] = 'x';
					break;
				}
				status[posRow][posColumn] = '#';
				posRow--;
				status[posRow][posColumn] = '*';
				break;

		
			case "D": case "d":
				if (posRow == (field.lenght) - 1) {break;}
				if (field[posRow + 1][posColumn] == 1) {
					status[posRow + 1][posColumn] = 'x';
					break;
				}
				status[posRow][posColumn] = '#';
				posRow++;
				status[posRow][posColumn] = '*';
				break;
			case "L": case "l":
				if (posColumn == 0) {break;}
				if (field[posRow][posCoulumn - 1] == 1) {
					status[posRow][posColumn - 1] = 'x';
				}
				status[posRow][posColumn--] = '#';
				status[posRow][posColumn] = '*';
			case "R": case "r":
				if (posColumn == 0) {break;}
				if (field[posRow][posCoulumn + 1] == 1) {
					status[posRow][posColumn + 1] = 'x';
				}
				status[posRow][posColumn++] = '#';
				status[posRow][posColumn] = '*';

		}
		static boolean isWin()  {
			return posCoulumn == exitColumn && posRow == exitRow;
		}

		

	}
}