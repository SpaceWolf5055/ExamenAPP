package com.edu.isc.tesoem.omar.examenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {
    RadioButton rdbtnOp1, rdbtnOp2, rdbtnOp3;
    TextView txtNpregunta, txtpregunta;
    Button btnsiguiente, btnsalir ;
    int nota = 0; int Npregunta = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        rdbtnOp1 = (RadioButton)findViewById(R.id.rdbtnOp1);
        rdbtnOp2 = (RadioButton)findViewById(R.id.rdbtnOp2);
        rdbtnOp3 = (RadioButton)findViewById(R.id.rdbtnOp3);

        txtNpregunta = (TextView)findViewById(R.id.txtNpregunta);
        txtpregunta = (TextView)findViewById(R.id.txtpregunta);

        btnsiguiente = (Button)findViewById(R.id.btnsiguiente);
        btnsalir = (Button)findViewById(R.id.btnsalir);
    }

    public void Siguiente(View v){
        if (rdbtnOp1.isChecked() == false && rdbtnOp2.isChecked() == false && rdbtnOp3.isChecked() == false){
            Toast.makeText(this, "Elija una opción", Toast.LENGTH_SHORT).show();
        } else if (Npregunta == 1) {
            //Se verifica la respuesta, si es correcta se agregan dos puntos a la nota
            if (rdbtnOp2.isChecked()){
                nota = nota + 2;
            }
            //se le suma 1 al contador de la pregunta
            Npregunta = Npregunta + 1;
            //se resetean los textos para la siguiente pregunta
            txtNpregunta.setText("Pregunta 2. Quien pinto la ultima cena");
            //txtpregunta.setText("Su resuesta es correcta");
            rdbtnOp1.setText("Leonardo Davincie");
            rdbtnOp2.setText("Diego Rivera");
            rdbtnOp3.setText("Picasso");
            //se limpian los radiobutton para la siguiente pregunta
            rdbtnOp1.setChecked(false);
            rdbtnOp2.setChecked(false);
            rdbtnOp3.setChecked(false);
        } else if (Npregunta == 2){
            //se verifica la respuesta, si es correcta se agregan 2 puntos a la nota
            if (rdbtnOp1.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            txtNpregunta.setText("Pregunta 3. Quien es el mejor corredor de F1");
            //txtpregunta.setText("Su respuesa es correcta");
            rdbtnOp1.setText("Michael Schumacher");
            rdbtnOp2.setText("Ayrton Senna");
            rdbtnOp3.setText("Checo Perez");

            rdbtnOp1.setChecked(false);
            rdbtnOp2.setChecked(false);
            rdbtnOp3.setChecked(false);
        } else if (Npregunta == 3){
            if (rdbtnOp3.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            txtNpregunta.setText("Pregunta 4. Quien fue el primero actor que interpreto a El Hombre Araña");
            //txtpregunta.setText("Su respuesa es correcta");
            rdbtnOp1.setText("Tobey Maguire");
            rdbtnOp2.setText("Tom Holland");
            rdbtnOp3.setText("Andrew Garfield");

            rdbtnOp1.setChecked(false);
            rdbtnOp2.setChecked(false);
            rdbtnOp3.setChecked(false);
        } else if (Npregunta == 4){
            if (rdbtnOp1.isChecked()){
                nota = nota + 2;
            }
            Npregunta = Npregunta + 1;
            txtNpregunta.setText("Pregunta 5. La palabra Good en ingles que significa al español");
            //txtpregunta.setText("Su respuesta es correcta");
            rdbtnOp1.setText("Dios");
            rdbtnOp2.setText("Bueno");
            rdbtnOp3.setText("Bota");

            rdbtnOp1.setChecked(false);
            rdbtnOp2.setChecked(false);
            rdbtnOp3.setChecked(false);
        } else if (Npregunta == 5){
            if (rdbtnOp2.isChecked()){
                nota = nota + 2;
            }
            txtNpregunta.setText("Calificaion: "+nota);
            if (nota >= 6){
                txtpregunta.setText("Estas: Aprobado :D");
            }else{
                txtpregunta.setText("Estas: Reprobado D:");
            }
            rdbtnOp1.setVisibility(View.GONE);
            rdbtnOp2.setVisibility(View.GONE);
            rdbtnOp3.setVisibility(View.GONE);
            btnsiguiente.setVisibility(View.GONE);
        }
    }

    public void Salir(View v){
            finish();
    }
}
