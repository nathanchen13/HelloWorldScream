package mycompany.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MyActivity extends Activity {


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button happy = (Button) findViewById(R.id.happy);
        Button angry = (Button) findViewById(R.id.angry);
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

    }

    public void launch_happy(){
        Intent happy_intent = new Intent(this, HappyActivity.class);
        startActivity(happy_intent);
    }
    public void launch_angry(){
        Intent angry_intent = new Intent(this, AngryActivity.class);
        startActivity(angry_intent);
    }
}
