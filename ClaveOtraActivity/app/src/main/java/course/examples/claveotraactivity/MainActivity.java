package course.examples.claveotraactivity;
//programa que contenga dos Activity. En el primero que solicite el ingreso de una clave (control Password) Si ingresa la clave
// "abc123" activar el segundo Activity mostrando en un TextView un mensaje de bienvenida (mostrar en Toast si se ingresa la clave
// incorrecta en el primer Activity).
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
        et1=(EditText)findViewById(R.id.editText);
    }

    public void verificar(View v) {
        String clave = et1.getText().toString();
        if (clave.equals("abc123")) {
            Toast notificacion = Toast.makeText(this,"Muy bien, puedes pasar a la otra pantalla.",Toast.LENGTH_LONG);
            notificacion.show();

            Intent i = new Intent(this, Activity2.class);
            startActivity(i);
        } else {
            Toast notificacion = Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
