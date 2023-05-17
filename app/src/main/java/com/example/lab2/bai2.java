package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);
        TextView txtresult = findViewById(R.id.txtresult);
        EditText edtTen = findViewById(R.id.edtTen);
        EditText edtMasv = findViewById(R.id.edtMasv);
        EditText edtTuoi = findViewById(R.id.edtTuoi);
        RadioButton rdoNam = findViewById(R.id.rdoNam);
        RadioButton rdoNu = findViewById(R.id.rdoNu);
        CheckBox chkDabong = findViewById(R.id.chkDabong);
        CheckBox chkChoigame = findViewById(R.id.chkChoiGame);
        Button btnLuu = findViewById(R.id.btnLuu);

        txtresult.setMaxLines(5);

        btnLuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString();
                String maSv = edtMasv.getText().toString();
                String tuoi = edtTuoi.getText().toString();

                String gioiTinh = "lua chon gioi tinh";

                if (rdoNam.isChecked()) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nu";
                }

                String soThich = "khong co gi";
                if (chkDabong.isChecked() && chkChoigame.isChecked()) {
                    soThich = "da bong va choi game";
                } else if (chkDabong.isChecked()) {
                    soThich = "da bong";
                } else if (chkChoigame.isChecked()) {
                    soThich = "choi game";
                }


                txtresult.setText("Toi ten: " + ten + "\n" + "MSSV: " + maSv + "\n" + "Tuoi: " + tuoi + "\n" + "Gioi tinh: " + gioiTinh + "\n" + "So thich: " + soThich);
            }
        });
    }
}