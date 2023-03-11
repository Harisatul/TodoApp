package com.txtanon.TodoApp.cmd.eventhandlers;

import com.txtanon.TodoApp.cmd.core.events.TodoCreateEvent;

public interface TodoEventHandlers {
    void on(TodoCreateEvent event);
}
