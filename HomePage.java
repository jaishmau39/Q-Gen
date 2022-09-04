package com.qgen.car.questionpapergenerator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
* Created by jaishma.
*/
public class QGenApp extends AppCompatActivity
{
 Button btngen,btnpush;
 @Override
 protected void onCreate(Bundle 
savedInstanceState) {
 super.onCreate(savedInstanceState);
 
setContentView(R.layout.activity_subject);
 btngen=findViewById(R.id.gen);
 btnpush=findViewById(R.id.pushQ);
 btngen.setOnClickListener(new
View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent intent3=new
Intent(QGenApp.this,Maingenerate.class);
 startActivity(intent3);
 }
 });
 btnpush.setOnClickListener(new
View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent intent4=new
Intent(QGenApp.this,MainPush.class);
 startActivity(intent4);
 }
 });
 }
}