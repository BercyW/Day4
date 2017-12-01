package security.bercy.com.day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ManPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_page);
    }

    public void Transfer(View view) {

        switch (view.getId()) {

            case R.id.btn_picture:

                Intent intent = new Intent(this,Camara.class);
                startActivity(intent);

                break;
            case R.id.btn_EMI:

                Intent intent1 = new Intent(this,EmlCaculator.class);
                startActivity(intent1);



                break;
            case R.id.btn_Person:
                break;


        }


    }
}
