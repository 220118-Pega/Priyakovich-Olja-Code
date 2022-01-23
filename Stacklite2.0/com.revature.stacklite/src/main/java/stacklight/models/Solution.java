package stacklight.models;

public class Solution {
	private String answer;
	private int id;
	private int upvote;
	
	public Solution() {
		
	}
	public Solution(String answer, int upvote) {
		this.answer = answer;
		this.upvote = upvote;
	}
	public Solution(String answer) {
		this.answer = answer;
		this.upvote = 0;
	}
	public Solution(String answer,int upvote, int id) {
		this(answer, upvote);
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUpvote() {
		return upvote;
	}
	public void setUpvote(int upvote) {
		this.upvote = upvote;
	}
	@Override
	public String toString() {
		return "Solution [answer=" + answer + ", id=" + id + ", upvote=" + upvote + "]";
	}
	
	
}
