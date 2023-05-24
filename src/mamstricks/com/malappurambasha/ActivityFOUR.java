package mamstricks.com.malappurambasha;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFOUR extends Activity {
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	Button b1,b2,b3,b4,b5;
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		t1=(TextView) findViewById(R.id.textView1);
		t2=(TextView) findViewById(R.id.textView2);
		t3=(TextView) findViewById(R.id.textView3);
		t4=(TextView) findViewById(R.id.textView4);
		t5=(TextView) findViewById(R.id.textView5);
		t6=(TextView) findViewById(R.id.textView6);
		t7=(TextView) findViewById(R.id.textView7);
		t8=(TextView) findViewById(R.id.textView8);
		t9=(TextView) findViewById(R.id.textView9);
		t10=(TextView) findViewById(R.id.textView10);
		
		Typeface customfont1=Typeface.createFromAsset(getAssets(), "fonts/ishtika.ttf");
		t1.setTypeface(customfont1);
		t2.setTypeface(customfont1);
		t3.setTypeface(customfont1);
		t4.setTypeface(customfont1);
		t5.setTypeface(customfont1);
		t6.setTypeface(customfont1);
		t7.setTypeface(customfont1);
		t8.setTypeface(customfont1);
		t9.setTypeface(customfont1);
		t10.setTypeface(customfont1);
	}

	public void playsound(View v) {
		if(v.getId()==R.id.button1){
			
			ourSong=MediaPlayer.create(ActivityFOUR.this, R.raw.airi);
			ourSong.setOnCompletionListener(new OnCompletionListener() {
			    public void onCompletion(MediaPlayer ourSong) {
			    	ourSong.release();

			    };
			});
			ourSong.start();
			
		}
		if(v.getId()==R.id.button2){
			
			ourSong=MediaPlayer.create(ActivityFOUR.this, R.raw.kundan);
			ourSong.setOnCompletionListener(new OnCompletionListener() {
			    public void onCompletion(MediaPlayer ourSong) {
			    	ourSong.release();

			    };
			});
			ourSong.start();
		}
		if(v.getId()==R.id.button3){
			ourSong=MediaPlayer.create(ActivityFOUR.this, R.raw.keru);
			ourSong.setOnCompletionListener(new OnCompletionListener() {
			    public void onCompletion(MediaPlayer ourSong) {
			    	ourSong.release();

			    };
			});
			ourSong.start();
			
		}
		if(v.getId()==R.id.button4){
			ourSong=MediaPlayer.create(ActivityFOUR.this, R.raw.vandeem_valiyum);
			ourSong.setOnCompletionListener(new OnCompletionListener() {
			    public void onCompletion(MediaPlayer ourSong) {
			    	ourSong.release();

			    };
			});
			ourSong.start();
		}
		if(v.getId()==R.id.button5){
			ourSong=MediaPlayer.create(ActivityFOUR.this, R.raw.koniyuka);
			ourSong.setOnCompletionListener(new OnCompletionListener() {
			    public void onCompletion(MediaPlayer ourSong) {
			    	ourSong.release();

			    };
			});
			ourSong.start();
			
		}

	}

}
