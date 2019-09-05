
public class Hierbabuena extends Menta {

	
	/* La hierbabuena se diferencia de la menta en que se esparce más rápido
	 *  y por eso el espacio que ocupa es el doble del que ocuparía una planta de menta de las mismas
	 *   características. */ 
	public Hierbabuena(int anio, float altura) {
		super(anio, altura);
		
	}
	
	@Override
	public float espacioQueOcupa() {
		return super.espacioQueOcupa()*2;
		
	
	}	
	
	
}
