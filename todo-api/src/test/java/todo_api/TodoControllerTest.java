package todo_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class TodoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Test 1 — GET tutti i todos restituisce 200
    @Test
    void shouldReturnOkWhenGettingAllTodos() throws Exception {
        mockMvc.perform(get("/api/todos"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(
                        MediaType.APPLICATION_JSON));
    }

    // Test 2 — POST crea un todo
    @Test
    void shouldCreateTodoSuccessfully() throws Exception {
        mockMvc.perform(post("/api/todos")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\":\"Test Todo\",\"completed\":false}"))
                .andExpect(status().isOk());
    }

    // Test 3 — GET todo inesistente restituisce 404
    @Test
    void shouldReturn404ForNonExistentTodo() throws Exception {
        mockMvc.perform(get("/api/todos/99999"))
                .andExpect(status().isNotFound());
    }

    // Test 4 — DELETE todo inesistente restituisce 204
    @Test
    void shouldReturn204WhenDeletingTodo() throws Exception {
        mockMvc.perform(delete("/api/todos/1"))
                .andExpect(status().isNoContent());
    }
}