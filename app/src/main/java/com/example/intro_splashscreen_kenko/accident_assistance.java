package com.example.intro_splashscreen_kenko;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class accident_assistance extends AppCompatActivity {
    static int permission = 100;
    private final String email = "kenkoaccident@gmail.com";
    private final String phone_num = "112";
    FusedLocationProviderClient flp;
    private Button btn1;
    private TextView t1, t2;
    private String s1;
    private String s2;
    private String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident_assistance);
        user = "RAMESH SUMESH";
        btn1 = findViewById(R.id.button8);
        t1 = findViewById(R.id.text4);
        t2 = findViewById(R.id.text_trial2);
        flp = LocationServices.getFusedLocationProviderClient(accident_assistance.this);
        if (ContextCompat.checkSelfPermission(accident_assistance.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(accident_assistance.this, new String[]{Manifest.permission.CALL_PHONE}, permission);
        }

        if (ActivityCompat.checkSelfPermission(accident_assistance.this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(accident_assistance.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            getCurrentLocation();
        } else {
            ActivityCompat.requestPermissions(accident_assistance.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, permission);
        }
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent passi1 = new Intent(accident_assistance.this, finalact_heart_aid.class);
                passi1.putExtra("s1", s1);
                passi1.putExtra("s2", s2);
                startActivity(passi1);
                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.setType("text/html");
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
                mail.putExtra(Intent.EXTRA_SUBJECT, "KENKO ACCIDENT CASUALTY");
                mail.putExtra(Intent.EXTRA_TEXT, "The subject " + user + " has called for S.O.S under ACCIDENT CASUALTY within the latitude :" + s1 + " and longitude: " + s2 + " . Kenko is requesting maximum alert on the casualty " +
                        "and to be ready for all required emergencies");
                startActivity(Intent.createChooser(mail, "SOS"));
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:" + phone_num));
                startActivity(call);

            }
        });
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults.length > 0 && (grantResults[0] + grantResults[1] == PackageManager.PERMISSION_GRANTED)) {
            getCurrentLocation();

        } else {
            Toast.makeText(getApplicationContext(), "PERMISSION DENIED", Toast.LENGTH_SHORT).show();
        }
    }


    @SuppressLint("MissingPermission")
    private void getCurrentLocation() {
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (lm.isProviderEnabled(LocationManager.GPS_PROVIDER) || lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            flp.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
                @Override
                public void onComplete(@NonNull Task<Location> task) {
                    Location l1 = task.getResult();
                    if (l1 != null) {
                        t1.setText(String.valueOf(l1.getLatitude()));
                        t2.setText(String.valueOf(l1.getLongitude()));
                        s1 = String.valueOf(l1.getLatitude());
                        s2 = String.valueOf(l1.getLongitude());

                    } else {
                        LocationRequest lr1 = new LocationRequest().setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
                                .setInterval(1000)
                                .setFastestInterval(1000)
                                .setNumUpdates(1);
                        LocationCallback lc1 = new LocationCallback() {
                            @Override
                            public void onLocationResult(LocationResult locationResult) {
                                Location l1 = locationResult.getLastLocation();
                                t1.setText(String.valueOf(l1.getLatitude()));
                                t1.setText(String.valueOf(l1.getLongitude()));
                                s1 = String.valueOf(l1.getLatitude());
                                s2 = String.valueOf(l1.getLongitude());

                            }
                        };
                        flp.requestLocationUpdates(lr1, lc1, Looper.myLooper());
                    }

                }
            });
        } else {
            startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));


        }
    }
//acc_body = "THE SUBJECT" + user + "has called for sos under accident casualty within the latitude:"+s1+"and longitude"+s2+". Kenko is requesting maximum alert on the casualty " +
//"and to be ready for all required emergencies".toString();

}