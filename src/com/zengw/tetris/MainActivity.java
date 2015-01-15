package com.zengw.tetris;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		FragmentTetris fragmentTetris = new FragmentTetris();
		getSupportFragmentManager().beginTransaction().replace(R.id.main,
				fragmentTetris).commit();
	}
}
