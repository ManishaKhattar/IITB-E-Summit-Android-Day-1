package in.codingninjas.day1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Hello !!!!");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.button){

            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText(1+"");
            tv.setText("Button Clicked !!");
        }else if(id == R.id.button2){

            TextView tv = (TextView) findViewById(R.id.textView);
           String previousText =  tv.getText().toString();

//            Integer.parseInt("12");
//            Double.parseDouble("12.1");
            tv.setText(previousText + " Button  2 Clicked !!");


        }



    }
}
