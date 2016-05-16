package course.examples.almacendatos;
//programa para administrar un calendario de actividades diarias. Los nombres de archivos corresponderán a las fechas que
// ingresamos. Luego cuando consultamos una fecha verificamos si hay un archivo de texto que coincida con dicha fecha.
import android.app.Activity;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);

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

    public void grabar(View v) {
        String nomarchivo = et1.getText().toString();
        nomarchivo = nomarchivo.replace('/', '-');
        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput(nomarchivo, Activity.MODE_PRIVATE));
            archivo.write(et2.getText().toString());
            archivo.flush();
            archivo.close();
        } catch (IOException ieo) {

        }
        Toast t = Toast.makeText(this, "Los datos fueron grabados", Toast.LENGTH_SHORT);
        t.show();
        et1.setText("");
        et2.setText("");
    }

    public void recuperar(View v) {
        String nomarchivo = et1.getText().toString();
        nomarchivo = nomarchivo.replace('/', '-');
        boolean enco = false;
        String[] archivos = fileList();

        for (int f = 0; f < archivos.length; f++) {
            if (nomarchivo.equals(archivos[f])) {
                enco = true;
                if (enco == true) {
                    try {
                        InputStreamReader isr = new InputStreamReader(openFileInput(nomarchivo));
                        BufferedReader br = new BufferedReader(isr);
                        String linea = br.readLine();
                        String todo = "";
                        while (linea != null) {
                            todo = todo + linea + "\n";
                            linea = br.readLine();
                        }
                        br.close();
                        isr.close();
                        et2.setText(todo);
                    } catch (IOException ioe) {
                    }
                } else {
                    Toast.makeText(this, "No hay datos grabados para dicha fecha", Toast.LENGTH_LONG).show();
                    et2.setText("");
                }
            }
        }
    }
}
