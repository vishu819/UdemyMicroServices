package com.example.Accounts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Accounts.Entity.Account;

public interface AccountRepo extends JpaRepository<Account, String>{

}
