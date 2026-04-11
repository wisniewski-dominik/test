package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestRestControllerTest {
    @Test
    void get(){
        TestRestController controller = new TestRestController();
        assertEquals("Hello World", controller.hello().getBody());
    }

    @Test
    void get2(){
        TestRestController controller = new TestRestController();
        assertEquals("Hello World 2", controller.hello2().getBody());
    }
}