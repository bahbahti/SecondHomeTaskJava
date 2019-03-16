public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "), (" +x2 + "," + y2 + ")]";
    }

    public boolean collides(Ball ball) {
        if  ( ((ball.getX() + ball.getRadius()) >= x1) &&
                ((ball.getX() + ball.getRadius()) <= x2) &&
                ((ball.getY() + ball.getRadius()) >= y1) &&
                 ((ball.getY() + ball.getRadius()) <= y2) &&

                ((ball.getX() - ball.getRadius()) >= x1) &&
                ((ball.getX() - ball.getRadius()) <= x2) &&
                ((ball.getY() - ball.getRadius()) >= y1) &&
                ((ball.getY() - ball.getRadius()) <= y2)
        )
        {   //мяч внутри
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Container)) {
            return false;
        }
        Container right = (Container) obj;
        return x1 == right.x1 &&
                y1 == right.y1 &&
                x2 == right.x2 &&
                y2 == right.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + x1;
        result = 37 * result + y1;
        result = 37 * result + x2;
        result = 37 * result + y2;
        return result;

    }
}
