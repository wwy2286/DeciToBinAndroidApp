package wwy2286.gmail.com.decitobinandroidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText numEditText = (EditText) findViewById(R.id.numEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                resultTextView.setText(DecimalToBinary.toBinaryConverter(Long.parseLong(numEditText.getText().toString()))+"");
            }
        });
    }
}
