package com.caiovlf.controledeponto.api.configuration;

public class SecurityConfiguration   {
	
}

/*
RE-WRITE THIS CLASS WITH THE CODE BELOW TO USE PROJECT WITHOUT JWT

@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
 // USE THIS WITH OUT JWT
	
	
	@Override
    protected void configure(HttpSecurity http) throws Exception{
    	
        http
        .authorizeRequests()
        .antMatchers("/**")
        .permitAll()
        .and()
        .authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        .csrf().disable();
    }
}



*/