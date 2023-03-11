package com.txtanon.TodoApp.cmd.repositories;

import com.txtanon.TodoApp.cmd.core.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, String> {

}
