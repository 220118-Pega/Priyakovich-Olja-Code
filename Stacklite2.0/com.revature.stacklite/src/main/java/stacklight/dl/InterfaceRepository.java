package stacklight.dl;

import java.util.List;

import stacklight.models.Issue;
import stacklight.models.Solution;

/**
 * This is a interface for my repository implementation 
 * contains the necessary methods my BL needs to interact with my data storage
 * @author oljap.
 *
 */
public interface InterfaceRepository {
	void addIssue(Issue newIssue);
	List<Issue> getIssues();
	Issue getIssueById(int id) throws Exception;
	void addSoulution(Solution newSolution) throws Exception;
}
