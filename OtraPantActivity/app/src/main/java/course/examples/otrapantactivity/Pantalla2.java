package course.examples.otrapantactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Pantalla2 extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        et1=(EditText)findViewById(R.id.editText);
    }
    public void salir(View v) {
        finish();
    }

    public void ver (View v) {
        Intent i=new Intent(this, Pantalla3.class);
        i.putExtra("direccion", et1.getText().toString());
        startActivity(i);
    }
}
