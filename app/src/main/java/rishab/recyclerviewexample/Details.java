package rishab.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    private TextView name,description;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        name = findViewById(R.id.nameID);
        description = findViewById(R.id.descriptionID);

        if(extras!= null)
        {

            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
        }


    }
}
