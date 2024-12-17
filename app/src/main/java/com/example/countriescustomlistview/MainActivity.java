package com.example.countriescustomlistview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Toast;

import android.widget.Switch;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import android.widget.Spinner;

import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarView;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner1;
    TextView countryTV;
    TextView CapitalTV;
    TextView PopulationTV;

    String [] countriesNames
            ={"please choose a country","Israel","Italy",
            "The Unites States","France","Greece","Germany"
            ,"Canada","Mexico","Peru","Brazil"};

    String[] capitals = {
            " ", "Jerusalem", "Rome",
            "Washington, D.C.", "Paris", "Athens",
            "Berlin", "Ottawa", "Mexico City",
            "Lima", "Brasília"
    };

    String[] populations = {
            " ", "9.3 million", "59.1 million",
            "332.0 million", "67.8 million", "10.4 million",
            "83.2 million", "38.2 million", "128.9 million",
            "33.7 million", "214 million"
    };

    int[] images = {
            R.drawable.white, R.drawable.israelflagnew, R.drawable.italyflag, R.drawable.usaflag,
            R.drawable.franceflag, R.drawable.greeceflag, R.drawable.germanyflag, R.drawable.canadaflag,
            R.drawable.mexicoflag, R.drawable.peruflag,
            R.drawable.brazilflag
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner1 = findViewById(R.id.spinner1);
        countryTV = findViewById(R.id.countryTV);
        CapitalTV = findViewById(R.id.CapitalTV);
        PopulationTV = findViewById(R.id.PopulationTV);



        CAdapter SpinnerAdapter = new CAdapter (this, images, countriesNames, capitals,populations) ;
        spinner1.setAdapter(SpinnerAdapter) ;
        spinner1.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        countryTV.setText(countriesNames[position]);
        CapitalTV.setText(capitals[position]);
        PopulationTV.setText(populations[position]);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}