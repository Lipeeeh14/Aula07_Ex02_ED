package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.FilaString.Fila;

public class TelefoneController {
	
	public TelefoneController() { }
	
	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}
	
	public void consultaLigacoes(Fila f) throws Exception {
		f.list();
	}
	
}
