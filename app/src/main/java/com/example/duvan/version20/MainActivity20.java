package com.example.duvan.version20;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity20 extends AppCompatActivity {

    private EditText eNombre, ePassword, eRePassword, eCorreo;
    private TextView tResult, tlistas;
    Button bfecha, bBuscar, bEliminar, bVer;
    EditText eFecha;
    private Spinner sCiudades;
    private String sexo= "Masculino", ciudad= "Medellin";
    private int dia, mes, ano;
    CheckBox bici, lee, baile, pelis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        eNombre=findViewById(R.id.eNombre);
        ePassword = findViewById(R.id.ePassword);
        eRePassword = findViewById(R.id.eRePassword);
        eCorreo = findViewById(R.id.eCorreo);
        tResult = findViewById(R.id.tResultado);
        bfecha= (Button) findViewById(R.id.bfecha);
        eFecha= (EditText) findViewById(R.id.eFecha);
        bfecha.setOnClickListener(this);
        bici= (CheckBox) findViewById(R.id.bici);
        lee= (CheckBox) findViewById(R.id.lee);
        baile= (CheckBox) findViewById(R.id.baile);
        pelis= (CheckBox) findViewById(R.id.pelis);
        bBuscar= (Button)findViewById(R.id.bBuscar);
        bEliminar=(Button)findViewById(R.id.bEliminar);
        bVer=(Button)findViewById(R.id.bVer);
        tlistas= findViewById(R.id.tlistas);


        final ArrayList<String> name = new ArrayList<String>();
        final ArrayList<String> email = new ArrayList<String>();
        final ArrayList<String> dateBirth = new ArrayList<String>();





    }

    public void guardarClicked(View view) {
        String name, email, dateBirth, genre, pass, repass;


        name= eNombre.getText().toString();
        email= eCorreo.getText().toString();
        dateBirth= eFecha.getText().toString();


        if (name.equals ("") || pass.equals("") || repass.equals("") || email.equals("") || dateBirth.equals (""))
            Toast.makeText(getApplicationContext(), "Debe digitar todos los campos", Toast.LENGTH_SHORT).show();

        else
        if (pass.equals(repass))
            tResult.setText(name+" - "+email+" - "+sexo+" - "+ciudad+" - "+dateBirth);


        else
            Toast.makeText(getApplicationContext(), "Las contraseñas no son iguales", Toast.LENGTH_SHORT).show();

    }



    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        if (id == R.id.rMasculino)
            sexo = "Masculino";
        else
            sexo = "Femenino";


    }



    public void buscarClicked(View view) {
        eNombre = getText();
        for (int i = 0; i < nombre.size(); i++) {
            if (eNombre.get(i).equals(name)) {
                eNombre.getText(i));


            }



    }

    public void eliminarClicked(View view) {
    }

    public void verClicked(View view) {
    }
    @Override
    public void onClick(View v) {
        if (v==bfecha){
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    eFecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            }
                    ,dia, mes,ano);
            datePickerDialog.show();
        }
    }


}
