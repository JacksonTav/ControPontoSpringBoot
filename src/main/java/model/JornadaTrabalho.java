package model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Objects;

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
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
