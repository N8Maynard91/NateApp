package com.nate.nateapp;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ExperienceActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_experience);
		
        // 1. pass context and data to the custom adapter
        MyAdapter adapter = new MyAdapter(this, generateData());
        
        // 2. setListAdapter
		ListView list = (ListView) findViewById(R.id.experienceListView);
		list.setAdapter(adapter);
		
		registerClickCallback();
	}

	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.experienceListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
				if (position == 0) {		//MCC

					setContentView(R.layout.madison_country_club);
				}
				
				else if (position == 1) {	//SHGC

					setContentView(R.layout.shelter_harbour_golf_club);
					
				}
				
				else if (position == 2) {	//where
					setContentView(R.layout.where_inc);
					
				}
				
				else if (position == 3) {	//alfredo martinez events
					setContentView(R.layout.alfredo_martinez_events);
					
				}
				
				
				/*		testing method
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
        models.add(new Model(R.drawable.madisonbig,"Madison Country Club"));
        models.add(new Model(R.drawable.shgc,"Shelter Harbour Golf Club"));
        models.add(new Model(R.drawable.where_alt,"Where inc."));
        models.add(new Model(R.drawable.alfredo,"Alfredo Martinez Events"));
 
        return models;
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
