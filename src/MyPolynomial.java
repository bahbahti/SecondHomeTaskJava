import java.util.Arrays;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length;
    }

    @Override
    public String toString() {
        String str ="";
        for (int i = coeffs.length - 1; i >= 0 ; i--) {
            str = str + coeffs[i] + "*x^" + i + " + ";
        }
        str = str.substring(0, str.lastIndexOf("*"));
        return str;
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = 0; i < coeffs.length; i++) {
            sum += coeffs[i] * Math.pow(x, i);
        }
        return  sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        int sizeNew;
        double[] coeffsNew;
        if (coeffs.length < right.coeffs.length) {
            sizeNew = right.coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
            for (int i = coeffs.length; i < right.coeffs.length; i++) {
                coeffsNew[i] = right.coeffs[i];
            }
        } else if (coeffs.length > right.coeffs.length) {
            sizeNew = right.coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < right.coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
            for (int i = right.coeffs.length; i < coeffs.length; i++) {
                coeffsNew[i] = coeffs[i];
            }

        } else {
            sizeNew = coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffsNew.length; i++) {
                coeffsNew[i] = coeffs[i] + right.coeffs[i];
            }
        }
        return new MyPolynomial(coeffsNew);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int sizeNew;
        double[] coeffsNew;
        if (coeffs.length < right.coeffs.length) {
            sizeNew = right.coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] * right.coeffs[i];
            }
            for (int i = coeffs.length; i < right.coeffs.length; i++) {
                coeffsNew[i] = 0 * right.coeffs[i];
            }
        } else if (coeffs.length > right.coeffs.length) {
            sizeNew = right.coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < right.coeffs.length; i++) {
                coeffsNew[i] = coeffs[i] * right.coeffs[i];
            }
            for (int i = right.coeffs.length; i < coeffs.length; i++) {
                coeffsNew[i] = 0 * coeffs[i];
            }

        } else {
            sizeNew = coeffs.length;
            coeffsNew = new double[sizeNew];
            for (int i = 0; i < coeffsNew.length; i++) {
                coeffsNew[i] = coeffs[i] * right.coeffs[i];
            }
        }
        return new MyPolynomial(coeffsNew);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MyPolynomial)) return false;
        MyPolynomial right = (MyPolynomial) obj;
        return Arrays.equals(coeffs, right.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
