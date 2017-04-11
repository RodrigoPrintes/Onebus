package onibus.ifpa.com.br.onebus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ActivityOnibus extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityonibus);
        listView = (ListView)findViewById(R.id.lsvOnibus);
        String[] onibus = {"Maracanã", "Floresta Prainha", "Alvorada","Mararú","Maicá","Mapiri"
        ,"Liberdade"};
        list = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,onibus);
        listView.setAdapter(list);

        }
}
