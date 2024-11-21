package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Food> foods = new ArrayList<Food>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);

        Adapter adapter = new Adapter(this, foods);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        foods.add(new Food ("Пицца", R.drawable.pizza));
        foods.add(new Food ("Бургер", R.drawable.burger));
        foods.add(new Food ("Роллы", R.drawable.rolls));
        foods.add(new Food ("Шаурма", R.drawable.shawarma));
        foods.add(new Food ("Борщ", R.drawable.borsh));
        foods.add(new Food ("Мороженое", R.drawable.ice_cream));

    }
}