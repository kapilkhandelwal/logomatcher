package com.example.logomatcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;
    LogoMatcher mMatcher;
    ArrayList<TextView> tvArray;
    ArrayList<TextView> answerTVArray;

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
                mMatcher.next();
            }
        });

        mMatcher = new LogoMatcher(tvArray, answerTVArray, mImageView);
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
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    private void populateTextViews() {
        tvArray = new ArrayList<TextView>();
        tvArray.add((TextView)findViewById(R.id.textView));
        tvArray.add((TextView)findViewById(R.id.textView2));
        tvArray.add((TextView)findViewById(R.id.textView3));
        tvArray.add((TextView)findViewById(R.id.textView4));
        tvArray.add((TextView)findViewById(R.id.textView5));
        tvArray.add((TextView)findViewById(R.id.textView6));
        tvArray.add((TextView)findViewById(R.id.textView7));
        tvArray.add((TextView)findViewById(R.id.textView8));
        tvArray.add((TextView)findViewById(R.id.textView9));

        answerTVArray.add((TextView)findViewById(R.id.answerTV));
        answerTVArray.add((TextView)findViewById(R.id.answerTV2));
        answerTVArray.add((TextView)findViewById(R.id.answerTV3));
        answerTVArray.add((TextView)findViewById(R.id.answerTV4));
        answerTVArray.add((TextView)findViewById(R.id.answerTV5));
        answerTVArray.add((TextView)findViewById(R.id.answerTV6));
        answerTVArray.add((TextView)findViewById(R.id.answerTV7));
        answerTVArray.add((TextView)findViewById(R.id.answerTV8));
        answerTVArray.add((TextView)findViewById(R.id.answerTV9));
    }


}
