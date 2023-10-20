package bryan.proyect.googlemaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ubicaciones extends AppCompatActivity {

    private EditText Ubicacion1;
    private EditText Ubicacion2;
    private EditText Ubicacion3;

    private Button agregarButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicaciones);

        Ubicacion1 = findViewById(R.id.L1);
        Ubicacion2 = findViewById(R.id.L2);
        Ubicacion3 = findViewById(R.id.L3);
        agregarButon = findViewById(R.id.BtnAgregar);

        agregarButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ubi1 = Ubicacion1.getText().toString();
                String ubi2 = Ubicacion2.getText().toString();
                String ubi3 = Ubicacion3.getText().toString();

                Intent intent = new Intent(Ubicaciones.this, MainActivity.class);

                intent.putExtra("ubicacion1", ubi1);
                intent.putExtra("ubicacion2", ubi2);
                intent.putExtra("ubicacion3", ubi3);
                startActivity(intent);

            }
        });
    }
}