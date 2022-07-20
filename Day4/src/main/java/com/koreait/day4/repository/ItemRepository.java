package com.koreait.day4.repository;

import com.koreait.day4.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findById(Long id);

    Optional<List<Item>> findByStatusOrderByIdDesc(String status);
}
