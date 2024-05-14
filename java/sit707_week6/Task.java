package sit707_week6;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
	 private int taskId;
	    private String description;
	    private Date dueDate;
	    private String status;
	    private String feedback;
	    private List<String> chatHistory;
	    public Task(int taskId, String description, Date dueDate) {
	        this.taskId = taskId;
	        this.description = description;
	        this.dueDate = dueDate;
	        this.status = "new";
	        this.feedback = "";
	        this.chatHistory = new ArrayList<>();
	    }
	    public void submitTask() {
	        this.status = "submitted";
	    }
	    public void updateStatus(String newStatus) {
	        this.status = newStatus;
	    }
	    public void addFeedback(String feedback) {
	        this.feedback = feedback;
	    }
	    public void sendMessage(String message) {
	        this.chatHistory.add(message);
	    }
	    public String getStatus() {
	        return status;
	    }
	    public String getFeedback() {
	        return feedback;
	    }
	    public List<String> getChatHistory() {
	        return chatHistory;
	    }
}

