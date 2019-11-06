package ac.za.cput.cardealership.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class cardealershipSecurity extends WebSecurityConfigurerAdapter {

    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";


    @Override
    protected void configure(AuthenticationManagerBuilder cutter)
            throws Exception {
        cutter.inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles(USER_ROLE)
                .and()
                .withUser("Admin")
                .password(encoder().encode("12345"))
                .roles(ADMIN_ROLE,USER_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http)
            throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"cardealership/Warning/**/create/**").hasRole(USER_ROLE)
                .anyRequest()
                .authenticated().and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
                .formLogin()
                .disable();

    }
    @Bean
    public PasswordEncoder encoder(){
        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
