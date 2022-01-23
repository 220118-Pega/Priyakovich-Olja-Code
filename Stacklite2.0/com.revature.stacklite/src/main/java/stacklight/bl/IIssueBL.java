package stacklight.bl;

import java.util.List;
import stacklight.models.Issue;
import stacklight.models.Solution;

public interface IIssueBL {

	void addIssue(Issue issue);

	List<Issue> getIssues();
	Issue getIssueById(int id) throws Exception;
	void addSolution(Solution solution)throws Exception; 
}