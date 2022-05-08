    package com.example.hellotoast;

    import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        private final int c = 0;
        private int mCount = 0;
        private TextView mShowCount;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mShowCount = findViewById(R.id.show_count);
            Button subtractOne = findViewById(R.id.sub1_button);
            subtractOne.setOnClickListener(subtractListener);
        }

        private final View.OnClickListener subtractListener = view -> {
            if(mCount > 0)
            {
                mCount-=2;
                countUP(view);
            }
        };

        public void showToast(View view) {
        //c++;
            Toast toast = Toast.makeText(this,(R.string.toast_message),Toast.LENGTH_SHORT);
            toast.show();
        }

        @SuppressLint("SetTextI18n")
        public void countUP(View view) {
            Toast toast;

            if(mShowCount != null){
                if(mCount > 9998)
                {
                    toast = Toast.makeText(this, "Max Value Reached", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    mCount++;
                    mShowCount.setText(Integer.toString(mCount));
                }

            }
        }

        public void reset(View view) {
            mCount = -1;
            countUP(view);
        }

        public void addCountHundred(View view) {

            Toast toast;
            if(mCount > 9899)
            {
                toast = Toast.makeText(this, "Add 1s now", Toast.LENGTH_SHORT);
                toast.show();
            }
            if(mCount < 9900) {
                mCount += 99;
                countUP(view);
            }
        }
    }