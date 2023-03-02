package io.security.corespringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.security.corespringsecurity.domain.entity.Account;

@Repository
public interface UserRepository extends JpaRepository<Account, Long>  {

	Account findByUsername(String username);

}
