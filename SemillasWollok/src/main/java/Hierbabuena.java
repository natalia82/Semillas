
public class Hierbabuena extends Menta {

	
	/* La hierbabuena se diferencia de la menta en que se esparce m�s r�pido
	 *  y por eso el espacio que ocupa es el doble del que ocupar�a una planta de menta de las mismas
	 *   caracter�sticas. */ 
	public Hierbabuena(int anio, float altura) {
		super(anio, altura);
		
	}
	
	@Override
	public float espacioQueOcupa() {
		return super.espacioQueOcupa()*2;
		
	
	}	
	
	
}
