public class QuadradoTest {

    public static void main(String[] args) {
        testCalcularArea();
        testCalcularPerimetro();
        testGetTipo();
        testCompareTo();
    }

    public static void testCalcularArea() {
        Quadrado quadrado = new Quadrado(4);
        double areaEsperada = 4 * 4;
        double areaCalculada = quadrado.calcularArea();

        if (Math.abs(areaEsperada - areaCalculada) < 0.0001) {
            System.out.println("Teste de calcular área: PASSED");
        } else {
            System.out.println("Teste de calcular área: FAILED");
        }
    }

    public static void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(4);
        double perimetroEsperado = 4 * 4;
        double perimetroCalculado = quadrado.calcularPerimetro();

        if (Math.abs(perimetroEsperado - perimetroCalculado) < 0.0001) {
            System.out.println("Teste de calcular perímetro: PASSED");
        } else {
            System.out.println("Teste de calcular perímetro: FAILED");
        }
    }

    public static void testGetTipo() {
        Quadrado quadrado = new Quadrado(4);
        String tipoEsperado = "Quadrado";
        String tipoCalculado = quadrado.getTipo();

        if (tipoEsperado.equals(tipoCalculado)) {
            System.out.println("Teste de getTipo: PASSED");
        } else {
            System.out.println("Teste de getTipo: FAILED");
        }
    }

    public static void testCompareTo() {
        Quadrado quadrado1 = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(5);

        if (quadrado1.compareTo(quadrado2) < 0) { // A área do quadrado1 é menor que a do quadrado2
            System.out.println("Teste de compareTo: PASSED");
        } else {
            System.out.println("Teste de compareTo: FAILED");
        }
    }
}

