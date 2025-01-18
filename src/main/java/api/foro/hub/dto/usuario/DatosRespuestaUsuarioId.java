package api.foro.hub.dto.usuario;

import api.foro.hub.modelo.Usuario;

public record DatosRespuestaUsuarioId(String nombre, String email, String password, String tipo) {

    public DatosRespuestaUsuarioId(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getPassword(), usuario.getTipo().toString());
    }
}
