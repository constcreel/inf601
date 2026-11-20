// 4. Поле игры морской бой. Создать класс корабль (размер, координаты начала, конца).
// import java util Random;
// Random random = new RandomO;
// int i = random.nextInt(10);
// Расставить корабли на поле случайным образом.

public class Ship {
	private byte size;
	/*
		система координат: 0-9 (X), 0-9 (Y)
	*/
	private byte xStart;
	private byte yStart;
	private byte xEnd;
	private byte yEnd;
	/* 0 - целый, 1 - ранен, 2 - подбит */
	// public byte state;
	private byte[] statePart;

	public Ship(byte size, byte xStart, byte yStart, byte yEnd, byte xEnd) {
		this.size = size;
		this.xStart = xStart;
		this.yStart = yStart;
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}
	public byte getState() {
		for (int i = 0; i < statePart.length; i++) {
			if (statePart[i] == 1) return 1;
			if (statePart[i] == 2] return 2;
		}
		return 0;
	}
	public void setState(byte state) {
		for (int i = 0; i < statePart.length; i++) {
			statePart[i] = 2;
		}
	}
	public void setState(byte x, byte y) {
		if (xEnd - x > 0) statePart[xEnd - x] = 1;
		elif (yEnd - x)
	}
}