package com.example.countriescustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import android.content.Intent;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
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


public class CAdapter extends android.widget.BaseAdapter{

    private Context context;
    private String CountriesnNames[];
    private String Capitals[];
    private int images [] ;
    private String Population[];
    private LayoutInflater inflater;

    public CAdapter (Context context, int[] images, String[] CountriesNames, String[] Capitals, String[] Population) {
        this.context = context;
        this.images = images;
        this.CountriesnNames = CountriesNames;
        this.Capitals = Capitals;
        this.Population = Population;
        inflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return CountriesnNames.length ;
    }

    @Override
    public Object getItem(int position) {
        return CountriesnNames[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater. inflate (R.layout. layout_spinner, parent, false) ;
        ImageView flagIV= convertView.findViewById(R.id.flagIV);
        TextView CountriesnNamesTV=convertView.findViewById(R.id.CountriesnNamesTV);
        TextView CapitalTV=convertView.findViewById(R.id.CapitalTV);
        TextView PopulationTV =convertView.findViewById(R.id.PopulationTV);
        flagIV.setImageResource(images[position]);
        CountriesnNamesTV.setText(CountriesnNames[position]);
        CapitalTV.setText(Capitals[position]);
        PopulationTV.setText(Population[position]);

        return convertView;
    }
}
