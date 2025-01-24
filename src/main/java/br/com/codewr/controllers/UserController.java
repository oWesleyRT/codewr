package br.com.codewr.controllers;

import br.com.codewr.models.dtos.UserDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    @PostMapping()
    public void create(@Valid @RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
    }
}
