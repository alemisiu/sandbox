package pl.javastart.equipy.components.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDbo, Long> {
    Optional<UserDbo> findByPesel(String pesel);
    List<UserDbo> findAllByLastNameContainingIgnoreCase(String lastName);
}