package course.examples.operaccheckbx;
//Realizar la carga de dos números en controles de tipo EditText ("Number"). Mostrar un mensaje que solicite la carga de los
// valores. Disponer dos controles de tipo CheckBox para seleccionar si queremos sumar y/o restar dichos valores. Finalmente
// mediante un control de tipo Button efectuamos la operación respectiva. Mostramos el o los resultados en un TextView
// ("Medium Text").
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1,tv2, tv3;
    private CheckBox checkBox1,checkBox2, checkBox3, checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        tv1=(TextView)findViewById(R.id.textView);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        checkBox1=(CheckBox)findViewById(R.id.checkBox);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
        checkBox3=(CheckBox)findViewById(R.id.checkBox3);
        checkBox4=(CheckBox)findViewById(R.id.checkBox4);
    }

    //Este método se ejecutará cuando se presione el botón
    public void operar(View view) {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String resu="";
        if (checkBox1.isChecked()==true) {
            int suma=nro1+nro2;
            resu="La suma es: "+ suma;
        }
        if (checkBox2.isChecked()==true) {
            int resta=nro1-nro2;
            resu=resu + "\nLa resta es: "+ resta;
        }
        if (checkBox3.isChecked()==true) {
            int multiplicar=nro1*nro2;
            resu= resu + "\nLa multiplicacion es: "+ multiplicar;
        }
        if (checkBox4.isChecked()==true) {
            int dividir =nro1/nro2;
            resu=resu + "\nEl dividendo es: "+ dividir;
        }
        tv3.setText(resu);
    }
}
