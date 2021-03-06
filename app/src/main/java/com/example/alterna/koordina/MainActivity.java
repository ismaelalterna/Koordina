package com.example.alterna.koordina;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Persona> mPersona;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView =(RecyclerView) findViewById(R.id.my_recycler_view);



        mPersona = new ArrayList<Persona>();
        mPersona.add(new Persona("Ismael Garzon", "Coordinador Atencion Directa",
                "000000000", "ismael@gorabide.com", R.drawable.family_father));
        mPersona.add(new Persona("Sonia Tocino", "Coordinador Atencion Directa",
                "000000000", "soniat@gorabide.com", R.drawable.family_mother));
        mPersona.add(new Persona("Saioa Madrid", "Coordinador Atencion Directa",
                "000000000", "saioamadrid@gorabide.com", R.drawable.family_mother));
        mPersona.add(new Persona("Amaia Vidal", "Coordinador Fisioterapia",
                "000000000", "amaiavidal@gorabide.com", R.drawable.family_mother));
        mPersona.add(new Persona("Josean Llaguno", "Director Residencia",
                "000000000", "joseanllaguno@gorabide.com", R.drawable.family_father));
        mPersona.add(new Persona("Mariano Puente", "Responsable Servicios Auxiliares",
                "000000000", "marianopuente@gorabide.com", R.drawable.family_father));
        mPersona.add(new Persona("Mireia del Rio", "Coordinador Salud",
                "000000000", "mireiadelrio@gorabide.com", R.drawable.family_mother));

        mRecyclerView.setHasFixedSize(true);

       mLayoutManager = new LinearLayoutManager(this) ;
       mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter(mPersona, this);
        mRecyclerView.setAdapter(mAdapter);

    }
}
