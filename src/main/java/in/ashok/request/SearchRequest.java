package in.ashok.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {
    
	
	private String planName;
	private String planStatus;
	private String Gender;
	private LocalDate startDate;
	private LocalDate endDate;
	
}
