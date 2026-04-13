package via.doc1.devopsdemo.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamMemberTest {

    @Test
    void constructor_validValues_setsFieldsCorrectly() {
        // Arrange
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Task1", "Desc1"));

        // Act
        TeamMember member = new TeamMember("10", "Ali", "ali@test.com", tasks);

        // Assert
        assertEquals("10", member.getId());
        assertEquals("Ali", member.getName());
        assertEquals("ali@test.com", member.getEmail());
        assertEquals(tasks, member.getTasks());
    }

    @Test
    void setters_validValues_updateFieldsCorrectly() {
        // Arrange
        TeamMember member = new TeamMember("1", "Old", "old@test.com", new ArrayList<>());
        List<Task> newTasks = new ArrayList<>();
        newTasks.add(new Task("2", "Task2", "Desc2"));

        // Act
        member.setId("20");
        member.setName("NewName");
        member.setEmail("new@test.com");
        member.setTasks(newTasks);

        // Assert
        assertEquals("20", member.getId());
        assertEquals("NewName", member.getName());
        assertEquals("new@test.com", member.getEmail());
        assertEquals(newTasks, member.getTasks());
    }

    @Test
    void toString_containsFieldValues() {
        // Arrange
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1", "Task1", "Desc1"));
        TeamMember member = new TeamMember("10", "Ali", "ali@test.com", tasks);

        // Act
        String result = member.toString();

        // Assert
        assertTrue(result.contains("10"));
        assertTrue(result.contains("Ali"));
        assertTrue(result.contains("ali@test.com"));
        assertTrue(result.contains("Task1"));
    }
}