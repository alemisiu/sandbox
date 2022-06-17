package pl.javastart.equipy.components.user;

class UserMapper {

    static UserDto toDto(UserDbo userDbo) {
        UserDto dto = new UserDto();
        dto.setId(userDbo.getId());
        dto.setFirstName(userDbo.getFirstName());
        dto.setLastName(userDbo.getLastName());
        dto.setPesel(userDbo.getPesel());
        return dto;
    }

    static UserDbo toEntity(UserDto user) {
        UserDbo entity = new UserDbo();
        entity.setId(user.getId());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setPesel(user.getPesel());
        return entity;
    }
}