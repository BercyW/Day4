package security.bercy.com.day4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class EmlCaculator extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private TextView tv_money,tv_rate,tv_years,tv_show;
    private SeekBar money_bar,rate_bar,years_bar;
    int currentPro1 = 0;
    int currentPro2 = 0;
    int currentPro3 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eml_caculator);

        tv_money = findViewById(R.id.money);
        tv_rate = findViewById(R.id.rate);
        tv_years = findViewById(R.id.years);
        tv_show = findViewById(R.id.show);

        money_bar = findViewById(R.id.money_bar);
        rate_bar = findViewById(R.id.rate_bar);
        years_bar = findViewById(R.id.years_bar);

        money_bar.setOnSeekBarChangeListener(this);
        rate_bar.setOnSeekBarChangeListener(this);
        years_bar.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        switch (seekBar.getId()) {
            case R.id.money_bar:
                tv_money.setText("Money is $"+i);
                currentPro1 = i;

                double result = currentPro2*0.01 *currentPro1*currentPro3;
                DecimalFormat df = new DecimalFormat("%.1f");
                df.format(result);
                tv_show.setText("Total: "+result);
                break;
            case R.id.rate_bar:
                tv_rate.setText("The rate is "+i+"%");
                currentPro2 = i;
                DecimalFormat df1 = new DecimalFormat("%.1f");
                double result1 = currentPro2*0.01 *currentPro1*currentPro3;
                df1.format(result1);
                tv_show.setText("Total: "+result1);
                break;
            case R.id.years_bar:

                tv_years.setText(i+" Years");
                currentPro3 = i;
                DecimalFormat df2 = new DecimalFormat("%.1f");
                double result2 = currentPro2*0.01 *currentPro1*currentPro3;
                df2.format(result2);
                tv_show.setText("Total: "+result2);
                break;

        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {



    }
}
