package sg.edu.rp.c346.id21025432.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText NumPax;
    ToggleButton SVS;
    ToggleButton GST;
    EditText discount;
    RadioButton cash;
    RadioButton payNow;
    Button split;
    Button reset;
    TextView total;
    TextView eachpay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount  = findViewById(R.id.amount);
        NumPax  = findViewById(R.id.NumPax);
        SVS  = findViewById(R.id.noSVSButton);
        GST  = findViewById(R.id.GSTButton);
        discount  = findViewById(R.id.discount);
        cash  = findViewById(R.id.cashButton);
        payNow  = findViewById(R.id.payNowButton);
        split  = findViewById(R.id.splitButton);
        reset  = findViewById(R.id.resetButton);
        total  = findViewById(R.id.totalBill);
        eachpay  = findViewById(R.id.eachPays);


        split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer initCost = Integer.parseInt(amount.getText().toString());
                Integer people = Integer.parseInt(NumPax.getText().toString())
                if (SVS.isChecked() && GST.isChecked()){
                    Integer finalCost = (initCost + initCost/10 +(initCost/100)*7)/people;
                } else if (SVS.isChecked()){
                    Integer finalCost = (initCost + initCost/10)/people;
                } else if (GST.isChecked()){
                    Integer finalCost = (initCost +(initCost/100)*7)/people;
                }


            }
        });
    }
}