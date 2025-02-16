package Day4Ass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CityStateMap {
	Map<String,String> csm=new HashMap<>();
	
	
	public void addcityStatepair(String city,String state) {
		csm.put(city, state);
		
	}
	public Map<String, String> getCsm() {
		return csm;
	}
	public void setCsm(Map<String, String> csm) {
		this.csm = csm;
	}
	
	public Set<String> getAllcities(){
		return csm.keySet();
	}
	public Set<String>getAllstates(){
		return new HashSet<>(csm.values());
		
	}
	 public Set<String> getCitiesForState(String state) {
	        Set<String> cities = new HashSet<>();
	        for (Map.Entry<String, String> entry : csm
	        		.entrySet()) {
	            if (entry.getValue().equals(state)) {
	                cities.add(entry.getKey());
	            }
	        }
	        return cities;
	    }
	 
	 public void deleteCitiesForState(String state) {
	        csm.values().removeIf(value -> value.equals(state));
	    }
	 
	 
	
	
}
