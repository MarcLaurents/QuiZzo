package QuiZzoInc;

import java.util.ArrayList;

public class Alternativa {	
	private String enunciado;
	private boolean statusAlternativa;
	
	
/*-----------------------------------------------------METODO CONSTRUTOR INICIO------------------------------------------------------------------------------------------------------------------*/
	public Alternativa(String enunciado, boolean statusAlternativa) {
		
		this.enunciado = enunciado;
		this.statusAlternativa = statusAlternativa;		
	}
	
/*-----------------------------------------------------METODOS GET INICIO------------------------------------------------------------------------------------------------------------------------*/
	public String getenunciado() {
		return enunciado;
	}		
	
/*-----------------------------------------------------METODOS SET INICIO------------------------------------------------------------------------------------------------------------------------*/
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public boolean isStatusAlternativa() {
		return statusAlternativa;
	}

	public void setStatusAlternativa(boolean statusAlternativa) {
		this.statusAlternativa = statusAlternativa;
	}
	
	/*-----------------------------------------------------METODOS TO STRING------------------------------------------------------------------------------------------------------------------------*/	

	
}