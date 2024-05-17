package com.arquitetura.architecturemanagement.domain.value;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "Value")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Value implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Float finalValue;

    @Column
    private Float inputValue;

    @Column
    private Integer installmentQuantity;

    @Column
    private Float remainingValue;

}
