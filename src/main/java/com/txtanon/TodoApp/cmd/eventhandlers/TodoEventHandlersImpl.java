package com.txtanon.TodoApp.cmd.eventhandlers;

import com.txtanon.TodoApp.cmd.core.events.TodoCreateEvent;
import com.txtanon.TodoApp.cmd.repositories.TodoRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Service;

@Service
public class TodoEventHandlersImpl implements TodoEventHandlers {

    private final TodoRepository todoRepository;

    public TodoEventHandlersImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    @EventHandler
    public void on(TodoCreateEvent event) {
        todoRepository.save(event.getTodo());
    }
}
