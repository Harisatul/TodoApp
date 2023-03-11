package com.txtanon.TodoApp.cmd.aggregate;


import com.txtanon.TodoApp.cmd.core.models.Todo;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class TodoAggregate {

    @AggregateIdentifier
    private String id;
    private Todo todo;

    public TodoAggregate() {
    }


}
