import java.util.Iterator;

public class SojaTransgenica extends Soja{

	public SojaTransgenica(int anio, float altura) {
		super(anio,altura);
		
	}
	
	/*La soja transgénica nunca da nuevas semillas, porque las empresas que las comercializan 
	 * las someten adrede a un proceso de esterilización
	 *  (que les asegura no perder nunca a su clientes).
	 *   Ojo: la consulta siempre tiene que dar falso, incluso si se cumple la condición general.*/
	@Override
	public boolean daSemillas() {
		return false;
	}
	
	public boolean parcelaIdeal(Parcela parcela) {
		return parcela.plantas.size() == 1;
		
	}    
	

}
