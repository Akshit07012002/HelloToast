    package com.example.hellotoast;

    import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        private int c = 0;
        private int mCount = 0;
        private TextView mShowCount;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

        public void showToast(View view) {
        //c++;
            Toast toast = Toast.makeText(this,(R.string.toast_message),Toast.LENGTH_SHORT);
            toast.show();
        }

        @SuppressLint("SetTextI18n")
        public void countUP(View view) {
            Toast toast;
            mCount++;
            if(mShowCount != null){
                if(mCount > 9999)
                {
                    toast = Toast.makeText(this, "Press Reset. RN.", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else
                    mShowCount.setText(Integer.toString(mCount));
            }
        }

        public void reset(View view) {
            mCount = -1;
            countUP(view);
        }
    }