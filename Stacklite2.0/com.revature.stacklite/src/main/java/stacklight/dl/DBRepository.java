package stacklight.dl;

import java.util.List;

import stacklight.models.Issue;
import stacklight.models.Solution;

public class DBRepository implements InterfaceRepository{
	private DAO<Issue,Integer> issueDAO;
	
	public DBRepository(DAO<Issue,Integer> issueDAO) {
		this.issueDAO = issueDAO;
	}
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Issue> getIssues() {
		// TODO Auto-generated method stub
		return issueDAO.findAll();
	}

	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSolution(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addIssue(Issue newIssue) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Issue getIssueById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addSoulution(Solution newSolution) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}