package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MODEL_NUMBER")
    private long id;

    @Column(name = "CAR_MODEL", length = 100, nullable = true)
    private String model;

    @Column(name = "CAR_NUMBER", length = 15, nullable = false)
    private String number;

}
