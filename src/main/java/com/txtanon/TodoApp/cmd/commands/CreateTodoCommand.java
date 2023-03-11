package com.txtanon.TodoApp.cmd.commands;

import com.txtanon.TodoApp.cmd.core.models.Todo;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@Builder
public class CreateTodoCommand {
    @TargetAggregateIdentifier
    private String id;
    private Todo todo;

}
