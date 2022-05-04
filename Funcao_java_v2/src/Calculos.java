public class Calculos {

    static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    static double areaQuadrado(double lado) {
        return areaRetangulo(lado, lado);
    }

    static double areaCirculo(double raio) {
        return (2 * Math.PI * Math.pow((raio), 2));
    }

}
