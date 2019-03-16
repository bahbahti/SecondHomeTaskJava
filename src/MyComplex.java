import java.util.Objects;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    };

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    };

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + (" + imag + ")*i)";
    }

    public boolean isReal() {
        if (imag == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isImaginary() {
        if (imag == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return  true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyComplex)) {
            return false;
        }
        MyComplex myComplex = (MyComplex) o;
        return myComplex.real == real &&
               myComplex.imag == imag;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longValue = Double.doubleToLongBits(real);
        result = 37 * result + (int)(longValue - (longValue >>> 32));
        longValue = Double.doubleToLongBits(imag);
        result = 37 * result + (int)(longValue - (longValue >>> 32));
        return result;
    }

    public double magnitude() {
        return (Math.sqrt(real * real + imag * imag));
    }

    public double argument() {
        return (Math.atan(imag / real));
    }

    public MyComplex add(MyComplex right) {
        real = real + right.real;
        imag = imag + right.imag;
        return this;
    }

    public MyComplex subtract(MyComplex right) {
        real = real - right.real;
        imag = imag - right.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        real = (real * right.real + imag * right.imag) / (right.real * right.real + right.imag + right.imag);
        imag = (right.real * imag - real * right.imag) / (right.real * right.real + right.imag + right.imag);;
        return this;
    }

    public MyComplex multiply(MyComplex right) {
        real = real * right.real - imag * right.imag;
        imag = real * right.imag + imag * right.real;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double realNew = real + right.real;
        double imagNew = imag + right.imag;
        return new MyComplex(realNew, imagNew);
    }

    public MyComplex subtractNew(MyComplex right) {
        double realNew = real - right.real;
        double imagNew = imag - right.imag;
        return new MyComplex(realNew, imagNew);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, (-1) * imag);
    }
}
