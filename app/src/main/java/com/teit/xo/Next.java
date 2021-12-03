package com.teit.xo;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Next extends Activity {
    ArrayList<Integer> list;
    Integer action;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        action=0;
        list=new ArrayList<>();
        list.add(0);
        SetClick();
    }
    public void SetClick(){
        Button B1 = (Button) findViewById(R.id.B1);
        Button B2 = (Button) findViewById(R.id.B2);
        Button B3 = (Button) findViewById(R.id.B3);
        Button B4 = (Button) findViewById(R.id.B4);
        Button B5 = (Button) findViewById(R.id.B5);
        Button B6 = (Button) findViewById(R.id.B6);
        Button B7 = (Button) findViewById(R.id.B7);
        Button B8 = (Button) findViewById(R.id.B8);
        Button B9 = (Button) findViewById(R.id.B9);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B1);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B2);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B3);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B4);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B5);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B6);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B7);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B8);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action=action+1;
                Button B = (Button) findViewById(R.id.B9);
                if (list.get(0)==0){
                    list.set(0,1);
                    B.setText("X");
                    CalcResult();
                }
                else {
                    list.set(0,0);
                    B.setText("O");
                    CalcResult();
                }
                if (B.getText().toString().equals("X") || B.getText().equals("O")){
                    B.setOnClickListener(null);
                }
            }
        });
    }
    public void CalcResult(){
        Button B1 = (Button) findViewById(R.id.B1);Button B2 = (Button) findViewById(R.id.B2);Button B3 = (Button) findViewById(R.id.B3);Button B4 = (Button) findViewById(R.id.B4);Button B5 = (Button) findViewById(R.id.B5);Button B6 = (Button) findViewById(R.id.B6);Button B7 = (Button) findViewById(R.id.B7);Button B8 = (Button) findViewById(R.id.B8);Button B9 = (Button) findViewById(R.id.B9);
        String B1_S = B1.getText().toString();String B2_S = B2.getText().toString();String B3_S = B3.getText().toString();String B4_S = B4.getText().toString();
        String B5_S = B5.getText().toString();String B6_S = B6.getText().toString();String B7_S = B7.getText().toString();String B8_S = B8.getText().toString();
        String B9_S = B9.getText().toString();
        TextView X = (TextView)findViewById(R.id.X);TextView O = (TextView)findViewById(R.id.O);
        String X_S =X.getText().toString();  String O_S = O.getText().toString();
        //Win condition
        if (B1_S.equals(B2_S) && B2_S.equals(B3_S) && !B1_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B1_S+"Wins!",Toast.LENGTH_LONG);
            if (B1_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B1_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B4_S.equals(B5_S) && B5_S.equals(B6_S)&& !B4_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B4_S+"Wins!",Toast.LENGTH_LONG);
            if (B4_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B4_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B7_S.equals(B8_S) && B8_S.equals(B9_S)&& !B7_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B7_S+"Wins!",Toast.LENGTH_LONG);
            if (B7_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B7_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B1_S.equals(B4_S) && B4_S.equals(B7_S)&& !B1_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B1_S+"Wins!",Toast.LENGTH_LONG);
            if (B1_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B1_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B2_S.equals(B5_S) && B5_S.equals(B8_S)&& !B2_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B2_S+"Wins!",Toast.LENGTH_LONG);
            if (B2_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B2_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B3_S.equals(B6_S) && B6_S.equals(B9_S)&& !B3_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B3_S+"Wins!",Toast.LENGTH_LONG);
            if (B3_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B3_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B1_S.equals(B5_S) && B5_S.equals(B9_S)&& !B1_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B1_S+"Wins!",Toast.LENGTH_LONG);
            if (B1_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B1_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (B3_S.equals(B5_S) && B5_S.equals(B7_S)&& !B3_S.equals("")){
            Toast toast = Toast.makeText(getApplicationContext(),B3_S+"Wins!",Toast.LENGTH_LONG);
            if (B3_S.equals("X")){
                int i = Integer.parseInt(X_S);
                i=i+1;
                X.setText(String.valueOf(i));
            }
            if (B3_S.equals("O")){
                int i = Integer.parseInt(O_S);
                i=i+1;
                O.setText(String.valueOf(i));
            }
            toast.show();
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
        if (action==9){
            B1.setText("");B2.setText("");B3.setText("");B4.setText("");B5.setText("");B6.setText("");B7.setText("");B8.setText("");B9.setText("");
            SetClick();
            action=0;
        }
    }
}
