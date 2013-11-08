package com.example.rockpaperscissorslizardspock;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void join(View v0)
	{
		Intent t = new Intent(this, JoinGame.class);
		TextView tt = (TextView)findViewById(R.id.editText1);	
		t.putExtra("username", tt.getText());
		startActivity(t);
	}
}
