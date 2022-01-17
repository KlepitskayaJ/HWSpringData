package com.ita.u1.boothw;


import com.ita.u1.boothw.model.Role;
import com.ita.u1.boothw.model.User;
import com.ita.u1.boothw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DatabaseInserter implements CommandLineRunner {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public DatabaseInserter(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();
        role.setRole("ADMIN");
        User jen = new User();
        jen.setFirstName("test12");
        jen.setEmail("test12@gmail.com");
        jen.setPassword(passwordEncoder.encode("1234"));
        jen.addRole(role);
        userRepository.save(jen);
    }
}