package br.com.codewr.services;

import br.com.codewr.models.dtos.UserDTO;
import br.com.codewr.models.entities.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ModelMapper mapper;

    public UserDTO create(UserDTO userDTO) {
        UserEntity entity = mapper.map(userDTO, UserEntity.class);
        System.out.println(entity);
        return userDTO;
    }
}
