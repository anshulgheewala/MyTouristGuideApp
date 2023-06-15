package com.dataflair.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class HotelActivity extends AppCompatActivity {

    RecyclerView mRecyclerview;
    RecyclerView.LayoutManager lm;
    hotelAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        getSupportActionBar().hide();

        //To Get City name for refference
        Bundle extras = getIntent().getExtras();
        String cityname=extras.getString("cityname");


        mRecyclerview = (RecyclerView) findViewById(R.id.recyclerviewHotel);
        lm=new GridLayoutManager(this,2);
        mRecyclerview.setLayoutManager(lm);
        //mRecyclerview.setLayoutManager(new LinearLayoutManager(getApplicationContext()));



        FirebaseRecyclerOptions<Model> options =
                new FirebaseRecyclerOptions.Builder<Model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("hotelrooms").child(cityname), Model.class)
                        .build();

        adapter = new hotelAdapter(options);
        mRecyclerview.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        adapter.startListening();
        super.onStart();
    }

    @Override
    public void onStop() {
        adapter.stopListening();
        super.onStop();

    }
}

class hotelAdapter extends FirebaseRecyclerAdapter<Model, hotelAdapter.hotelViewholder> {

    public hotelAdapter(@NonNull FirebaseRecyclerOptions<Model> options) {

        super(options);

    }

    @Override
    protected void onBindViewHolder(@NonNull hotelViewholder holder, int position, @NonNull Model model) {


        //For Loading image into imageview using url
        Picasso.get().load(model.getImage()).into(holder.mhotelImg);

        //for loading hotel name into recycler view
        holder.mhotelTitle.setText(model.getName());

        //for loading hotel discription into recyclerview
       holder.mhotelData.setText(model.getDiscription());
        String discription=model.getDiscription().toString();
        String name=model.getName().toString();
        String image2=model.getImage2().toString();
        String image3=model.getImage3().toString();
        String image4=model.getImage4().toString();
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context=view.getContext();
                Intent intent=new Intent(context,LastItem.class);
                intent.putExtra("name",name);
                intent.putExtra("discription",discription);
               intent.putExtra("image2",image2);
              intent.putExtra("image3",image3);
                intent.putExtra("image4",image4);
                context.startActivity(intent);
            }
        });


    }


    @NonNull
    @Override
    public hotelViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_data_item, parent, false);
        return new hotelViewholder(view);
    }

    class hotelViewholder extends RecyclerView.ViewHolder {


        ImageView mhotelImg;
        TextView mhotelTitle;
        TextView mhotelData;
        CardView cv;

        public hotelViewholder(@NonNull View itemView) {
            super(itemView);

            mhotelImg = (ImageView) itemView.findViewById(R.id.ImgView);
            mhotelTitle = (TextView) itemView.findViewById(R.id.titleTxtView);
            mhotelData = (TextView) itemView.findViewById(R.id.dataTxtView);
            cv=itemView.findViewById(R.id.cv);
        }
    }

}