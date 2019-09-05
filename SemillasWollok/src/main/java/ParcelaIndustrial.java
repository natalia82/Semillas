
public class ParcelaIndustrial extends Parcela{

	public ParcelaIndustrial(double ancho, double largo, float horasDeSol) {
		super(ancho, largo, horasDeSol);
	}
	
	@Override
	public boolean seAsociaBien(Planta planta) {
		return this.plantas.size()<=2  && planta.esFuerte();
	}

}
