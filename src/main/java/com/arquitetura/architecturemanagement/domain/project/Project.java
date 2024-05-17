package com.arquitetura.architecturemanagement.domain.project;


import com.arquitetura.architecturemanagement.domain.address.Address;
import com.arquitetura.architecturemanagement.domain.user.User;
import com.arquitetura.architecturemanagement.domain.value.Value;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "project")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address",referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client",referencedColumnName = "id")
    private User client;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "architect",referencedColumnName = "id")
    private User architect;

    @Column
    private String description;

    @Column
    private Boolean finished;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Value",referencedColumnName = "id")
    private Value Value;
}
