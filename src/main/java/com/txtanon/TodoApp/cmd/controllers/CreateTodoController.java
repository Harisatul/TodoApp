package com.txtanon.TodoApp.cmd.controllers;

import com.txtanon.TodoApp.cmd.commands.CreateTodoCommand;
import com.txtanon.TodoApp.cmd.core.dto.ApiResponse;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static java.lang.Boolean.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(path = "/api/v1/createTodo")
public class CreateTodoController {

    private final CommandGateway commandGateway;

    public CreateTodoController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }
    @PostMapping
    public ResponseEntity<ApiResponse> createTodo(@RequestBody CreateTodoCommand command){
        String id = UUID.randomUUID().toString();
        command.setId(id);
        try {
            commandGateway.send(command);
            return new ResponseEntity<>(
                    new ApiResponse(TRUE,
                            "Task successfuly created"), CREATED);
        }catch (Exception e){
            String errorMessage = "Error while processing register user request for id - " + id;

            return new ResponseEntity<>(
                    new ApiResponse(FALSE,
                            errorMessage), INTERNAL_SERVER_ERROR);
        }
    }



}
