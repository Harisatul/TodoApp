package com.txtanon.TodoApp.cmd.commands;

import jakarta.persistence.TableGenerator;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateTodoCommand {

//    @TargetIde
    private String id;

}
