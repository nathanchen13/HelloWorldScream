package nathanchen.apps.helloworldscream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
