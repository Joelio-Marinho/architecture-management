package com.arquitetura.architecturemanagement.repositories;

import com.arquitetura.architecturemanagement.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    UserDetails findByName(String name);

    Boolean existsByNameAndCpf(String name, String cpf);
}
