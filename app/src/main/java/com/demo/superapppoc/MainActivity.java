package com.demo.superapppoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        ArrayList<CompaniesModel> companiesModelArrayList = new ArrayList<>();

        companiesModelArrayList.add(new CompaniesModel("Addepar", R.drawable.addepar));
        companiesModelArrayList.add(new CompaniesModel("Advisor Metrix", R.drawable.advisor_metrix));
        companiesModelArrayList.add(new CompaniesModel("Blackrock", R.drawable.blackrock));
        companiesModelArrayList.add(new CompaniesModel("Covisum", R.drawable.covisum));
        companiesModelArrayList.add(new CompaniesModel("Money Quotient", R.drawable.money_quotient));
        companiesModelArrayList.add(new CompaniesModel("Riskalyze", R.drawable.riskalyze));

        CompaniesGridViewAdapter adapter = new CompaniesGridViewAdapter(this, companiesModelArrayList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener((arg0, arg1, position, arg3) -> {
            int row = position / companiesModelArrayList.size();
            Intent intent =new Intent(this, DetailsActivity.class);
            intent.putExtra(DetailsActivity.PORTAL_ID, position);
            startActivity(intent);
        });
    }
}