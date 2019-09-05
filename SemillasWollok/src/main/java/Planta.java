
public class Planta {
	public int anioDeObtencion;
	public float altura;
	public float horasDeSol;
	
	
	public Planta(int anio, float altura) {
		this.altura = altura;
		this.anioDeObtencion = anio;
		
	}
	public float horasDeSolToleradas() {
		return horasDeSol;
	}
	
	public boolean esFuerte() {
		return this.horasDeSolToleradas() > 10;
	}
	
	public boolean daSemillas() {
		return this.esFuerte();
	}
	
	public float espacioQueOcupa() {
		return 2;
	}	

}


