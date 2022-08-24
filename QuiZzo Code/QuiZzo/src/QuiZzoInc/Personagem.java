package QuiZzoInc;

import java.util.ArrayList;

public class Personagem {
	private String idPersonagem;
	private String nomePersonagem;
	private ArrayList<String> habilidades;
	private Boolean statusPersonagem; // SE O PERSONAGEM JA FOI ESCOLHIDO OU NAO (TRUE = ESCOLHIDO | FALSE = NAO ESCOLHIDO)	
	private double tempoVida;
	
/*-----------------------------------------------------METODO CONSTRUTOR INICIO------------------------------------------------------------------------------------------------------------------*/
	// O CONSTRUTOR � UM METODO ESPECIAL QUE � CHAMADO TODA VEZ QUE VOC� INICIALIZA OU CRIA UM OBJETO DESSA CLASSE
	public Personagem(String idPersonagem, String nomePersonagem, ArrayList<String> habilidades, boolean statusPersonagem, double tempoVida) {
		this.idPersonagem = idPersonagem;
		this.nomePersonagem = nomePersonagem;
		this.habilidades = habilidades;
		this.statusPersonagem = false;
		this.tempoVida = 100.0;
		
		
	}
/*-----------------------------------------------------METODO CONSTRUTOR FIM---------------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------------METODO CONSTRUTOR FIM---------------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------------METODOS GET INICIO------------------------------------------------------------------------------------------------------------------------*/
	public String getidPersonagem() {
		return this.idPersonagem;
	}
	
	public String getnomePersonagem() {
		return this.nomePersonagem;
	}
	
	//public Boolean getstatusPersonagem() {
	//	return this.statusPersonagem;
	//}
	
	public Boolean isStatusPersonagem() {
		return this.statusPersonagem;
	}
	
	public ArrayList<String> gethabilidades() { 
		return this.habilidades;
	}
	
	public double gettempoVida() {
		return this.tempoVida;
	}
	

/*-----------------------------------------------------METODOS SET INICIO------------------------------------------------------------------------------------------------------------------------*/
	
	public void setidPersonagem(String idPersonagem) {
		this.idPersonagem = idPersonagem;
	}
	
	public void setnome(String NomePersonagem) {
		this.nomePersonagem = NomePersonagem;
	}
	
	public void setStatusPersonagem(boolean StatusPersonagem) {
		this.statusPersonagem = StatusPersonagem;
	}
	
	public void sethabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
		
	}
	
	public void settempoVida() {
		this.tempoVida = 100.0;
	}	
	
	//public void isStatusPersonagem(boolean StatusPersonagem) {
	//	this.statusPersonagem = statusPersonagem;
	//}
	
	
	
}

