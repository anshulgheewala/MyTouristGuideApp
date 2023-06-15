package com.dataflair.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class CitydetailsActivity extends AppCompatActivity {


    CardView btn_Hotel,btn_Restaurant,btn_Famousplaces,btn_Busstation,btn_History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citydetails);

        getSupportActionBar().hide();

        //To get city name
        Intent intent=getIntent();
        String cityname=intent.getStringExtra("cityname");

        btn_Hotel=findViewById(R.id.btnHotelrooms);
        btn_Restaurant=findViewById(R.id.btnRestaurant);
        btn_Famousplaces=findViewById(R.id.btnFamousplaces);
//        btn_Busstation=(Button)findViewById(R.id.btnBusstation);
//        btn_History=(Button)findViewById(R.id.btnHistory);



        btn_Hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HotelActivity.class);
                intent.putExtra("cityname",cityname);
                startActivity(intent);

            }
        });

        btn_Restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),RestaurantActivity.class);
                intent.putExtra("cityname",cityname);
                startActivity(intent);
            }
        });


        btn_Famousplaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),PlacesActivity.class);
                intent.putExtra("cityname",cityname);
                startActivity(intent);
            }
        });


//        btn_Busstation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),BusstationActivity.class);
//                intent.putExtra("cityname",cityname);
//                startActivity(intent);
//
//            }
//        });
//
//        btn_History.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),HistoryActivity.class);
//                intent.putExtra("cityname",cityname);
//                startActivity(intent);
//            }
//        });

    }
}