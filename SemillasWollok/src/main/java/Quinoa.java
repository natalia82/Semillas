import java.util.Iterator;


public class Quinoa extends Planta {
	float horasDeSol;

	public Quinoa(int anio, float altura, int horasDeSol) {
		super(anio, altura);
		this.horasDeSol = horasDeSol;
	}
	
	/* Existen muchas cepas de esta nutritiva planta andina
	 *  y es por eso que la cantidad de horas de sol que tolera la configuraremos para cada planta.
	 *   Ocupa siempre 0.5 metros cuadrados y la condición alternativa 
	 *   para saber si da semillas es que el año de obtención de la semilla que le dio origen
	 *    sea anterior al 2005.

*/
	@Override
	public boolean daSemillas() {
		return this.esFuerte() &&  this.anioDeObtencion <2005;
	}
	
	@Override
	public float espacioQueOcupa() {
		return 0.5f;
	}
	
	public boolean parcelaIdeal(Parcela parcela) {
		Iterator<Planta> p = parcela.plantas.iterator();
		boolean esParcelaIdeal = true;
		while(p.hasNext()) {
			if(p.next().altura > 1.5f) {
				esParcelaIdeal = false;
				
			}
		}
		return esParcelaIdeal;
		
	}
	
	
	

}
