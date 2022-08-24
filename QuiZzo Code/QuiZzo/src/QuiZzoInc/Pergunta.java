package QuiZzoInc;

import java.util.ArrayList;

public class Pergunta  {
	private String idPergunta;
	private String enunciado;
	private ArrayList<Alternativa> alternativas; 
	
	
/*-----------------------------------------------------METODO CONSTRUTOR INICIO------------------------------------------------------------------------------------------------------------------*/
	public Pergunta() {
		this.alternativas = new ArrayList();
	}
	
	
/*-----------------------------------------------------METODO CONSTRUTOR FIM---------------------------------------------------------------------------------------------------------------------*/

/*-----------------------------------------------------METODOS GET INICIO------------------------------------------------------------------------------------------------------------------------*/
	public String getIdPergunta() {
		return this.idPergunta;
	}
	
	public String getEnunciado() {
		return this.enunciado;
	}
	
	public ArrayList<Alternativa> getAlternativa() {
		return this.alternativas;
	}
	
	
	
/*-----------------------------------------------------METODOS SET INICIO------------------------------------------------------------------------------------------------------------------------*/
	public void setIdPergunta(String idPergunta) {
		this.idPergunta = idPergunta;
	}
	
	public void setEnunciado(String Enunciado) {
		this.enunciado = enunciado;
	}
	
	public void setAlternativas(ArrayList<Alternativa> alternativa) {
		this.alternativas = alternativas;
	}
	
	public ArrayList<Alternativa> getAlternativas() {
		return this.alternativas;
	}
	
	@Override
	public String toString() {		
		return "Pergunta " + this.enunciado + this.alternativas;
	}
	
	public void preencherPerguntas(ArrayList<Pergunta> perguntas) {
		int numeroPerguntas = 10;
		Pergunta pergunta1 = new Pergunta();
		ArrayList<Alternativa> alternativa = new ArrayList();
		
		pergunta1.setEnunciado("Pergunta 1 teste?");
		Alternativa a1 = new Alternativa("Resposta 1 teste!", false);
		Alternativa b1 = new Alternativa("Resposta 2 teste!", true);
		Alternativa c1 = new Alternativa("Resposta 3 teste!", false);
		Alternativa d1 = new Alternativa("Resposta 4 teste!", false);
		alternativas.add(a1);
		alternativas.add(b1);
		alternativas.add(c1);
		alternativas.add(d1);
		pergunta1.setAlternativas(alternativas);
		alternativas.clear();
		
		
		for (int i = 0; i < numeroPerguntas; i++) {
			perguntas.add(pergunta1);
		}
	} 

}









































