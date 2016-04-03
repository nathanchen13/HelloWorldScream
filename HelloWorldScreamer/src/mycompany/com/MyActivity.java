package mycompany.com;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MyActivity extends Activity {
	
	static boolean music = true;
	
	MediaPlayer mp;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mp = MediaPlayer.create(this, R.raw.space_music1);
        mp.start();
        music = true;
        Button happy = (Button) findViewById(R.id.happy);
        Button angry = (Button) findViewById(R.id.angry);
        ToggleButton mswitch = (ToggleButton) findViewById(R.id.music_switch);
        
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launch_happy();
            }
        });
        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                launch_angry();
            }
        });
        
        mswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    music = true;
                    if(!mp.isPlaying()){
                    	mp.start();
                    }
                } else {
                	music = false;
                	if(mp.isPlaying()){
                		mp.pause();;
                	}
                }
            }
        });

    }

    public void launch_happy(){
//        mp.reset();
//        mp.release();
    	Intent happy_intent = new Intent(this, HappyActivity.class);
        startActivity(happy_intent);
        finish();
    }
    public void launch_angry(){
//    	mp.reset();
//    	mp.release();
        Intent angry_intent = new Intent(this, AngryActivity.class);
        startActivity(angry_intent);
        finish();
    }
    public void onBackPressed(){
    	mp.reset();
    	mp.release();
    	finish();
    }
    public void onPause(){
    	super.onPause();
    	if(mp != null){
//	    	mp.reset();
	    	mp.release();
    	}
    	finish();
    }
}
