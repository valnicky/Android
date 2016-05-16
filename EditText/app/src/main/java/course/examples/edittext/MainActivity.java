package course.examples.edittext;
//Confeccionar una aplicación para android que permita ingresar el nombre de usuario y su clave en dos controles de tipo EditText.
//Verificar al presionar un botón si se ingresó algún texto en la clave. Si no se ingresó texto informar mediante una notificación
// dicha situación.
//He añadido otros2 campos: un email y un telefono.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2,et3,et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
    }

    public void verificar(View v) {
        String usuario =et1.getText().toString();
        if (usuario.length()==0) {
            Toast notificacion= Toast.makeText(this,"Introduce el usuario.", Toast.LENGTH_LONG);
            notificacion.show();
        }

        String correo=et2.getText().toString();
        if (correo.length()==0) {
            Toast notif= Toast.makeText(this,"El campo no puede quedar vacío, introduce un email valido.", Toast.LENGTH_LONG);
            notif.show();
        }

        String clave=et3.getText().toString();
        if (clave.length()==0) {
            Toast notific= Toast.makeText(this,"La clave no puede quedar vacía", Toast.LENGTH_LONG);
            notific.show();
        }

        String telefono =et4.getText().toString();
        if (telefono.length()==0) {
            Toast notfc= Toast.makeText(this,"Introduce el numero de telefono.", Toast.LENGTH_LONG);
            notfc.show();
        }
    }
}
