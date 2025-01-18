package api.foro.hub.dto.respuesta;

import api.foro.hub.dto.topico.DatosRespuestaTopico;
import api.foro.hub.dto.usuario.DatosRespuestaUsuario;
import api.foro.hub.modelo.Respuesta;

public record DatosRetornoRespuestaId(String mensaje, DatosRespuestaTopico topico, String fechaCreacion, DatosRespuestaUsuario autor, String solucion) {

    public DatosRetornoRespuestaId(Respuesta respuesta) {
        this(respuesta.getMensaje(), new DatosRespuestaTopico(respuesta.getTopico()), respuesta.getFechaCreacion().toString(),
                new DatosRespuestaUsuario(respuesta.getAutor()), respuesta.getSolucion().toString());
    }
}
