
import java.util.ArrayList;
import java.util.Iterator;


public class Parcela {
	
	double ancho;
	double largo;
	float horasDeSol;
	ArrayList<Planta> plantas;
	String tipo = " ";
	
	public Parcela(double ancho, double largo, float horasDeSol) {
		
		this.ancho = ancho;
		this.largo = largo;
		this.horasDeSol = horasDeSol;
	}
	
	
	/* De cada parcela se conoce:

su ancho y su largo, medidos en metros. (Para evacuar dudas: s�, van en dos atributos distintos.);
cu�ntas horas de sol recibe por d�a;
las plantas que tiene, representadas por una colecci�n.
Y se pide:

conocer la superficie de la parcela, que se calcula... multiplicando ancho por largo;
saber la cantidad m�xima de plantas que tolera, que se calcula de la siguiente manera:
 si el ancho es mayor que el largo, la cuenta es superficie / 5; si no superficie / 3 + largo;
saber si tiene complicaciones, lo cual es as� si alguna de sus plantas tolera menos 
sol del que recibe la parcela;
poder plantar una planta que se recibe por par�metro. El efecto que produce
 es que se agregue a la colecci�n. Esto debe arrojar un error si al plantar 
 se supera la cantidad m�xima o bien si la parcela recibe al menos 2 horas m�s de sol que los que la planta tolera. */

	public double superficie() {
		return ancho * largo;
	}
	
	public double maximoPlantas() {
		if(ancho>largo) {
			return this.superficie()/5;
			
		} else {
			return this.superficie()/3  + largo;
			
		}
	}
	
	public boolean tieneComplicaciones() {
		Iterator<Planta> p = plantas.iterator();
		boolean hayComplicacion = false;
		while(p.hasNext()) {
			Planta planta = p.next();
			if((planta.horasDeSolToleradas()) < this.horasDeSol) {
				hayComplicacion=true;
			}
			
		}
		return hayComplicacion;
	}
	
	public void plantarUnaPlanta(Planta planta) {
		ArrayList<Planta> plantitas = this.plantas;
		plantitas.add(planta);
		
		if(plantas.size() < this.maximoPlantas() && planta.horasDeSol<= this.horasDeSol +2) {
			plantas.add(planta);
		}
	}
	
	public boolean seAsociaBien(Planta planta) {
		return true;
	}


}
