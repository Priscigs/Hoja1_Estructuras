/**
 * 
 * @author Priscilla González
 *
 */
public class Radio implements Interface{
	
	private String[] emisora = {"Emisora1", "Emisora2", "Emisora3", "Emisora4", "Emisora5", "Emisora6", "Emisora7"};
	private int cant;
	private int tamanio;
	
/** method constructor especificando el numero de objetos a crear
	*@param  tamanio
	*@return ninguno
*/
	public Radio(){
		/*cant = 0;
		this.tamanio = tamanio;
		emisora = new String[tamanio];*/
	}
	
	/*public boolean agregarEmisora(String emi){
		String emisoraX = new String(emi);
		if(cant < tamanio){
			emisora[cant] =  emisoraX;
			cant++;
			return true;
		}
		else return false;
	}*/
	
	public String emisora() {
		String mensaje = "";
		for(int i = 0; i < emisora.length; i++){
			mensaje = "Elegiste: " + emisora[i];
		}
		return mensaje;
	}
	
	/**
	 * @return true si está encendido, false si está apagado
	 */
	public boolean encenderApagar() {
		int on = 1;
		if(on == 1)
		{
			return true;
		}
		else {
			return false;	
		}
	}
	
	/**
	 * @return true si es am, false si es fm
	 */
	public boolean amFm() {
		String emisora = "";
		if(emisora == "am") {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * @param botón a ingresar
	 * @return emisora guardada o no
	 */
	public String guardar(int btn) {
		if(btn >= 1 && btn <= 12) {
			return "Se guardó la emisora en el boton: " + btn;
		}
		return "No existe ese botón. Intenta de nuevo";
	}
	
	/**
	 * @param botón a ingresar
	 * @return emisora seleccionada o no
	 */
	public String seleccionar(int btn) {
		if(btn >= 1 && btn <= 12) {
			return "Emisora seleccionada";
		}
		return "No existe ese botón. Intenta de nuevo";
	}
	
	/**
	 * Avanza de 0.2 en cada emisora
	 * @return emisora en la que se encuentra
	 */
	public double avanzar() {
		double num = 0;
		for(double i = 87.9; i <= 107.9; i++) {
			num += 0.2;
		}	
		return num;
	}
	
	public String toString() {
		String mensaje = "";
		for (int i = 0; i < cant; i++) {
			mensaje = emisora[i].toString();
		}
		return mensaje;
	}
}
