package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ConfiguracaoSeguracaWeb extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	private static final String Permicao_Usuario = "SELECT u.login, p.nome FROM usuario_permissao up"
			+ " JOIN usuario u ON u.id = up.usuario_id"
			+ " JOIN permissao p ON p.id = up.permissoes_id"
			+ " WHERE u.login = ?";
	
	private static final String Login_Usuario = "SELECT login, senha, ativo, nome FROM usuario"
			+ " WHERE login = ?";

//	Autenticacao via jdbc
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.jdbcAuthentication()
			.dataSource(dataSource)
			.passwordEncoder(new BCryptPasswordEncoder())
			.usersByUsernameQuery(Login_Usuario);
	}
	
	
//	Autenticação em memoria
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//			.withUser("aluno1").password("123")
//				.roles("USER")
//				.and()
//				.withUser("aluno2").password("123")
//				.roles("USER");
//
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.permitAll();
	}
	
}
