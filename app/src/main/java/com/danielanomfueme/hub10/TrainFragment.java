package com.danielanomfueme.hub10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.danielanomfueme.hub10.R;

public class TrainFragment extends Fragment {

     public TrainFragment(){
     }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_train, container,false);
        WebView webView = v.findViewById(R.id.webview_train);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl( "https://www.hubten.net/train");
        return v;
    }


}