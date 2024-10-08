package miu.edu.deliverysystem.config;

import lombok.RequiredArgsConstructor;
import miu.edu.deliverysystem.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@RequiredArgsConstructor
public class ApplicationConfiguration {
    private final UserRepository userRepository;

//    @BCryptPasswordEncoderBean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        //to encode and validate the password
//        authProvider.setPasswordEncoder(passwordEncoder());
//        authProvider.setUserDetailsService(userDetailsService());
//        return authProvider;
//
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return username ->
//                userRepository.findByUsername(username)
//                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(
//            AuthenticationConfiguration configuration) throws Exception {
//        return configuration.getAuthenticationManager();
//
//    }
}
