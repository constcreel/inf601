public class Bishop extends Figure {
    public Bishop(int column, int row, String color) {
        super(column, row, color);
    }
    @Override
    public boolean checkPosition(int column, int row) {
        return Math.abs(this.column - column) == Math.abs(this.row - row);
    }
    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2657') : String.valueOf('\u265D');
    }
}