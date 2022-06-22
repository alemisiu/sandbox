package pl.javastart.equipy.components.user.inventory.user;

public class UserMapper {

    public static UserDto toDto(User userDbo) {
        UserDto dto = new UserDto();
        dto.setId(userDbo.getId());
        dto.setFirstName(userDbo.getFirstName());
        dto.setLastName(userDbo.getLastName());
        dto.setPesel(userDbo.getPesel());
        return dto;
    }

    public static User toEntity(UserDto user) {
        User entity = new User();
        entity.setId(user.getId());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setPesel(user.getPesel());
        return entity;
    }
}