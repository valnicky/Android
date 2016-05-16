package course.examples.almacsharedp;
//Confeccionar un programa que solicite el ingrese del mail de una persona. Guardar el mail ingresado utilizando la clase
// SharedPreferences. Cada vez que se inicie la aplicación almacenar en el control EditText el último mail ingresado. Disponer un
// botón para almacenar el mail ingresado y finalizar el programa.
//he añadido contraseña y telefono.
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(prefe.getString("mail",""));
        et2.setText(prefe.getString("pwd",""));
        et3.setText(prefe.getString("tel",""));
    }

    public void ejecutar(View v) {
        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("mail", et1.getText().toString());
        editor.putString("pwd", et2.getText().toString());
        editor.putString("tel", et3.getText().toString());
        editor.commit();
        finish();
    }
}
