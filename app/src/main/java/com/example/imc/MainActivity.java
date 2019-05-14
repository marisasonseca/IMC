package com.example.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        public static final String TAG_LOG ="MIAPP";
    //PARTE FUNCIONAL O DINAMICA

    //R.Drawable.baselin_3d
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);


    }

    public void calcula_IMC (View view) {
        //TODO GESTIONAR EL EVENTO DEL BOTON
        int id_vista = view.getId();
        // RECOGER PESO INTRODUCIDO
        EditText kilos = findViewById(R.id.kilos);//cojo la caja y leo el contenido
        String peso=kilos.getText().toString();
        // RECOGER ALTURA INTRODUCIDO
        EditText metros = findViewById(R.id.metros);//cojo la caja y leo el contenido
        String altura=metros.getText().toString();

        String texto_introducido = kilos.getText().toString();
        Log.d("MIAPP", "TEXTO INTRO=" + texto_introducido);


        String texto_introducido2 = metros.getText().toString();
        Log.d("MIAPP", "TEXTO INTRO=" + texto_introducido);

        // CASTING DE STRING A FLOAT

        float peso_float = Float.parseFloat(peso);
        float altura_float = Float.parseFloat(altura);


        // int peso2= Integer.parseInt("54");
    }
        private static float calcularIMC (float peso_float,float altura_float)
        {
            float imc = 0;

            imc = peso_float/(altura_float*altura_float);

            return imc;

        }
        private static void informarIMC (float imc) {
        System.out.println("Su imc es " + imc);
        if (imc < 16) {
            System.out.println("DESNUTRIDO");
        } else if (imc < 18) {
            System.out.println("DELGADO");
        } else if (imc < 25) {
            System.out.println("IDEAL");
        } else if (imc < 31) {
            System.out.println("SOPREBESO");
        } else {
            System.out.println("OBESO");
        }
    }



}
