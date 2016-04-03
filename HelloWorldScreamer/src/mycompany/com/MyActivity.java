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
	static boolean angry_echo = false;
	
	MediaPlayer mp;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mp = MediaPlayer.create(this, R.raw.space_music1);
        mp.start();
        music = true;
        angry_echo = false;
        Button happy = (Button) findViewById(R.id.happy);
        Button angry = (Button) findViewById(R.id.angry);
        ToggleButton mswitch = (ToggleButton) findViewById(R.id.music_switch);
        ToggleButton aeswitch = (ToggleButton) findViewById(R.id.angry_echo_switch);
        aeswitch.setChecked(false);
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
        aeswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    angry_echo = true;

                } else {
                	angry_echo = false;
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
    @Override
    public void onBackPressed(){
    	mp.reset();
    	mp.release();
    	finish();
    }
    @Override
    public void onPause(){
    	super.onPause();
    	if(mp != null){
//	    	mp.reset();
	    	mp.release();
    	}
    	finish();
    }
}
