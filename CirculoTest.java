public class CirculoTest {

    public static void main(String[] args) {
        testCalcularArea();
        testCalcularPerimetro();
        testGetTipo();
        testCompareTo();
    }

    public static void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        double areaEsperada = Math.PI * Math.pow(5, 2);
        double areaCalculada = circulo.calcularArea();

        if (Math.abs(areaEsperada - areaCalculada) < 0.0001) {
            System.out.println("Teste de calcular área: PASSED");
        } else {
            System.out.println("Teste de calcular área: FAILED");
        }
    }

    public static void testCalcularPerimetro() {
        Circulo circulo = new Circulo(5);
        double perimetroEsperado = 2 * Math.PI * 5;
        double perimetroCalculado = circulo.calcularPerimetro();

        if (Math.abs(perimetroEsperado - perimetroCalculado) < 0.0001) {
            System.out.println("Teste de calcular perímetro: PASSED");
        } else {
            System.out.println("Teste de calcular perímetro: FAILED");
        }
    }

    public static void testGetTipo() {
        Circulo circulo = new Circulo(5);
        String tipoEsperado = "Círculo";
        String tipoCalculado = circulo.getTipo();

        if (tipoEsperado.equals(tipoCalculado)) {
            System.out.println("Teste de getTipo: PASSED");
        } else {
            System.out.println("Teste de getTipo: FAILED");
        }
    }

    public static void testCompareTo() {
        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(10);

        if (circulo1.compareTo(circulo2) < 0) { // A área do circulo1 é menor que a do circulo2
            System.out.println("Teste de compareTo: PASSED");
        } else {
            System.out.println("Teste de compareTo: FAILED");
        }
    }
}
