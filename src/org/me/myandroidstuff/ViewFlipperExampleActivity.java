package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ViewFlipperExampleActivity extends Activity implements OnClickListener
{
	private Button btn;
	private ViewFlipper flip;
    /** Called when the activity is first created. */
    @Override
   
    public void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    	btn=(Button)findViewById(R.id.btn);
    	btn.setOnClickListener(this);
    	flip=(ViewFlipper)findViewById(R.id.flip);     	            	        
    	//when a view is displayed
    	flip.setInAnimation(this,android.R.anim.fade_in);
    	//when a view disappears
    	flip.setOutAnimation(this, android.R.anim.fade_out); 
    }

	@Override
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		flip.showNext();
	     //specify flipping interval    	     
	     //flip.setFlipInterval(1000);    	     
	     //flip.startFlipping();
		
	}

    
    
    
}