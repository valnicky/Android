package course.examples.proyecto014;
//programa que permita administrar una agenda personal.
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        et1= (EditText)findViewById(R.id.editText);
        et2= (EditText)findViewById(R.id.editText2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void grabar(View v){
        String nombre= et1.getText().toString();
         String datos=  et2.getText().toString();
        SharedPreferences pref = getSharedPreferences("agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= pref.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this, "Datos grabados", Toast.LENGTH_LONG).show();
    }
    public void recuperar(View v){
        String nombre= et1.getText().toString();
        SharedPreferences pref=getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d= pref.getString(nombre,"");
        if(d.length()==0){
            Toast.makeText(this,"No existe dicho nombre en la agenda",Toast.LENGTH_LONG).show();
        }else{
            et2.setText(d);
        }
    }
}
