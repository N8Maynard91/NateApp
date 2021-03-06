package com.nate.nateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().setTitle("Nathaniel's Resume");   
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

	public void loadSummary(View view) {
		Intent intent = new Intent(this, SummaryActivity.class);
		startActivity(intent);
	}
	
	public void loadEducation(View view) {
		Intent intent = new Intent(this, EducationActivity.class);
		startActivity(intent);
	}
	
	public void loadExperience(View view) {
		Intent intent = new Intent(this, ExperienceActivity.class);
		startActivity(intent);
	}
	
	public void loadOther(View view) {
		Intent intent = new Intent(this, OtherActivity.class);
		startActivity(intent);
	} 
}
