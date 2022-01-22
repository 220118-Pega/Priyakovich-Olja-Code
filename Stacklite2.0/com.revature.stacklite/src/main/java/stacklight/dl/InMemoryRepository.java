package stacklight.dl;

import java.util.ArrayList;
import java.util.List;

import stacklight.models.Issue;

/**
 * Repository that connects to and in memory storage i.e. a static list of issues and solutions 
 * @author oljap.
 *
 */
public class InMemoryRepository implements InterfaceRepository {
	private static List<Issue> ListOfIssues;
	private static int LatestId;
	
	public InMemoryRepository() {
		//dummy data
		ListOfIssues = new ArrayList<Issue>(); {{
			new Issue("Code doesn't work, why??", "My code doesn't work I don't know why", 1);
			new Issue("Code works??", "My code works, work I don't know why", 2);
	}};
	
	LatestId = 3;
}
	
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		newIssue.setId(LatestId);
		ListOfIssues.add(newIssue);
		LatestId++;
	}

	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return this.ListOfIssues;
	}

}
