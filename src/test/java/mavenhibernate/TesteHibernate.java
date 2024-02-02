package mavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {
	
	@Test
	public void testeHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setIdade(26);
		pessoa.setLogin("asdfasdf");
		pessoa.setNome("Adriel 2");
		pessoa.setSenha("1234");
		pessoa.setSobrenome("santos");
		pessoa.setEmail("asf@fsadf");
		
		daoGeneric.salvar(pessoa);
		
	}

}
