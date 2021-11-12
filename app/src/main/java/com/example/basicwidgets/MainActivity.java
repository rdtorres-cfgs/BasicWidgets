package com.example.basicwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verFleeting(View viewFleeting) {
        Intent fleeting_images = new Intent(this, FleetingImages.class);
        startActivity(fleeting_images);
    }

    public void verField(View viewField) {
        Intent field_of_green = new Intent(this, FieldOfGreen.class);
        startActivity(field_of_green);
    }

    public void verBox(View viewBox) {
        Intent check_box = new Intent(this, CheckBoxDemo.class);
        startActivity(check_box);
    }

    public void verRadio(View viewRadio) {
        Intent Radio = new Intent(this, Radio.class);
        startActivity(Radio);
    }

    public void verLinear(View viewLinear) {
        Intent Linear = new Intent(this, LinearLayoutDemo.class);
        startActivity(Linear);
    }

    public void verBoxModel(View viewBoxModel) {
        Intent BoxModel = new Intent(this, BoxModel.class);
        startActivity(BoxModel);
    }

    public void verRelative(View viewRelative) {
        Intent RelativeLayout = new Intent(this, RelativeDemo.class);
        startActivity(RelativeLayout);
    }
    public void verOverlap(View viewOverlap) {
        Intent Overlap = new Intent(this, Overlap.class);
        startActivity(Overlap);
    }
    public void verTabula(View viewTabula) {
        Intent Tabula = new Intent(this, TabulaRasa.class);
        startActivity(Tabula);
    }
    public void verScrollWork(View viewScrollWork) {
        Intent ScrollWork = new Intent(this, scrollwork.class);
        startActivity(ScrollWork);
    }
}