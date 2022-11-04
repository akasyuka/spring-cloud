package org.example.fraud;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "customer_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    public Integer id;
    public Integer customerId;
    public Boolean isFraudster;
    public LocalDateTime createdAT;

}
