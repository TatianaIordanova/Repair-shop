package plants.corporation.shop.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@Table(name = "LABOR_ACCOUNTING")
public class WorkAccounting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "WORK_TYPE")
    private String workType;

    @Column(name = "LABOR_WORKER_ID")
    private long workerId;

    @Column(name = "LABOR_REPAIR_ID")
    private long RepairId;
}
