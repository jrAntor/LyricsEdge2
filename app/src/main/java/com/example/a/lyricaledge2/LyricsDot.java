package com.example.a.lyricaledge2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LyricsDot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics_dot);

        final WebView wb1 = (WebView)findViewById(R.id.wbDot);
        WebSettings ws = wb1.getSettings();
        ws.setBuiltInZoomControls(true);
        ws.setJavaScriptEnabled(true);
        wb1.setWebViewClient(new WebViewClient());
        wb1.loadUrl("http://www.lyrics.com");
    }
}
