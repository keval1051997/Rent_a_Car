package com.example.rentacar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Array extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[ ] attraction={"Sixt rent a car", "Budget Car Rental",
                "Payless", "National Car Rental", "Fox rent a car","Advantage Rent-A-Car"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array, R.id.rental, attraction));

        }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.sixt.com/")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.budget.com")));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.paylesscar.com/en/home")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.nationalcar.com/en/home.html")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.foxrentacar.com")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse ("https://www.advantage.com")));
                break;

        }





    }
}
