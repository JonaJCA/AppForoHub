package api.foro.hub.dto.usuario;

import api.foro.hub.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String password, Tipo tipo) {
}
