package Principal;
import Sala.Sala;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		List<Sala> salas = new ArrayList<>();
		int opcao = 0;
		try
		{
			opcao = Integer.parseInt(JOptionPane.showInputDialog ("Escolha a opção: " +
					"\n1- Adicionar"
					+ "\n2- Deletar"
					+ "\n3- Buscar"
					+ "\n4- Listar Todos"
					+ "\n5- Sair"));
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
		}
		
		while(opcao != 5) {

			switch(opcao)
			{
			case 1: 
			int numSala = 0, numAlunos = 0;
			String curso = "";
			try {
				numSala = Integer.parseInt(JOptionPane.showInputDialog ("Digite o número da sala: "));
				numAlunos = Integer.parseInt(JOptionPane.showInputDialog ("Digite a quantidade de alunos da sala: "));
				curso = JOptionPane.showInputDialog ("Digite o nome do curso da sala: ");
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Insira dados válidos!");
				break;
			}
			
			Sala sala = new Sala(numSala, numAlunos, curso);
			salas.add(sala);
			break;
			case 2:
				int count = 0;
				int item = 0;
				String lista = "";
				for (Sala s : salas) {
					lista += "Index: " + count  + " | Número da sala: " + s.getNumSala() + " | Número de alunos: " + s.getNumAlunos() + " | Curso: " + s.getCurso() + "\n";
					count++;
				}
				if(lista != "")
					
				{
					try {
						item = Integer.parseInt(JOptionPane.showInputDialog ("Considerando a lista:\n" + lista + "\nDigite o número index da sala que deseja remover: "));
					}
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, "Insira um index válido!");
						break;
					}
					salas.remove(item);
				}
				else {
					JOptionPane.showMessageDialog(null, "Não há salas!");
				}
			break;
			case 3:
				
				String itemBusca = "";
				int busca = 0, contagem = 0;
				try {
					busca = Integer.parseInt(JOptionPane.showInputDialog ("Digite o número da sala que deseja procurar: "));
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, "Insira um número de sala válido!");
					break;
				}
				
				for (Sala s : salas) {
					if(s.getNumSala() == busca)
					{
						itemBusca = "Index: " + contagem  + " | Número da sala: " + s.getNumSala() + " | Número de alunos: " + s.getNumAlunos() + " | Curso: " + s.getCurso() + "\n";
					}
					contagem++;
				}
				
				if(itemBusca != "")
				{
					JOptionPane.showMessageDialog(null, "Exibindo sala da busca\n" + itemBusca);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Sala não encontrada!");
				}
			break;
			case 4:
				int cont = 0;
				String lista1 = "";
				for (Sala s : salas) {
					lista1 += "Index: " + cont  + " | Número da sala: " + s.getNumSala() + " | Número de alunos: " + s.getNumAlunos() + " | Curso: " + s.getCurso() + "\n";
					cont++;
				}
				if(lista1 != "") {
					JOptionPane.showMessageDialog(null, "Exibindo lista de salas:\n" + lista1);
				}
				else {
					JOptionPane.showMessageDialog(null, "Não há salas cadastradas!");
				}
			break;
			}
			
			try
			{
				opcao = 0;
				opcao = Integer.parseInt(JOptionPane.showInputDialog ("Escolha a opção: " +
						"\n1- Adicionar"
						+ "\n2- Deletar"
						+ "\n3- Buscar"
						+ "\n4- Listar Todos"
						+ "\n5- Sair"));
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Insira uma opção válida!");
			}
			
		}
		JOptionPane.showMessageDialog(null, "Saindo do programa...");
	}
}
