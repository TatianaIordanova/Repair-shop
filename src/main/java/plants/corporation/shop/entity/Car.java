package plants.corporation.shop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MODEL_NUMBER")
    private long id;

    @Column(name = "CAR_MODEL", length = 100, nullable = true)
    private String model;

    @Column(name = "CAR_NUMBER", length = 15, nullable = false)
    private String number;

}
