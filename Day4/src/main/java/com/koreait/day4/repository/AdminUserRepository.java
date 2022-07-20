package com.koreait.day4.repository;

import com.koreait.day4.model.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Long> {
    // select * from admin_user where userid = ?
    Optional<AdminUser> findByUserid(String userid);
}
