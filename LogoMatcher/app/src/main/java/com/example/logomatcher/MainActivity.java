package com.example.logomatcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTv1, mTv2, mTv3, mTv4, mTv5, mTv6, mTv7, mTv8, mTv9;
    ImageView mImageView;
    TextView mATV1, mATV2, mATV3, mATV4, mATV5, mATV6, mATV7, mATV8, mATV9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageView);
        mImageView.setVisibility(View.VISIBLE);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mTv1 = findViewById(R.id.textView);
        mTv2 = findViewById(R.id.textView2);
        mTv3 = findViewById(R.id.textView3);
        mTv4 = findViewById(R.id.textView4);
        mTv5 = findViewById(R.id.textView5);
        mTv6 = findViewById(R.id.textView6);
        mTv7 = findViewById(R.id.textView7);
        mTv8 = findViewById(R.id.textView8);
        mTv9 = findViewById(R.id.textView9);
        mATV1 = findViewById(R.id.answerTV);
        mATV2 = findViewById(R.id.answerTV2);
        mATV3 = findViewById(R.id.answerTV3);
        mATV4 = findViewById(R.id.answerTV4);
        mATV5 = findViewById(R.id.answerTV5);
        mATV6 = findViewById(R.id.answerTV6);
        mATV7 = findViewById(R.id.answerTV7);
        mATV8 = findViewById(R.id.answerTV8);
        mATV9 = findViewById(R.id.answerTV9);



//        new Logo((ImageView) findViewById(R.id.imageView))
//                .execute(MY_URL_STRING);
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }


}
