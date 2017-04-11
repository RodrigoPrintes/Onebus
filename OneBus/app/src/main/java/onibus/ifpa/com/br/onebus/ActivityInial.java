package onibus.ifpa.com.br.onebus;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityInial extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    private TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityinial);
        declarar();
    }
    private void declarar(){
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
        txtName = (TextView)findViewById(R.id.txtName);
        txtName.setText("OneBus");
      //  ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
      //  viewPager.setAdapter(new CustomPagerAdapter(this));
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(this,Inicio.class);
        startActivity(it);

    }


}
