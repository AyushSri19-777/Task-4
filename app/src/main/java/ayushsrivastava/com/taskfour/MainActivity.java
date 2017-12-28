package ayushsrivastava.com.taskfour;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etxt1=(EditText)findViewById(R.id.editText1);
        final EditText etxt2=(EditText)findViewById(R.id.editText2);
        Button btn=(Button)findViewById(R.id.buttontoShow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=etxt1.getText().toString();
                String s2=etxt2.getText().toString();
                Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
                intent.putExtra("s1",s1);
                intent.putExtra("s2",s2);
                startActivity(intent);

            }
        });


    }
}
