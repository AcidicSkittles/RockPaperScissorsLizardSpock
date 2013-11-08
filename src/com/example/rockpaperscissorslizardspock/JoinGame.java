package com.example.rockpaperscissorslizardspock;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class JoinGame extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_join_game);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.join_game, menu);
		return true;
	}
	public void join(View v0)
	{
		Intent t = new Intent(getBaseContext(), Game.class);
		//hard coded names for simplicity
		t.putExtra("username", "Derek");
		t.putExtra("server", "localhost");
		t.putExtra("port", "1337");
		startActivity(t);
	}
}