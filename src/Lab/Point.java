package Lab;

public class Point {
    private int  x;
    private int  y;

    public Point(int  x, int  y) {
        this.x = x;
        this.y = y;
    }

    public int  getX() {
        return x;
    }

    public void setX(int  x) {
        this.x = x;
    }

    public int  getY() {
        return y;
    }

    public void setY(int  y) {
        this.y = y;
    }

    public int[] getXY(){
        int XY[] = new int [2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));
    }

    public double distance(Point another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(Math.pow(xDiff,2) + Math.pow(yDiff,2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
