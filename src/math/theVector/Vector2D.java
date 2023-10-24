package math.theVector;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Операция сложения векторов
    public Vector2D add(Vector2D other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        return new Vector2D(newX, newY);
    }

    // Операция вычитания векторов
    public Vector2D subtract(Vector2D other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        return new Vector2D(newX, newY);
    }

    // Операция умножения вектора на скаляр
    public Vector2D multiply(double scalar) {
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        return new Vector2D(newX, newY);
    }

    // Операция деления вектора на скаляр
    public Vector2D divide(double scalar) {
        double newX = this.x / scalar;
        double newY = this.y / scalar;
        return new Vector2D(newX, newY);
    }

    // Вычисление длины вектора
    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    // Нормализация вектора
    public Vector2D normalize() {
        double magnitude = length();
        return divide(magnitude);
    }

    // Скалярное произведение векторов
    public double dotProduct(Vector2D other) {
        return this.x * other.x + this.y * other.y;
    }

    // Векторное произведение векторов (для векторов размерности 3)
    public Vector2D crossProduct(Vector2D other) {
        // Для вектора размерности 2 векторное произведение не определено
        throw new UnsupportedOperationException("Cross product is only defined for vectors of dimension 3");
    }

}
