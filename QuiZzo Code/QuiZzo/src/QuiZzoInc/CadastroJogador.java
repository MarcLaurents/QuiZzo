package QuiZzoInc;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroJogador {
	
	
	private Scanner input = new Scanner(System.in);
	private String idCadastroJogador;
	private String nomeJogador;
	private int personagemEscolhido;
	
	public CadastroJogador() {
		
	}

	public String getIdCadastroJogador() {
		return idCadastroJogador;
	}

	public void setIdCadastroJogador(String idCadastroJogador) {
		this.idCadastroJogador = idCadastroJogador;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador() {
		
		System.out.println("CADASTRO JOGADOR");
		System.out.print("Nome: ");
		
		this.nomeJogador = input.nextLine();
	}

	public int getPersonagemEscolhido() {
		return personagemEscolhido;
	}

	public void setPersonagemEscolhido(int personagemEscolhido) {
		this.personagemEscolhido = personagemEscolhido;
	}
	
	
	
	
	
	
}
