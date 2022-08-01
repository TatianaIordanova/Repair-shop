package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "PRICE_LIST")
public class PriceList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LIST_NUMBER")
    private long id;

    @Column(name = "WORK_TYPE")
    private String workType;

    @Column(name = "COST")
    private Double cost;
}
