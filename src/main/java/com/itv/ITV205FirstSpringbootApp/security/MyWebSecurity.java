package com.itv.ITV205FirstSpringbootApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurity extends WebSecurityConfigurerAdapter
{
	
//Authentication
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	 auth.inMemoryAuthentication()
		.withUser("jethalal")
		.password("babita123")		// cleartext
		.authorities("ADMIN")		//CRUD
		.and()
		.withUser("nattu")
		.password("nattu123")		// cleartext
		.authorities("USER")
	    .and()
	  	.withUser("bagha")
		.password("bagha123")		// cleartext
		.authorities("USER");
}

	@Bean
	public PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}


//Authorisation
@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
    .anyRequest().authenticated()
    .and()        
    .formLogin().loginProcessingUrl("/login").successForwardUrl("/blinkit/v1/homepage").permitAll()
    .and()
    .cors().and().csrf().disable();

	}
}
