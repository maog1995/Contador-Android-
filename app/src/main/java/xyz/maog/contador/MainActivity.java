package xyz.maog.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }

    public void sumaContador(View vista) {
        contador++;

        mostrarResultado();
    }

    public void restaContador(View vista) {
        contador--;

        mostrarResultado();
    }

    public void reseteaContador(View vista) {
        contador = 0;

        mostrarResultado();
    }

    public void mostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.TVcontador);

        textoResultado.setText("Contador: " + contador);
    }

}
