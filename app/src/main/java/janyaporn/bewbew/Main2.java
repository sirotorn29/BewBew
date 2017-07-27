package janyaporn.bewbew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {
    TextView text2;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text2 = (TextView)findViewById(R.id.text2);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            data = bundle.getString("data");
            text2.setText(data);
        }
    }
}
