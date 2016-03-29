package cn.guomin0999.nrecord;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.guomin0999.library.AudioRecordingActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.record).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AudioRecordingActivity.class);
                //单位转毫秒
                startActivityForResult(intent.putExtra("minDuration", 2000).putExtra("maxDuration", 60 * 1000), 0);
            }
        });
    }
}
