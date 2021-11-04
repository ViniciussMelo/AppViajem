package desenvolv.mastersys.appviajem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMytrips, btnNewTrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);

            //Seta o xml.
            setContentView(R.layout.activity_2_main);

            //Instância os componentes do xml.
            btnMytrips = findViewById(R.id.btnMytrips);
            btnNewTrip = findViewById(R.id.btnNewtrip);

            //Ação do botão NewTrip
            btnNewTrip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Vai para a próxima activity.
                    startActivity(new Intent(MainActivity.this, InformacoesActivity.class));
                }
            });

            //Ação do botão MyTrips
            btnMytrips.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Vai para a próxima activity.
                    startActivity(new Intent(MainActivity.this, MyTripsActivity.class));
                }
            });
        }  catch(Exception ex) {
            Toast.makeText(MainActivity.this, "Erro main activity: " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}