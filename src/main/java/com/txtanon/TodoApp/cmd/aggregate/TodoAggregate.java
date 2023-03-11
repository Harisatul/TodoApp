package com.txtanon.TodoApp.cmd.aggregate;


import com.txtanon.TodoApp.cmd.commands.CreateTodoCommand;
import com.txtanon.TodoApp.cmd.core.events.TodoCreateEvent;
import com.txtanon.TodoApp.cmd.core.models.Todo;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class TodoAggregate {

    @AggregateIdentifier
    private String id;
    private Todo todo;

    public TodoAggregate() {
    }

    @CommandHandler
    public TodoAggregate(CreateTodoCommand command) {
        Todo todo = command.getTodo();
        todo.setId(command.getId());

        TodoCreateEvent todoBuild = TodoCreateEvent.builder()
                .id(command.getId())
                .todo(todo)
                .build();
        AggregateLifecycle.apply(todoBuild);
    }

}
