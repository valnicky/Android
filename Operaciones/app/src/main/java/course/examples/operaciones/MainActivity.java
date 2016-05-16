package course.examples.operaciones;
//programa que permita la carga de dos números en controles de tipo EditText. Mostrar mensajes que soliciten la carga de los
// valores. Disponer un Button para sumar los dos valores ingresados. Mostrar el resultado en un tercer TextView.
//He añadido un conjunto de RadioButton y verificar cual está seleccionado.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv3;
    private RadioButton r1,r2,r3, r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
    }

    public void boton(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        if (r1.isChecked()==true) {
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            tv3.setText(resu);
        } else
        if (r2.isChecked()==true) {
            int resta=nro1-nro2;
            String resu=String.valueOf(resta);
            tv3.setText(resu);
        }
        if (r3.isChecked()==true) {
            int multiplicar=nro1*nro2;
            String resu=String.valueOf(multiplicar);
            tv3.setText(resu);
        } else
        if (r4.isChecked()==true) {
            int dividir =nro1/nro2;
            String resu=String.valueOf(dividir);
            tv3.setText(resu);
        }
    }
}
