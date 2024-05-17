package com.arquitetura.architecturemanagement.domain.user;

import com.arquitetura.architecturemanagement.domain.address.Address;
import com.arquitetura.architecturemanagement.domain.user.Enum.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "Users")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String cpf;

    @Column
    private String password;

    @Column
    private Role role;




}
