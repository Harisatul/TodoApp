package com.txtanon.TodoApp.cmd.eventhandlers;

import com.txtanon.TodoApp.cmd.core.events.TodoCreateEvent;
import com.txtanon.TodoApp.cmd.core.models.Todo;
import com.txtanon.TodoApp.cmd.repositories.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoEventHandlersImpl implements TodoEventHandlers {

    private final TodoRepository todoRepository;

    public TodoEventHandlersImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void on(TodoCreateEvent event) {
        todoRepository.save(event.getTodo());
    }
}
