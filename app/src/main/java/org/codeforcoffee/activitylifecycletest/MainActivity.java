package org.codeforcoffee.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTxtMsg;
    private Button mBtnShow;
    private Book mBook;
    private Button mBtnSecret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBook = new Book("Hitchhikers Guide to the Galaxy",
                "Douglas Adams", "Penguin", 210, "12121");
        mTxtMsg = (TextView) findViewById(R.id.txtMsgToUser);
        mTxtMsg.setText("I am able to select a TextView and edit text");
        mBtnShow = (Button) findViewById(R.id.btn_show);

        mBtnSecret = (Button) findViewById(R.id.btn_secret);

        // easy
        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do stuff
                // react to the click
                Log.i("click", "ow ow ow");
                mTxtMsg.setText("wtf y u click me ? :( :( :( ow ow ow");
            }
        };
        mBtnSecret.setOnClickListener(cl);

        // hard
        mBtnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTxtMsg.setText("You should read " + mBook.getTitle() + " written by " + mBook.getAuthor());
            }
        });


        Log.i("lifecycle", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart(); // activity is visible
        Log.i("lifecycle", "onStart()"); // 1st: tag String, 2nd: desc String
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle", "onDestroy()");
    }
}
