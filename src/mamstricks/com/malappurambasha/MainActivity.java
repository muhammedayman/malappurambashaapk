package mamstricks.com.malappurambasha;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void selectlesson(View v) {
		if(v.getId()==R.id.button1){
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityONE");
			startActivity(intent);
			
		}
		if(v.getId()==R.id.button2){
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityTWO");
			startActivity(intent);
			
		}
		if(v.getId()==R.id.button3){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityTHREE");
			startActivity(intent);
		}
		if(v.getId()==R.id.button4){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityFOUR");
			startActivity(intent);
		}
		if(v.getId()==R.id.button5){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityFIVE");
			startActivity(intent);
		}
		if(v.getId()==R.id.button6){
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivitySIX");
			startActivity(intent);
			
		}
		if(v.getId()==R.id.button7){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivitySEVEN");
			startActivity(intent);
		}
		if(v.getId()==R.id.button8){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityEIGHT");
			startActivity(intent);
		}
if(v.getId()==R.id.button9){
			
			intent=new Intent();
			intent.setClassName("mamstricks.com.malappurambasha", "mamstricks.com.malappurambasha.ActivityAbout");
			startActivity(intent);
		}
		 /* if(v.getId()==R.id.button9){
			Toast tst=new Toast(this);
			tst.setDuration(tst.LENGTH_SHORT);
			tst.setGravity(Gravity.BOTTOM, 0, 0);
			LayoutInflater inflater=getLayoutInflater();
			View appearance=inflater.inflate(R.layout.aboutme,(ViewGroup) findViewById(R.id.aboutmetoast));
			tst.setView(appearance);
			tst.show();
		}
		*/

	}

}
