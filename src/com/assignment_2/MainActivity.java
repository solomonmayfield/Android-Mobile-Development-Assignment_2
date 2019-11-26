package com.assignment_2;


import com.assignment_2.R;
import com.assignment_2.MainActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<firstName> extends Activity {

	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		
		initHappyEaster();
		
		
		
		
		
	
	}
	
	
	
	
	
	

				private void initHappyEaster() {
				// TODO Auto-generated method stub
			
				//

				final EditText fName;
				final EditText lName;
					
					
				fName = (EditText)findViewById(R.id.edit_first_name); 	
				lName = (EditText)findViewById(R.id.edit_last_name);
				
			
					
				//
				Button toastButton = (Button)findViewById(R.id.button_toast);
				toastButton.setOnClickListener(new OnClickListener(){
				
				@Override
				public void onClick(View v) {
					
					//
					String strfName = fName.getText().toString();
					String strlName = lName.getText().toString();
					
					
					((TextView)findViewById(R.id.showtextView)).setText("Happy Easter " + " " + strfName + " " + strlName + "!");
					
					
					
					
					Toast myToast = Toast.makeText(
					MainActivity.this, "Happy Easter " + " " + strfName + " " + strlName + "!", Toast.LENGTH_SHORT);
					myToast.show();
				}
				
		
				

		
		});
		
	}
			
			
			
			
			
}
