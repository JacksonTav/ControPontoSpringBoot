package model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/*
 * Dependêcia Lombok:
 *   - Pode evitar toda a digitação de getters, setters, construtor com parametros e sem, além do equals e hashCode
 *     Com as anotações abaixou ou então utilizando @Data
 * */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
    @Id
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;
    private TipoData tipoData;
}
