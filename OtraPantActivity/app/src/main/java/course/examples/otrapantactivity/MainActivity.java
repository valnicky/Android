package course.examples.otrapantactivity;
//Confeccionar un programa que muestre en la ventana principal un botón que al ser presionado muestre otra ventana (Activity)
// mostrando un TextView con el nombre del programador de la aplicación y un botón para cerrar la ventana o actividad y que vuelva
// al primer Activity.
//Confeccionar un programa que solicite el ingrese de una dirección de un sitio web
// He añadido  una tercera ventana que muestre dicha página.
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
    }
    public void pasarPagina(View view) {
        String clave = et1.getText().toString();
        int claveint = Integer.parseInt(clave);
        if(claveint == 123){
            Intent i = new Intent(this, Pantalla2.class );
            startActivity(i);
        }else{
            Toast t = Toast.makeText(this,"La contraseña no es correcta",Toast.LENGTH_LONG);
            t.show();
        }
    }
}
