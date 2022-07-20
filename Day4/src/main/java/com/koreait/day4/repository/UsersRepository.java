package com.koreait.day4.repository;

import com.koreait.day4.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    // select * from users where userid=?
    Optional<Users> findByUserid(String userid);

    // select * from users where userid=? and userpw=?
    Optional<Users> findByUseridAndUserpw(String userid, String userpw);

    // select * from users where status=? order by id desc
    Optional<List<Users>> findByStatusOrderByIdDesc(String status);
}
