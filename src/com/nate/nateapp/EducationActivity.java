package com.nate.nateapp;


import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EducationActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_education);
		
        // 1. pass context and data to the custom adapter
        MyAdapter adapter = new MyAdapter(this, generateData());
        
        // 2. setListAdapter
		ListView list = (ListView) findViewById(R.id.educationListView);
		list.setAdapter(adapter);
		
		registerClickCallback();
	}

	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.educationListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
				if (position == 0) {		//Wellesley Highschool
					//Intent intent = new Intent(this, WellesleyHSActivity.class);
					//startActivity(intent);
					setContentView(R.layout.wellesley_highschool); //try to figure out fragments
				}
				
				else if (position == 1) {	//The Island School
					//Intent intent = new Intent(this, TheIslandSchoolActivity.class);
					//startActivity(intent);
					setContentView(R.layout.the_island_school);
					
				}
				
				else if (position == 2) {	//Trinity College
					//Intent intent = new Intent(this, TrinityActivity.class);
					//startActivity(intent);
					setContentView(R.layout.trinity_college);
					
				}
				
				
				/*
				 * public void onItemClick(AdapterView[[?]] paret, View viewClicked, int position, long id) {
				 * TextView textView = (TextView) viewClicked;
				 * String message = "You clicked # " + position + ", which is string: " + textView.getText().toString();
				 * Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
				 * }
				 * }); 
				 */
			}
			
		});
		
	}

	private ArrayList<Model> generateData(){
        ArrayList<Model> models = new ArrayList<Model>();
        models.add(new Model(R.drawable.wellesley_ma,"Wellesley High School"));
        models.add(new Model(R.drawable.is,"The Island School"));
        models.add(new Model(R.drawable.trinity_color,"Trinity College"));
 
        return models;
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.education, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
