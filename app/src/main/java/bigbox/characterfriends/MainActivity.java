package bigbox.characterfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    //int state = 1;
    Button individual, phrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle("Select a Mode");
    }

    public void individualClick(View view){
        Intent intent = new Intent(this, IndividualMode.class);

        startActivity(intent);
    }
    public void phraseClick(View view) {
        Intent intent = new Intent(this, PhraseMode.class);

        startActivity(intent);
    }
}
