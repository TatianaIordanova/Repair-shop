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
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PAYMENT_NUMBER")
    private long id;

    @Column(name = "PAYMENT_WORKER_ID")
    private long workerId;

    @Column(name = "PAYMENT_REPAIR_ID")
    private long repairId;
}
