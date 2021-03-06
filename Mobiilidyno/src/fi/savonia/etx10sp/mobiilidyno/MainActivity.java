package fi.savonia.etx10sp.mobiilidyno;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button asetuksetButton;
	
	void initializeComponents()
	{
		this.asetuksetButton = (Button) findViewById(R.id.asetuksetButton);
		this.asetuksetButton.setOnClickListener(this);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initializeComponents();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		Intent intent;
		
		if(v.equals(this.asetuksetButton))
		{
			intent = new Intent(this, AsetuksetActivity.class);
			
			startActivity(intent);
		}
	}
	
	public void showToast(String message)
    {
    	Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
	

}
