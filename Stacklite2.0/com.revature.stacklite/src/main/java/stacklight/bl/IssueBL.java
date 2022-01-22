package stacklight.bl;

import java.util.List;
import stacklight.dl.InterfaceRepository;
import stacklight.models.Issue;


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
}
