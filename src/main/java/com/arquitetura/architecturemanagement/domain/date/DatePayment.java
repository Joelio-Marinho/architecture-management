package com.arquitetura.architecturemanagement.domain.date;

import com.arquitetura.architecturemanagement.domain.value.Value;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Table(name = "date_payment")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DatePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDateTime expirationDate;

    @Column
    private LocalDateTime paymentDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "valorId",referencedColumnName = "id")
    private Value valorId;
}
