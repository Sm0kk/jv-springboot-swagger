package mate.academy.springboot.swagger.dto.mapper;

public interface RequestDtoMapper<D, T> {
    T toModel(D dto);
}