import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Conteudo;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
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
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
				
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
		System.out.println("XP :" + devJoao.calcularTotalXp());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
		System.out.println("XP :" + devJoao.calcularTotalXp());
	}
}
 