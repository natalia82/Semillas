
public class Menta extends Planta {
	
	public Menta(int anio, float altura) {
		super(anio, altura);
	}
	
	@Override
	public boolean daSemillas() {
		return this.esFuerte() || this.altura > 0.4f;
	}
	

	
	@Override
	public float espacioQueOcupa() {
		return this.altura*3;
	}
	
	public boolean parcelaIdeal(Parcela parcela) {
		return parcela.superficie() >6;
		
	}
	
	
	

}
