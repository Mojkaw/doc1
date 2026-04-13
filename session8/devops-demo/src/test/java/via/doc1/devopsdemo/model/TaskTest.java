package via.doc1.devopsdemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void defaultConstructor_settersAndGetters_workCorrectly() {
        // Arrange
        Task task = new Task();

        // Act
        task.setId("1");
        task.setName("Task1");
        task.setDescription("Desc");

        // Assert
        assertEquals("1", task.getId());
        assertEquals("Task1", task.getName());
        assertEquals("Desc", task.getDescription());
    }

    @Test
    void fullConstructor_validValues_setsFieldsCorrectly() {
        // Arrange + Act
        Task task = new Task("1", "Task1", "Desc");

        // Assert
        assertEquals("1", task.getId());
        assertEquals("Task1", task.getName());
        assertEquals("Desc", task.getDescription());
    }

    @Test
    void toString_containsFieldValues() {
        // Arrange
        Task task = new Task("1", "Task1", "Desc");

        // Act
        String result = task.toString();

        // Assert
        assertTrue(result.contains("1"));
        assertTrue(result.contains("Task1"));
        assertTrue(result.contains("Desc"));
    }

    @Test
    void equals_sameObject_returnsTrue() {
        Task task = new Task("1", "Task1", "Desc");

        assertEquals(task, task);
    }

    @Test
    void equals_sameId_returnsTrue() {
        Task t1 = new Task("1", "A", "B");
        Task t2 = new Task("1", "X", "Y");

        assertEquals(t1, t2);
    }

    @Test
    void equals_differentId_returnsFalse() {
        Task t1 = new Task("1", "A", "B");
        Task t2 = new Task("2", "A", "B");

        assertNotEquals(t1, t2);
    }

    @Test
    void equals_null_returnsFalse() {
        Task t1 = new Task("1", "A", "B");

        assertNotEquals(t1, null);
    }

    @Test
    void equals_differentClass_returnsFalse() {
        Task t1 = new Task("1", "A", "B");

        assertNotEquals(t1, "string");
    }

    @Test
    void hashCode_sameId_sameHash() {
        Task t1 = new Task("1", "A", "B");
        Task t2 = new Task("1", "X", "Y");

        assertEquals(t1.hashCode(), t2.hashCode());
    }
}