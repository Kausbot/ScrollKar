package ps1.bits_piliani.scrollkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.RelativeLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytext = (TextView)findViewById(R.id.myText);
        mytext.setMovementMethod(new ScrollingMovementMethod());



    }
}
