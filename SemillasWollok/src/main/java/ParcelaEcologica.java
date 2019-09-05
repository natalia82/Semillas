
public class ParcelaEcologica extends Parcela {

	public ParcelaEcologica(double ancho, double largo, float horasDeSol) {
		super(ancho, largo, horasDeSol);
	}
	
	@Override
	public boolean seAsociaBien(Planta planta) {
		return !(this.tieneComplicaciones()) && planta.parcelaIdeal(this);
	}

}
