package com.dellead;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityWebConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/resources/**", "/webjarv/**").permitAll()
			.and()
			.formLogin()
			.permitAll()
			.and()
			.rememberMe();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("aluno1").password("{noop}123")
			.roles("USER");
	}
	
//	public static void main(String[] args) {
//		System.out.println(new BCryptPasswordEncoder().encode("123"));
//	}

}
