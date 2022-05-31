package net.mustafa.oop_in_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView age,name;
    grand_parent gp;
    parent pr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        age = findViewById(R.id.t1);
        name = findViewById(R.id.t2);

        gp = new grand_parent("72","Qurban");

        name.setText(gp.getName().toString());
        age.setText(gp.getAge().toString());

        pr = new parent("43","Zulfiqar");

        name.setText(pr.getName().toString());
        age.setText(pr.getAge().toString());



    }
}
