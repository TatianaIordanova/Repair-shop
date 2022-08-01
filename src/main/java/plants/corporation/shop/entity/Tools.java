package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "TOOL")
public class Tools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "QUANTITY")
    private Integer quantity;
}
