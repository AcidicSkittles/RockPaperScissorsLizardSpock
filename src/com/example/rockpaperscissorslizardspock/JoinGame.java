package com.example.rockpaperscissorslizardspock;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class JoinGame extends Activity {
	String username = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_join_game);
		//Bundle extras = savedInstanceState.getExtras();
	    username = (String) getIntent().getStringExtra("username");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.join_game, menu);
		return true;
	}
	public void join(View v0)
	{
		Intent t = new Intent(this, Game.class);
		t.putExtra("username", username);
		TextView tt = (TextView)findViewById(R.id.editText1);
		t.putExtra("server", tt.getText());
		TextView ttt = (TextView)findViewById(R.id.editText2);
		t.putExtra("port", ttt.getText());
		startActivity(t);
	}
}