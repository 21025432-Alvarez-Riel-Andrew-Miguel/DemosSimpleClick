package sg.edu.rp.c346.id21025432.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.btn1);
        etInput = findViewById(R.id.editTextTextPersonName);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale){
                    stringResponse = "He says " + stringResponse;
                }
                else if(checkedRadioId == R.id.radioButtonGenderFemale){
                    stringResponse = "She says " + stringResponse;
                }

                tvDisplay.setText(stringResponse);
            }
        });


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                etInput.setEnabled(false);
                tvDisplay.setEnabled(false);
                btnDisplay.setEnabled(false);

                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                    tvDisplay.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }
            }
        });





    }
}