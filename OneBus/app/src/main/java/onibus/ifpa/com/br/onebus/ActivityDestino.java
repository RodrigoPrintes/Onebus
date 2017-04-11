package onibus.ifpa.com.br.onebus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityDestino extends AppCompatActivity {
    private ListView lsvDestino;
    private ArrayAdapter<String>bairros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitydestino);
        lsvDestino = (ListView)findViewById(R.id.lsvDestino);
        String[]bairro = {"Caranazal","Mapiri","Livramento","Nova Republica","Centro","Diamantino",
        "Alvorada","Floresta","Maicá","Mararu","Santarenzinho"};
        bairros = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bairro);
        lsvDestino.setAdapter(bairros);
    }
}
