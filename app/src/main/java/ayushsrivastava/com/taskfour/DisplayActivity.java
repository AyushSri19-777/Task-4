package ayushsrivastava.com.taskfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        TextView txt1=(TextView)findViewById(R.id.textView1);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        String ss1=getIntent().getStringExtra("s1");
        String ss2=getIntent().getStringExtra("s2");
        txt1.setText(ss1);
        txt2.setText(ss2);
    }
}
