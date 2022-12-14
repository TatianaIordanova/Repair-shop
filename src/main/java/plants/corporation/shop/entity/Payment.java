package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PAYMENT_NUMBER")
    private long id;

    @Column(name = "PAYMENT_WORKER_ID")
    private long workerId;

    @Column(name = "PAYMENT_REPAIR_ID")
    private long repairId;
}
