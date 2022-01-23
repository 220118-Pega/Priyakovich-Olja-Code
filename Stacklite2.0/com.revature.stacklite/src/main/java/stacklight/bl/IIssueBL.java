package stacklight.bl;

import java.util.List;

import stacklight.models.Issue;

public interface IIssueBL {

	void addIssue(Issue issue);

	List<Issue> getIssues();
	Issue getIssueById(int id);

}