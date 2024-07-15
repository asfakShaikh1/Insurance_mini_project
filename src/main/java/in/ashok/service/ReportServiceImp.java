package in.ashok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashok.entity.CitizenPlan;
import in.ashok.repository.CitizenPlanRepository;
import in.ashok.request.SearchRequest;

@Service
public class ReportServiceImp implements RepoService {
     
	@Autowired
	private CitizenPlanRepository repo;
	
	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlanStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
