package api.foro.hub.dto.respuesta;

import api.foro.hub.modelo.Respuesta;

public record DatosRetornoRespuesta(String mensaje, String topico, String autor) {

    public DatosRetornoRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
