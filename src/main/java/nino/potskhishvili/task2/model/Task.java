package nino.potskhishvili.task2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    String title;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    Date startDate;
    @Column(nullable = false)
    Date endDate;

}
