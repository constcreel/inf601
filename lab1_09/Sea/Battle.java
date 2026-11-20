public class Battle {
	public SeaBattleField seaBattleField;

	public Battle() {
		System.out.println("Battle");
		seaBattleField = new SeaBattleField();
		seaBattleField.showField();

	}
}