package course.examples.memnumintrclave;
//Generar un número aleatorio entre 1 y 100000. Mostrar mediante una ventana emergente dicho número por un lapso de tiempo. Luego
// mediante un control EditText ("Number") pedir al operador que ingrese el número que vio en la pantalla. Cuando se presione un
// botón controlar el número generado aleatoriamente con el que ingresó el usuario y mediante otro Toast informar si acertó o no.
//He añadido que despues de acertar el numero que empieze de nuevo el juego
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        num=(int)(Math.random()*100001);
        String cadena=String.valueOf(num);
        Toast notificacion=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void controlar(View v) {
        String valorIngresado=et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if (valor==num) {
            Toast notificacion = Toast.makeText(this,"Muy bien recordaste el número mostrado.",Toast.LENGTH_LONG);
            notificacion.show();
            Toast n=Toast.makeText(this,"Empezamos de nuevo",Toast.LENGTH_LONG);
            n.show();
            num=(int)(Math.random()*100001);
            String cadena=String.valueOf(num);
            Toast not=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
            not.show();
        }
        else {
            Toast notificacion=Toast.makeText(this,"Lo siento pero no es el número que mostré.",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
