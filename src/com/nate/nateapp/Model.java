package com.nate.nateapp;

public class Model{
	 
    private int icon;
    private String title;
    public Model(int icon, String title) {
        super();
        this.icon = icon;
        this.title = title;
    }
    
	public int getIcon() {
		return this.icon;
	}
	
	public String getTitle() {
		return this.title;
	}
 
//getters & setters...
}