public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * (float)Math.cos(direction);
        this.yDelta = (-1) * speed * (float)Math.sin(direction);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectionHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectionVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "), speed = (" + xDelta + "," + yDelta + ")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != getClass())
            return false;
        Ball right = (Ball) obj;
        return x == right.x &&
                y == right.y &&
                radius == right.radius &&
                xDelta == right.xDelta &&
                yDelta == right.yDelta;
    }
        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result + Float.floatToIntBits(x);
            result = 37 * result + Float.floatToIntBits(y);
            result = 37 * result + radius;
            result = 37 * result + Float.floatToIntBits(xDelta);
            result = 37 * result + Float.floatToIntBits(yDelta);
            return result;
        }
}
