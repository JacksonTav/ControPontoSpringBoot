package model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

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
public class NivelAcesso {
    @Id
    private Long id;
    private String descricao;
}
