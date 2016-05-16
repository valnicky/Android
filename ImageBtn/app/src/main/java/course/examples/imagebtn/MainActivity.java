package course.examples.imagebtn;
//Disponer un objeto de la clase ImageButton que muestre una imagen de un teléfono. Cuando se presione mostrar en un control
// TextView el mensaje "Llamando".
//He añadido 2 Toast
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView);

        Toast notificacion=Toast.makeText(this,"¿Sabes el numero?",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void llamar(View view) {
        tv1.setText("Llamando");
        Toast notificacion=Toast.makeText(this,"Si no contesta en 15 segundos, cuelgue.",Toast.LENGTH_LONG);
        notificacion.show();
    }

}
