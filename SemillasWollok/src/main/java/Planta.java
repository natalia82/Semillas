
public class Planta {
	public int anioDeObtencion = 2000;
	public float altura = 0f;
	public float horasDeSol=0f;
	
	
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
		return 0;
	}	
	
	public boolean parcelaIdeal(Parcela parcela) {
		return true;
	}
	
	public boolean seAsociaBien(Parcela parcela) {
		return parcela.seAsociaBien(this);
	}

}


