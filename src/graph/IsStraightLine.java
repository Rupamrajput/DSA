package graph;

public class IsStraightLine {

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 0 || coordinates.length == 1) {
            return true;
        }
        int diffX = Math.abs(coordinates[0][0] - coordinates[1][0]);
        int diffY = Math.abs(coordinates[0][1] - coordinates[1][1]);
        for (int i = 1; i < coordinates.length; i++) {
            int x = Math.abs(coordinates[i-1][0] - coordinates[i][0]);
            int y = Math.abs(coordinates[i-1][1] - coordinates[i][1]);

            if(y*diffX != x*diffY) return false;

        }
        return true;
    }
}
