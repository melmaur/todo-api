package controller;

import model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    // Constructor injection
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // GET all todos
    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    // GET todo by ID
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // POST create new todo
    @PostMapping
    public Todo createTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    // PUT update todo
    @PutMapping("/{id}")
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    // DELETE todo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.noContent().build();
    }
}


/* * Key concepts
*
* Annotation                              What it does
* @RestController                  Marks this as a REST API controller
* @RequestMapping("/api/todos")     Base URL for all endpoints
* @GetMapping                       Handles HTTP GET requests
* @PostMapping                      Handles HTTP POST requests
* @PutMapping                       Handles HTTP PUT requests
* @DeleteMapping                    Handles HTTP DELETE requests
* @PathVariable                     Reads {id} from the URL
* @RequestBody                      Reads JSON from the request body
*
 */

