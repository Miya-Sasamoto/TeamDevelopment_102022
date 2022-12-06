package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;

	//		 @Autowired
	//		    private MessageSource messageSource;
	//	
	//		    @Bean
	//		    public LocalValidatorFactoryBean validator()
	//		    {
	//		        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
	//		        localValidatorFactoryBean.setValidationMessageSource(messageSource);
	//		        return localValidatorFactoryBean;
	//		    }
	//		    @Override
	//			public Validator getValidator()
	//		    {
	//		        return validator();
	//		    }

	/*@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	  BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	  return bCryptPasswordEncoder;
	}*/

	@Bean
	@Autowired
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/**セキュリティ」の対象外を設定*/
	@Override
	public void configure(WebSecurity web) throws Exception {

		//セキュリティを適用しない

		web
				.ignoring()
				.antMatchers("/webjars")
				.antMatchers("/css")
				.antMatchers("/js")
				.antMatchers("h2-console");
	}

	/**セキュリティの各種設定*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//ログイン不要ページの設定
		http
				.authorizeRequests()
				.antMatchers("/login1").permitAll()//直リンクOK
				.antMatchers("/user/NewRegister").permitAll()//直リンクOK
				.anyRequest().authenticated();//それ以外は直リンクNG

		//ログイン処理
		http
				.formLogin()
				.loginProcessingUrl("/login1")//ログイン処理のパス
				.loginPage("/login1")//ログインページの指定
				.defaultSuccessUrl("/Mypage1", true)//成功後の遷移先
				.failureUrl("/login?error")//ログイン失敗時の遷移先
				.usernameParameter("id")//ログインページのユーザーID
				.passwordParameter("pass")//ログインページのパスワード
				.permitAll();

		//CSRF対策を無効に設定(一時的)
		/*http.csrf().disable();*/

	}

	/*認証の設定*/
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {

		PasswordEncoder encoder = passwordEncoder();

		auth
				.userDetailsService(userDetailsService)
				.passwordEncoder(encoder);

		//インメモリ認証
		auth
				.inMemoryAuthentication()
				.withUser("user")//userを追加
				.password("user")
				.roles("user")
				.and()
				.withUser("admin")//adminを追加
				.password("admin")
				.roles("ADMIN");

	}

}