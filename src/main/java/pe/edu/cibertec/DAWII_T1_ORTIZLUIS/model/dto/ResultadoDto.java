package pe.edu.cibertec.DAWII_T1_ORTIZLUIS.model.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResultadoDto {
    private Boolean respuesta;
    private String mensaje;
}
