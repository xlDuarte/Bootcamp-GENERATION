package exercicioclassesobjetos7;

public class TestePaciente {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7) Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
		//em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.
		
		Paciente pac = new Paciente();
		
		pac.setNome("Gabriel");
		pac.setGenero("Duarte");
		pac.setIdade(27);
		
		System.out.println();
		System.out.println("||||||||||||||||||||||||||||");
		System.out.println("|Nome do Paciente: " + pac.getNome() + " |");
		System.out.println("|Gênero do Paciente: " + pac.getGenero() + "|");
		System.out.println("|Idade do Paciente: " + pac.getIdade() + "     |");
		System.out.println("||||||||||||||||||||||||||||");
		
		System.out.println();
		System.out.println("Iniciando Cadastro do Paciente:");
		pac.FazerCadastro();
		System.out.println();
		
		System.out.println("Agendar consulta para o Paciente? ");
		pac.FazerCadastro();
		System.out.println();
				
		System.out.println("Pedir receita de medicamentos para o paciente? ");
		pac.FazerCadastro();
	}
}
