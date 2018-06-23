package net.j2ee.mipack.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.util.*;

@ManagedBean
@SessionScoped
public class ResourceController {
	private String current_lang;
	private List<String> langList;

	@PostConstruct
	public void init(){
		current_lang="en";
		langList = new ArrayList<>();
		langList.add("en");
		langList.add("vn");
		langList.add("cn");
	}


	public void onLanguageSelectedListener(ValueChangeEvent event){
		current_lang = event.getNewValue().toString();
		changeLocale(current_lang);
	}

	public void changeLocale(String lang){
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale(lang));
	}

	public List<String> getLangList() {
		return langList;
	}

	public String getCurrent_lang() {
		return current_lang;
	}

	public void setCurrent_lang(String current_lang) {
		this.current_lang = current_lang;
	}
}
