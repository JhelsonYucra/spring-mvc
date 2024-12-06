package pe.edu.i202224141.cl2_spring_mvc_Yucra_Jhelson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> {
                    // Configura CSRF si es necesario, por ejemplo, para ignorar ciertas rutas:
                    // csrf.ignoringRequestMatchers("/ignore-csrf");
                })
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().permitAll() // Permitir acceso a todas las rutas (ajústalo según tus necesidades)
                );
        return http.build();
    }
}
