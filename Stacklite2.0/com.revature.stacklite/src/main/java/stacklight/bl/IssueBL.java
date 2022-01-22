package stacklight.bl;

import java.util.List;

import stacklight.dl.InterfaceRepository;
import stacklight.models.Issue;

public class IssueBL {
	private InterfaceRepository repo;
	public IssueBL(InterfaceRepository repo)
	{
		this.repo = repo;
	}
	public void addIssue(Issue issue) {
		//call my data layer
		repo.addIssue(issue);
	}
	public List<Issue> getIssues()
	{
		return repo.getIssues();
	}
}
