package com.example.joan.practicafinalandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIntent;
    private Button btnCalc;
    private Button btnBD;
    private Button btnFitxers;
    private Button btnSta;
    private Button btnCont;
    private Button btnBro;
    private Button btnSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIntent = (Button) findViewById(R.id.btnIntent);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnBD = (Button) findViewById(R.id.btnBD);
        btnFitxers = (Button) findViewById(R.id.btnFitxers);
        btnSta = (Button) findViewById(R.id.btnSta);
        btnCont = (Button) findViewById(R.id.btnCont);
        btnBro = (Button) findViewById(R.id.btnBro);
        btnSMS = (Button) findViewById(R.id.btnSMS);
    }
    public class bateria {
        public void readBattery() {
            B b = new B();
            b.readBattery();
        }
    }
}
