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


    Optional<UserDto> findById(Long id) {
        return userRepository.findById(id).map(UserMapper::toDto);
    }


    UserDto save(UserDto user) {
        Optional<UserDbo> userByPesel = userRepository.findByPesel(user.getPesel());
        userByPesel.ifPresent(u -> {
            throw new DuplicatePeselException();
        });
        UserDbo userEntity = UserMapper.toEntity(user);
        UserDbo savedUser = userRepository.save(userEntity);
        return UserMapper.toDto(savedUser);
    }

    UserDto update(UserDto user) {
        Optional<UserDbo> userByPesel = userRepository.findByPesel(user.getPesel());
        userByPesel.ifPresent(u -> {
            if(!u.getId().equals(user.getId()))
                throw new DuplicatePeselException();
        });
        return mapAndSaveUser(user);
    }

    private UserDto mapAndSaveUser(UserDto user) {
        UserDbo userEntity = UserMapper.toEntity(user);
        UserDbo savedUser = userRepository.save(userEntity);
        return UserMapper.toDto(savedUser);
    }



}



