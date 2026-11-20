public class Queen extends Figure {
    public Queen(int column, int row, String color) {
        super(column, row, color);
    }
    @Override
    public boolean checkPosition(int column, int row) {
        if (this.column != column && this.row == row) return true;
        if (this.row != row && this.column == column) return true;
        return Math.abs(this.column - column) == Math.abs(this.row - row);
    }
    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2655') : String.valueOf('\u265B');
    }
}