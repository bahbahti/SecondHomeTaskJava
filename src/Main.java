public class Main {

    public static void main(String[] args) {
        MyComplex mc1 = new MyComplex(1, 7);
        MyComplex mc2 = new MyComplex(0, 0);
        MyComplex mc3 = mc1.addNew(mc2);
        System.out.println(mc3.equals(mc1));
        System.out.println(mc3.equals(mc2));
        System.out.println(mc3.conjugate());
///////////////////////////////////////////////////
        //степень полинома = 2, но есть еще нулевой элемент
        int degree = 2;
        double[] coeffs = new double[degree + 1];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = i;
        }
        double[] coeffs2 = new double[degree + 3];
        for (int i = 0; i < coeffs2.length; i++) {
            coeffs2[i] = i * 2;
        }
/////////////////////////////////////////////////
        MyPolynomial mp = new MyPolynomial(coeffs);
        MyPolynomial mp2 = new MyPolynomial(coeffs2);

        System.out.println(mp.getDegree());
        System.out.println(mp.toString());
        System.out.println(mp.evaluate(5));
        //System.out.println(mp.hashCode());
        MyPolynomial mp3 = mp.add(mp2);

///////////////////////////////////////////////
        Ball b1 = new Ball(4, 2, 2, 10, 30);
       // b1.reflectionVertical();
        //b1.move();
        //System.out.println(b1.hashCode());
        System.out.println(b1.toString());
        Container con = new Container(1,0, 5,5);
        //Container con2 = new Container(1,0, 5,5);
        System.out.println(con.toString());
        System.out.println(con.collides(b1));
        //System.out.println(con2.hashCode());
    }
}
