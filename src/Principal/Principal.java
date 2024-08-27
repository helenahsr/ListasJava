package Principal;
import Sala.Sala;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		List<Sala> salas = new ArrayList<>();
		int opcao = 0;
		opcao = Integer.parseInt(JOptionPane.showInputDialog ("Escolha a opção: " +
				"\n1- Adicionar"
				+ "\n2- Deletar"
				+ "\n3- Buscar"
				+ "\n4- Listar Todos"
				+ "\n5- Sair"));
		
		while(opcao != 5) {

			switch(opcao)
			{
			case 1:
			int numSala, numAlunos;
			String curso;
			numSala = Integer.parseInt(JOptionPane.showInputDialog ("Digite o número da sala: "));
			numAlunos = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade de alunos da sala: "));
			curso = JOptionPane.showInputDialog ("Digite o nome do curso da sala: ");
			Sala sala = new Sala(numSala, numAlunos, curso);
			salas.add(sala);
			break;
			case 2:
				
			break;
			}
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog ("Escolha a opção: " +
					"\n1- Adicionar"
					+ "\n2- Deletar"
					+ "\n3- Buscar"
					+ "\n4- Listar Todos"
					+ "\n5- Sair"));
		}
		
		
		
	}
}
