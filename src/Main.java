import java.time.LocalDate;

import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
		
		//impressão
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
	}
}
 