
public class Soja extends Planta {

	public Soja(int anio, float altura) {
		super(anio, altura);
	}
	
	/*La tolerancia al sol depende de su altura: menor a 0.5 metros: 6 horas;
      entre 0.5 y 1 metro: 7 horas;
      más de 1 metro: 9 horas;*/
	
	@Override
	public float horasDeSolToleradas() {
		 if (this.altura<0.5f) {return 6f;}
		 	else if(this.altura<0.5f) {return 7f;}
		 		else {return 9f;}
	}
	
	/*La condición alternativa para que de semillas es su propia semilla 
	 * sea de obtención reciente (posterior al 2007)
	 *  y además su altura sea de más de 1 metro. El espacio que ocupa es la mitad de su altura.*/
	
	@Override
	public boolean daSemillas() {
		return this.esFuerte() &&  this.anioDeObtencion >2007 && this.altura>1;
	}
	
	public boolean parcelaIdeal(Parcela parcela) {
		return parcela.horasDeSol == this.horasDeSol;
		
	}
	
	
	
	
	
	
	
}
