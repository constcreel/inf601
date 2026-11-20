public class Knight extends Figure {
    public Knight(int column, int row, String color) {
        super(column, row, color);
    }
    @Override
    public boolean checkPosition(int column, int row) {
        if (this.column == column + 3 && this.row == row + 1) return true;
        if (this.column == column + 3 && this.row == row - 1) return true;
        if (this.column == column - 3 && this.row == row + 1) return true;
        if (this.column == column - 3 && this.row == row - 1) return true;
        if (this.column == column + 1 && this.row == row + 3) return true;
        if (this.column == column + 1 && this.row == row - 3) return true;
        if (this.column == column - 1 && this.row == row + 3) return true;
        if (this.column == column - 1 && this.row == row - 3) return true;
        return false;
    }
    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2658') : String.valueOf('\u265E');
    }
}