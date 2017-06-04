package bigbox.characterfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndividualMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_mode);
    }

    public void npcrClick(View view){
        Intent intent = new Intent(this, NpcrLessons.class);

        startActivity(intent);
    }
}
