import java.util.TimerTask;
public class Cronometro {

  Segundero segundos;
  Minutero minutos;
  Horario horas;
  
	  public Segundero getSegundos(){
	    return this.segundos; 
	  }
	  public Minutero getMinutos(){
		    return this.minutos; 
		  }
	  public Horario getHoras(){
		    return this.horas; 
		  }

  public Cronometro (){
    segundos= new Segundero();
    minutos = new Minutero();
    horas = new Horario();
  }

	 	public void Start (){
	  		segundos.Avanzar();
	  	  		if(segundos.getUnidadDeTiempo()==0) {
	  	  			minutos.Avanzar();
	  	  			if(minutos.getUnidadDeTiempo()==0) {
	  	  				horas.Avanzar();
	  	  				}
	  	  			}
 }


}

