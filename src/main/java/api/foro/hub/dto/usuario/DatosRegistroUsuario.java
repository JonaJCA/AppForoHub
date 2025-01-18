package api.foro.hub.dto.usuario;

import api.foro.hub.modelo.Tipo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroUsuario(@NotBlank
                                   String nombre,
                                   @NotBlank
                                   @Email
                                   String email,
                                   @NotBlank
                                   String password,
                                   @NotNull
                                   Tipo tipo) {
}
