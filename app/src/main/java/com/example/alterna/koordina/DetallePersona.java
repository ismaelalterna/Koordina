package com.example.alterna.koordina;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class DetallePersona extends AppCompatActivity {
    private TextView tvName;
    private ImageView detalleImagen;
    private ImageView imagePhone;
    private ImageView imageMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_persona);

        Bundle datos = getIntent().getExtras();
        String nombre = datos.getString("nombre");
        final String telefono = datos.getString("telefono").toString();
        final String mail = datos.getString("mail");
        int image = datos.getInt("imagen");

        tvName = (TextView) findViewById(R.id.tvnombre);
        detalleImagen = (ImageView) findViewById(R.id.detalleImage);

        tvName.setText(nombre);
        detalleImagen.setImageResource(image);

        imageMail = (ImageView) findViewById(R.id.imageMail);
        imageMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{mail});
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });

        imagePhone = (ImageView) findViewById(R.id.imagePhone);

        imagePhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+ telefono));
                startActivity(callIntent);
            }
        });

    }
}
