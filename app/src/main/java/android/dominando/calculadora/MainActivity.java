package android.dominando.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etValor1, etValor2;
    Button btButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValor1 = (EditText) findViewById(R.id.etValor1);
        etValor2 = (EditText) findViewById(R.id.etValor2);
        btButton = (Button) findViewById(R.id.btCalcular);

    }
}
