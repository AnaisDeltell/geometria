
public class Triangulo_ADA extends FiguraGeometrica_ADA {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_ADA(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = this.lado1;
		lado2 = this.lado2;
		lado3 = this.lado3;
	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her�n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
}
  