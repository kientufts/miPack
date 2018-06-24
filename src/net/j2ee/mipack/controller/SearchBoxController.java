package net.j2ee.mipack.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@ManagedBean
@SessionScoped
public class SearchBoxController {
	private List<String> data=null;
	private List<String> result=null;
	private String display="";

	@PostConstruct
	public void init(){
		data = new ArrayList<>();
		result = new ArrayList<>();
//		String[] locales = Locale.getISOCountries();
//		for(String code : locales){
//			data.add(new Locale("",code).getDisplayCountry());
//		}
	}

	public void search(){
		result.clear();
		for(String country:data){
			if(country.toLowerCase().startsWith(display.toLowerCase())){
				result.add(country);
			}
		}

		if(result.isEmpty()){
			result.add("Not Found");
		}
	}


	public List<String> getResult() {
		return result;
	}

	public void setResult(List<String> result) {
		this.result = result;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

}
