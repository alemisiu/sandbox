package pl.javastart.equipy.components.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitDb implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        userRepository.deleteAll();

        UserDbo u1 = new UserDbo();
        u1.setFirstName("Jan");
        u1.setLastName("Kowalski");
        u1.setPesel("90101222457");
        userRepository.save(u1);

        UserDbo u2 = new UserDbo();
        u2.setFirstName("Maciej ");
        u2.setLastName("Zalewski");
        u2.setPesel("87112242456");
        userRepository.save(u2);


        UserDbo u3 = new UserDbo();
        u3.setFirstName("Aneta");
        u3.setLastName("Korczyńska");
        u3.setPesel("76061536749");
        userRepository.save(u3);


        UserDbo u4 = new UserDbo();
        u4.setFirstName("Wojciech");
        u4.setLastName("Sokolik");
        u4.setPesel("82010877245");
        userRepository.save(u4);


    }
}
