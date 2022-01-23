package stacklight.bl;

import java.util.List;
import stacklight.dl.InterfaceRepository;
import stacklight.models.Issue;
import stacklight.models.Solution;


public class IssueBL implements IIssueBL {
	private InterfaceRepository repo;
	public IssueBL(InterfaceRepository repo)
	{
		this.repo = repo;
	}
	@Override
	public void addIssue(Issue issue) {
		//call my data layer
		repo.addIssue(issue);
	}
	@Override
	public List<Issue> getIssues()
	{
		return repo.getIssues();
	}
	@Override
	public Issue getIssueById(int id) {
		// TODO Auto-generated method stub
		return repo.getIssueById(id);
	}
	@Override
	public void addSolution(Solution solution) {
		// TODO Auto-generated method stub
		repo.addSoulution(solution);
		
	}
}
