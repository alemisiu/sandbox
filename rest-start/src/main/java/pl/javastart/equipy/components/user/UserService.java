package pl.javastart.equipy.components.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
class UserService {

    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    List<UserDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());

    }

    UserDto save(UserDto userDbo) {
        Optional<UserDbo> userByPesel = userRepository.findByPesel(userDbo.getPesel());
        userByPesel.ifPresent(u -> {
            try {
                throw new DuplicatePeselException();
            } catch (DuplicatePeselException e) {
                throw new RuntimeException(e);
            }
        });
        UserDbo userEntity = UserMapper.toEntity(userDbo);
        UserDbo savedUser = userRepository.save(userEntity);
        return UserMapper.toDto(savedUser);
        }
    public List<UserDto> findByLastName(String lastName) {
        return userRepository.findAllByLastNameContainingIgnoreCase(lastName)
                .stream()
                .map(UserMapper::toDto)
                .collect(Collectors.toList());
    }
}



