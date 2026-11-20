public class Rook extends Figure {
    public Rook(int column, int row, String color) {
        super(column, row, color);
    }
    @Override
    public boolean checkPosition(int column, int row) {
        if (this.column != column && this.row == row) return true;
        if (this.row != row && this.column == column) return true;
        return false;
    }
    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2656') : String.valueOf('\u265C');
    }
}