package com.example.expense_journal_api.repository;

import com.example.expense_journal_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {


}
