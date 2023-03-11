package com.txtanon.TodoApp.command.core.events;

import com.txtanon.TodoApp.command.core.models.Todo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoCreateEvent {

    private String id;
    private Todo todo;

}
