package com.lorien.linkagescroll.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lorien.linkagescroll.R;
import com.lorien.linkagescroll.activity.adapter.RecyclerAdapter;

import java.util.ArrayList;

public class RVWVActivity extends AppCompatActivity {
    String htmlString = "<h1>Title1</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p><br>" +
            "<h1>Title2</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p><br>" +
            "<h1>Title3</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title4</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title5</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title6</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title7</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title8</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title9</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title10</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title11</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title12</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title13</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title14</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title15</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title16</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title17</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p>" +
            "<h1>Title18</h1><p>This is HTML text. <i>Formatted in italics.</i><br>Anothor Line.</p><br>" ;

    private WebView mWebView;
    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvwv);

        mWebView = findViewById(R.id.webview);
        mRv = findViewById(R.id.recyclerview);

        mWebView = findViewById(R.id.webview);
        mWebView.loadData(htmlString, "text/html", "utf-8");
        WebViewClient webViewClient = new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        };
        mWebView.setWebViewClient(webViewClient);

        mRv.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(getData());
        mRv.setAdapter(adapter);
    }

    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        String temp = "RecyclerView - ";
        for(int i = 0; i < 30; i++) {
            data.add(temp + i);
        }
        return data;
    }
}
