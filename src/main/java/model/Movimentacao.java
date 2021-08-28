package model;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class Movimentacao {

    /* Para fazer uma classe com chave composta */
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }

    /* chamando a chave composta */
    @Id
    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrega;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
