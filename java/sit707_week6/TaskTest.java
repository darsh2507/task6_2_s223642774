package sit707_week6;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test; // Import JUnit's @Test annotation

import java.util.Date;
import sit707_week6.Task;

public class TaskTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "223642774";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Darsh";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
    @Test
    public void testTaskCreation() {
        Date dueDate = new Date();
        Task task = new Task(1, "Task1", dueDate);
        assertEquals("new", task.getStatus());
        assertEquals("", task.getFeedback());
       
    }

    @Test
    public void testSubmitTask() {
        Task task = new Task(1, "Task1", new Date());
        task.submitTask();
        assertEquals("submitted", task.getStatus());
    }

    @Test
    public void testUpdateStatus() {
        Task task = new Task(1, "Task1", new Date());
        task.updateStatus("in progress");
        assertEquals("in progress", task.getStatus());
    }

    @Test
    public void testAddFeedback() {
        Task task = new Task(1, "Task1", new Date());
        task.addFeedback("Good job!");
        assertEquals("Good job!", task.getFeedback());
    }

    @Test
    public void testSendMessage() {
        Task task = new Task(1, "Task1", new Date());
        task.sendMessage("Hello!");
        assertFalse(task.getChatHistory().isEmpty());
        assertEquals("Hello!", task.getChatHistory().get(0));
    }

    
}