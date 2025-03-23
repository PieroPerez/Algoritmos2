
public class OperacionesMathInteger implements Operable<Integer> {
    private Integer valor;

    public OperacionesMathInteger(Integer valor) {
        this.valor = valor;
    }
    @Override
    public Integer suma(Integer otro) { return this.valor + otro; }
    @Override
    public Integer resta(Integer otro) { return this.valor - otro; }
    @Override
    public Integer producto(Integer otro) { return this.valor * otro; }
    @Override
    public Integer division(Integer otro) {
        if (otro == 0) throw new ArithmeticException("División por cero no permitida");
        return this.valor / otro;
    }
    @Override
    public Integer potencia(int exponente) { return (int) Math.pow(this.valor, exponente); }
    @Override
    public Integer raizCuadrada() { return (int) Math.sqrt(this.valor); }
    @Override
    public Integer raizCubica() { return (int) Math.cbrt(this.valor); }
}
