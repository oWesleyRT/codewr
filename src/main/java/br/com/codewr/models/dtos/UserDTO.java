package br.com.codewr.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDTO {
    @NotBlank(message = "Name can't be blank")
    private String name;

    @NotBlank(message = "E-mail can't be blank")
    @Email(message = "Invalid e-mail")
    private String email;

    @NotBlank(message = "Role can't be blank")
    private String role;

    @Size(min = 8, message = "Password must be have 8 caracteres")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).+$\n")
    private String password;
}
