package stacklight.dl;

import java.util.List;

import stacklight.models.Issue;

/**
 * This is a interface for my repository implementation 
 * contains the necessary methods my BL needs to interact with my data storage
 * @author oljap.
 *
 */
public interface InterfaceRepository {
	void addIssue(Issue newIssue);
	List<Issue> getIssues();
}
