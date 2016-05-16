package course.examples.tipoexam;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv3;
    private RadioButton r1,r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        tv3=(TextView)findViewById(R.id.textView3);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
    }

    public void ejecutar(View view){
        String nombre = et1.getText().toString();
        if(nombre.length()==0){
            Toast notific = Toast.makeText(this, "Introduce el nombre, el campo no puede quedar vacio", Toast.LENGTH_LONG);
            notific.show();
        }

        String apellidos = et2.getText().toString();
        if(apellidos.length() == 0){
            Toast notif = Toast.makeText(this,"Campo vacio, Introduce los apellidos.", Toast.LENGTH_LONG);
            notif.show();
        }
        String aux= nombre +" " +apellidos;
        tv3.setText(aux);

        if (r1.isChecked()==true) {
            tv3.setTextColor(Color.RED);
        } else
        if (r2.isChecked()==true) {
            tv3.setTextColor(Color.GREEN);
        }else if((r1.isChecked()==false)&&(r2.isChecked()==false)){
            et1.setText("");
            et2.setText("");
        }
    }
}
