package com.example.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener{


    private DrawerLayout mDr;
    private ActionBarDrawerToggle mtoggel;
 private Button button1  , button2 ,button3, button4,button5,button6;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDr = findViewById(R.id.drawerID);
        button1= findViewById(R.id.b1ID);
        button2 = findViewById(R.id.b2ID);
        button3 = findViewById(R.id.b3ID);
        button4 = findViewById(R.id.b4ID);
        button5 = findViewById(R.id.b5ID);
        button6 = findViewById(R.id.b6ID);


        mtoggel = new ActionBarDrawerToggle(this, mDr, R.string.open, R.string.close);
        mDr.addDrawerListener(mtoggel);
        mtoggel.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView = findViewById(R.id.navID);
        navigationView.setNavigationItemSelectedListener(this);






        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()){

                    case R.id.b1ID:
                        Toast.makeText(getApplicationContext(),"Relevant Magazine",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,RelevantMZActivity.class);
                        startActivity(ik);
                        break;




                }
            }
        });




        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()){

                    case R.id.b2ID:
                        Toast.makeText(getApplicationContext(),"Ad Age",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,AdAgeMZActivity.class);
                        startActivity(ik);
                        break;




                }


            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()){

                    case R.id.b3ID:
                        Toast.makeText(getApplicationContext(),"Vanity Fair",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,VanityMZActivity.class);
                        startActivity(ik);
                        break;




                }


            }
        });



        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()){

                    case R.id.b4ID:
                        Toast.makeText(getApplicationContext(),"Frieze Magazine",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,FriezeMZActivity.class);
                        startActivity(ik);
                        break;




                }


            }
        });




        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()){

                    case R.id.b5ID:
                        Toast.makeText(getApplicationContext(),"New Yorker ",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,NewYorkerMZActivity.class);
                        startActivity(ik);
                        break;




                }


            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (v.getId()){

                    case R.id.b6ID:
                        Toast.makeText(getApplicationContext(),"Wired ",Toast.LENGTH_SHORT).show();
                        Intent ik = new Intent(MainActivity.this,WiresMZActivity.class);
                        startActivity(ik);
                        break;




                }


            }
        });






    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mtoggel.onOptionsItemSelected(item)) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();

        switch (id){

            case R.id.bdID:
                Toast.makeText(getApplicationContext(),"cradit",Toast.LENGTH_SHORT).show();
                Intent in = new Intent(MainActivity.this,CraditActivity.class);
                startActivity(in);
                break;

            case R.id.aboutID:
                Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_SHORT).show();
                Intent ino = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(ino);
                break;


            case R.id.logoutID:
                Toast.makeText(getApplicationContext(),"Feedback",Toast.LENGTH_SHORT).show();
                Intent inoo = new Intent(MainActivity.this,FeedBackActivity.class);
                startActivity(inoo);
                break;
            case R.id.searchID:

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/type");
                String subject = "Magazine apps";
                Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_SHORT).show();
                String body ="This app  is very useful .\n com.example.news";
                intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                intent.putExtra(Intent.EXTRA_TEXT,body);
                startActivity(Intent.createChooser(intent,"share with"));


            case R.id.dateID:
                Toast.makeText(getApplicationContext(),"Date",Toast.LENGTH_SHORT).show();
                Intent inooo= new Intent(MainActivity.this,DatePicker.class);
                startActivity(inooo);
                break;


        }
        return true;
    }


}
