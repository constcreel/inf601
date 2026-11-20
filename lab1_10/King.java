public class King extends Figure {
    public King(int column, int row, String color) {
        super(column, row, color);
    }
    
    @Override
    public boolean checkPosition(int column, int row) {
        if (this.column == column && this.row + 1 == row) return true;
        if (this.row == row && this.column + 1 == column) return true;
        if ((this.column - 1 == column || this.column + 1 == column) && (this.row + 1 == row)) return true;
        if ((this.row - 1 == row || this.row + 1 == row) && (this.column + 1 == column)) return true;
        return false;
    }
    @Override
    public String getPresent() {
        return color.equals("white") ? String.valueOf('\u2654') : String.valueOf('\u265A');
    }

    
}