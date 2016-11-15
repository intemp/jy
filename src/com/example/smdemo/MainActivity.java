package com.example.smdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import com.examad.sjdfjo.R;
import com.ta6.yar.ExecCommand;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity{
	private final String TAG = "R_TEST";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button root = (Button)findViewById(R.id.root);
		Button install = (Button)findViewById(R.id.install);
		Button uninstall = (Button)findViewById(R.id.uninstall);
		Button reboot = (Button)findViewById(R.id.reboot);	
		root.setOnClickListener(listener);
		install.setOnClickListener(listener);
		uninstall.setOnClickListener(listener);
		reboot.setOnClickListener(listener);
		install.setVisibility(View.INVISIBLE);
		uninstall.setVisibility(View.INVISIBLE);
		reboot.setVisibility(View.INVISIBLE);
	}
	

	private OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			ExecCommand.getInstance().start(MainActivity.this);
		}
		
	};
	

	public void onResume() {
	    super.onResume();
//	    MobclickAgent.onResume(this);  
//	    finish();
	}
	
	public void onPause() {
	    super.onPause();
//	    MobclickAgent.onPause(this);	
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}
