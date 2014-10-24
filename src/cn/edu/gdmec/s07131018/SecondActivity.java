package cn.edu.gdmec.s07131018;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import cn.edu.gdmec.s07131018.R;

public class SecondActivity extends Activity {
	private EditText username,password;
	private Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		username = (EditText) findViewById(R.id.et1);
		password = (EditText) findViewById(R.id.et2);
		bt = (Button) findViewById(R.id.bt);
		bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.putExtra("username", username.getText().toString());
				intent.putExtra("password", password.getText().toString());
				setResult(RESULT_OK, intent);
				finish();
			}
		});
	}

}
