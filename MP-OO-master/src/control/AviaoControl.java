package control;

import javax.swing.JOptionPane;

public class AviaoControl {
	public static boolean checkNome(String valor) {

		//Limitar o usuário a escrever apenas letras na sessão "Nome"
		if (valor.matches("[a-zA-Z]+"))
			return true;
		else {
			JOptionPane.showMessageDialog(null, "Digite um nome válido (apenas letras).", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public static boolean checkTel(String valor) {

		//Limitar o usuário a escrever apenas números na sessão "Telefone"
		if (valor.matches("[0-9]+"))
			return true;
		else {
			JOptionPane.showMessageDialog(null, "Digite um telefone válido (apenas números).", "Erro",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}
}
