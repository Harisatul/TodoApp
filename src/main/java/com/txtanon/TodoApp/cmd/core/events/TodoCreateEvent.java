package com.txtanon.TodoApp.cmd.core.events;

import com.txtanon.TodoApp.cmd.core.models.Todo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoCreateEvent {

    private String id;
    private Todo todo;

}
