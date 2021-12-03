package com.example.todo.persistence;

import com.example.todo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
//    @Query(value = "select * from Todo where userId = ?1", nativeQuery = true)
    List<TodoEntity> findByUserId(String userId);

    // 생성, 검색, 수정, 삭제제
}
