package org.sample.railwayapplication.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.sample.railwayapplication.domain.model.User;
import org.sample.railwayapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "railway-application", description = "usando railway para publicar uma aplicação na nuvem")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> find(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.created(ServletUriComponentsBuilder
                        .fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(user.getId())
                        .toUri())
                .body(userService.create(user));
    }
}
