public class Point {
    int x;
    int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float distance() {
        return (float) Math.sqrt(x * x + y * y);
    }
     public float distance(int x1, int y1) {
         return (float) Math.sqrt((x1 -x) * (x1 -x) + (y1-y) * (y1-y));
     }

}
