package edu.stonehill.cs.bdugan.playground;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
    }

    public void buttonPress(View view) {

        int sideA = Integer.parseInt(((TextView)findViewById(R.id.editText)).getText().toString());
        int sideB = Integer.parseInt(((TextView)findViewById(R.id.editText2)).getText().toString());
        int sideC = Integer.parseInt(((TextView)findViewById(R.id.editText3)).getText().toString());

        TextView tv = (TextView)findViewById(R.id.textView8);

        if ((sideA==sideB) && (sideA==sideC))
        {
            tv.setText("Equilateral");
        }
        else if (sideA==sideB)
        {
            tv.setText("Isocoles");
        }
        else {
            tv.setText("Scalene");
        }
    }
}
