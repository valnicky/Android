package course.examples.introdclave;
//Realizar un programa que contenga dos Activity. En el primero que solicite el ingreso de una clave (control Password) Si ingresa
// la clave 123 activar el segundo Activity mostrando en un TextView un mensaje de bienvenida (mostrar en Toast si se ingresa
// la clave incorrecta en el primer Activity).
//he añadido que salte a una pagina wweb introducida por el usuario
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
    }

    public void Enter(View view) {
        String clave = et1.getText().toString();
        int claveint = Integer.parseInt(clave);
        if (claveint == 123) {
            Intent i = new Intent(this, Activity2.class);

            i.putExtra("direccion", et2.getText().toString());

            startActivity(i);
        } else {
            Toast t = Toast.makeText(this, "La contraseña no es correcta", Toast.LENGTH_LONG);
            t.show();
        }
    }
}
