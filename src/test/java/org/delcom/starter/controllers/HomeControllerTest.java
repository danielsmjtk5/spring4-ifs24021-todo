package org.delcom.starter.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HomeControllerUnitTest {
    // Test untuk metode hello()
    @Test
    @DisplayName("Mengembalikan pesan selamat datang yang benar")
    void hello_ShouldReturnWelcomeMessage() {
        // Arrange
        HomeController controller = new HomeController();

        // Act
        String result = controller.hello();

        // Assert
        assertEquals("Hay Abdullah, selamat datang di pengembangan aplikasi dengan Spring Boot!", result);
    }

    // Tambahan test untuk metode sayHello dengan parameter nama
    @Test
    @DisplayName("Mengembalikan pesan sapaan yang dipersonalisasi")
    void helloWithName_ShouldReturnPersonalizedGreeting() throws Exception {
        // Arrange
        HomeController controller = new HomeController();

        // Act
        String result = controller.sayHello("Abdullah");

        // Assert
        assertEquals("Hello, Abdullah!", result);
    }
}
