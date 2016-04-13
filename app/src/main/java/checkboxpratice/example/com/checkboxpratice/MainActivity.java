package checkboxpratice.example.com.checkboxpratice;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private CheckBox[] chkBall = new CheckBox[5];
    private TextView totle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkBall[0] = (CheckBox) findViewById(R.id.chkbasketball);
        chkBall[1] = (CheckBox) findViewById(R.id.chkfootball);
        chkBall[2] = (CheckBox) findViewById(R.id.chkbaseball);
        chkBall[3] = (CheckBox) findViewById(R.id.chkvolleyball);
        chkBall[4] = (CheckBox) findViewById(R.id.chkbadminton);
        totle = (TextView) findViewById(R.id.totlecheck);
        chkBall[0].setOnCheckedChangeListener(chklistener);
        chkBall[1].setOnCheckedChangeListener(chklistener);
        chkBall[2].setOnCheckedChangeListener(chklistener);
        chkBall[3].setOnCheckedChangeListener(chklistener);
        chkBall[4].setOnCheckedChangeListener(chklistener);

    }

    private CheckBox.OnCheckedChangeListener chklistener = new CheckBox.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(CompoundButton buttonView,
                                     boolean isChecked) {
            // TODO Auto-generated method stub

            String[] strBall = new String[5];

            int sum = 0;
            for (int i = 0; i < 5; i++)
                if (chkBall[i].isChecked()) {
                    sum++;
                    strBall[i] = chkBall[i].getText().toString();
                } else {
                    strBall[i] = "";
                }
            totle.setText("最喜歡的球類有：" + strBall[0] + " " + strBall[1] + " " + strBall[2] + " " + strBall[4] + " " + strBall[3] + "，總共 " + sum + " 項運動");
            Toast.makeText(getApplicationContext(), "選了：" + strBall[0] + " " + strBall[1] + " " + strBall[2] + " " + strBall[3] + " " + strBall[4] + "，總共 " + sum + " 項運動", Toast.LENGTH_SHORT).show();
        }
    };
}