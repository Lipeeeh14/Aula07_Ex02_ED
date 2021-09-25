package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.FilaString.Fila;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {	
		int op = 0;
		Fila telFila = new Fila();
		TelefoneController tContr = new TelefoneController();
		String telefone;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("=========== MENU ===========\n"
											+ "Escolha a opera��o:\n"
											+ "1 - Inserir telefone\n"
											+ "2 - Listar telefones\n"
											+ "0 - Sair"));
			switch(op) {
				case 0:
					JOptionPane.showMessageDialog(null, "At� a pr�xima!");
					break;
				case 1:
					telefone = JOptionPane.showInputDialog("Insira o telefone");
					tContr.insereLigacao(telFila, telefone);
					break;
				case 2:
					try {
						tContr.consultaLigacoes(telFila);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "N�o h� nenhuma liga��o");
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o inv�lida, tente novamente!");
			}
		} while(op > 0);
	}

}
