package course.examples.verifcampovacio;
//formulario, no hay que dejar campos vacios
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
    }

    public void verificar(View view){
        String usuario = et1.getText().toString();
        if(usuario.length()==0){
            Toast notific = Toast.makeText(this, "Introduce el usuario, el campo no puede quedar vacio", Toast.LENGTH_LONG);
            notific.show();
        }

        String mail = et3.getText().toString();
        if(mail.length() == 0){
            Toast notif = Toast.makeText(this,"Campo vacio, Introduce la clave.", Toast.LENGTH_LONG);
            notif.show();
        }

        String clave = et2.getText().toString();
        if(clave.length() == 0){
            Toast   notificacion = Toast.makeText(this,"Introduce el correo electronico", Toast.LENGTH_LONG );
            notificacion.show();
        }
    }
}
