package edu.escuelaing.ieti.controller;
import edu.escuelaing.ieti.data.User;
import edu.escuelaing.ieti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;
    public UserController(@Autowired UserService userService ){
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<List<User>> all() {
        return ResponseEntity.status(HttpStatus.OK).body(userService.all());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));
    }
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.create(user));
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(user, id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        try{
            userService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body((true));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.ordinal()).body((false));
        }
    }
}