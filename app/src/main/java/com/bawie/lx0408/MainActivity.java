package com.bawie.lx0408;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downLoad();
            }
        });
    }

    private void downLoad() {

        new Thread(){
            @Override
            public void run() {
                super.run();
                String downLoadurl = "http://mobile.bwstudent.com/media/movie.apk";

                try {
                    URL url = new URL(downLoadurl);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.connect();
                    int code = httpURLConnection.getResponseCode();
                    if (code == 200){
                        InputStream inputStream = httpURLConnection.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len;
                        File directory = Environment.getExternalStorageDirectory();
                        File apk = new File(directory, "movie.apk");
                        if (!apk.exists()){
                            apk.createNewFile();
                        }
                        FileOutputStream outputStream = new FileOutputStream(apk);
                        while ((len = inputStream.read(bytes)) != -1){
                            outputStream.write(bytes,0,len);
                        }
                        inputStream.close();;
                        outputStream.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
