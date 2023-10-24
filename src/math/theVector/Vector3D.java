package math.theVector;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Операция сложения векторов
    public Vector3D add(Vector3D other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Vector3D(newX, newY, newZ);
    }

    // Операция вычитания векторов
    public Vector3D subtract(Vector3D other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        double newZ = this.z - other.z;
        return new Vector3D(newX, newY, newZ);
    }

    // Операция умножения вектора на скаляр
    public Vector3D multiply(double scalar) {
        double newX = this.x * scalar;
        double newY = this.y * scalar;
        double newZ = this.z * scalar;
        return new Vector3D(newX, newY, newZ);
    }

    // Операция деления вектора на скаляр
    public Vector3D divide(double scalar) {
        if (scalar == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        double newX = this.x / scalar;
        double newY = this.y / scalar;
        double newZ = this.z / scalar;
        return new Vector3D(newX, newY, newZ);
    }

    // Вычисление длины вектора
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    // Нормализация вектора
    public Vector3D normalize() {
        double magnitude = length();
        return divide(magnitude);
    }

    // Скалярное произведение векторов
    public double dotProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Векторное произведение векторов
    public Vector3D crossProduct(Vector3D other) {
        double newX = this.y * other.z - this.z * other.y;
        double newY = this.z * other.x - this.x * other.z;
        double newZ = this.x * other.y - this.y * other.x;
        return new Vector3D(newX, newY, newZ);
    }
}
