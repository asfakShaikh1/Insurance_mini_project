package in.ashok.service;

import java.util.List;

import in.ashok.entity.CitizenPlan;
import in.ashok.request.SearchRequest;

public interface RepoService {

    public  List<String> getPlanNames();
    public List<String> getPlanStatuses();
    public List<CitizenPlan> search(SearchRequest request);
    public boolean exportExcel();
    public boolean exportPdf();
}
