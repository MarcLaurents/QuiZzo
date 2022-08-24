package QuiZzoInc;

import java.util.ArrayList;

public class MenuEscolhaPersonagem {	

	private String idEscolhaPersonagem;
    private ArrayList<String> personagem;
    
    /*------------------------------------------------------------INICIO METODO CONSTRUTOR-------------------------------------------------------*/
    public void MenuEscolhaPersonagem (String idEscolhaPersonagem, ArrayList<String> personagem) {
    	this.idEscolhaPersonagem = idEscolhaPersonagem;
    	this.personagem = personagem;
    }

	public String getIdEscolhaPersonagem() {
		return idEscolhaPersonagem;
	}

	public void setIdEscolhaPersonagem(String idEscolhaPersonagem) {
		this.idEscolhaPersonagem = idEscolhaPersonagem;
	}

	public ArrayList<String> getPersonagem() {
		return personagem;
	}

	public void setPersonagem(ArrayList<String> personagem) {
		this.personagem = personagem;
	}    
    
    

}

