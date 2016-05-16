package course.examples.introdclave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Activity2 extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webView1=(WebView)findViewById(R.id.webView);
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        webView1.loadUrl("http://" + dato);
    }
    public void volver(View v) {
        finish();
    }

}
