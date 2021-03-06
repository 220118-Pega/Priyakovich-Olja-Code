package stacklight.dl;

import java.util.ArrayList;
import java.util.List;
import stacklight.models.Ticket;
import stacklight.models.Solution;

/**
 * Repository that connects to and in memory storage i.e. a static list of issues and solutions 
 * @author oljap.
 *
 */
public class InMemoryRepository implements InterfaceRepository {
	private static ArrayList<Ticket> ListOfIssues;
	private static int LatestId;
	
	public InMemoryRepository() {
		//dummy data
		final List<Solution> solutionListA = new ArrayList<Solution>() {/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Solution(" Maybe read through the errors?", 2, 1));
			add(new Solution(" Maybe read through the tears?", 0, 2));
			
		}};
		
		ListOfIssues = new ArrayList<Ticket>(){/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
			add(new Ticket("Code doesn't work, why?", "My code doesn't work I don't know why", 1, solutionListA));
			add(new Ticket("Code works?", "My code works, I don't know why", 2));
	}};
		
//	ListOfIssues = Arrays.asList(
//			new Issue("Code doesn't work, why??", "My code doesn't work I don't know why", 1),
//			new Issue("Code works??", "My code works, I don't know why", 2));
	LatestId = 3;
}
	
	@Override
	public void addIssue(Ticket newIssue) {
		// TODO Auto-generated method stub
		newIssue.setId(LatestId);
		ListOfIssues.add(newIssue);
		LatestId++;
	}

	@Override
	public List<Ticket> getIssues() {
		// TODO Auto-generated method stub
		return InMemoryRepository.ListOfIssues;
	}

	@Override
	public Ticket getIssueById(int id) throws Exception {
		// throw vs throws:
		//throw keyword in code block, throws keyword in method signature
		Ticket foundIssue = null;
		for(Ticket issue:ListOfIssues)
		{
			if(issue.getId() == id)
			{
				foundIssue = issue;
			}
		}
		if(foundIssue == null) throw new Exception("Issue not fond");
		return foundIssue;
	}

	@Override
	public void addSoulution(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		Ticket issue2Update = getIssueById(newSolution.getIssueId());
		List<Solution> existingSolutions = issue2Update.getSolutions();
		if(existingSolutions == null) existingSolutions = new ArrayList<Solution>();
		existingSolutions.add(newSolution);
		issue2Update.setSolutions(existingSolutions); 
	}

	@Override
	public void addSolution(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}

