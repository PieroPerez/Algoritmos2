public class OperacionesMathDouble implements Operable<Double> {
    private Double valor;

    public OperacionesMathDouble(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double suma(Double otro) { return this.valor + otro; }
    @Override
    public Double resta(Double otro) { return this.valor - otro; }
    @Override
    public Double producto(Double otro) { return this.valor * otro; }
    @Override
    public Double division(Double otro) {
        if (otro == 0) throw new ArithmeticException("División por cero no permitida");
        return this.valor / otro;
    }
    @Override
    public Double potencia(int exponente) { return Math.pow(this.valor, exponente); }
    @Override
    public Double raizCuadrada() { return Math.sqrt(this.valor); }
    @Override
    public Double raizCubica() { return Math.cbrt(this.valor); }
}