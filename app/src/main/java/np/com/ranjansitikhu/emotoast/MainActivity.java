package np.com.ranjansitikhu.emotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Default, Success, Error, Warning, Info, Confusing, Custom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Default =(Button) findViewById(R.id.button);
        Success =(Button) findViewById(R.id.button2);
        Error =(Button) findViewById(R.id.button3);
        Warning =(Button) findViewById(R.id.button4);
        Info =(Button) findViewById(R.id.button5);
        Confusing =(Button) findViewById(R.id.button6);
        Custom =(Button) findViewById(R.id.button7);
        Default.setOnClickListener(this);
        Success.setOnClickListener(this);
        Error.setOnClickListener(this);
        Warning.setOnClickListener(this);
        Info.setOnClickListener(this);
        Confusing.setOnClickListener(this);
        Custom.setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {   if(v.getId()== R.id.button)
        EmoToast.makeText(this,"This is Default Toast",EmoToast.LENGTH_LONG,EmoToast.DEFAULT,true).show();
    else if(v.getId()== R.id.button2)
        EmoToast.makeText(this,"Success Toast !",EmoToast.LENGTH_LONG,EmoToast.SUCCESS,true).show();
    else if(v.getId()== R.id.button3)
        EmoToast.makeText(this,"Error Toast",EmoToast.LENGTH_LONG,EmoToast.ERROR,true).show();
    else if(v.getId()== R.id.button4)
        EmoToast.makeText(this,"Warning Toast",EmoToast.LENGTH_LONG,EmoToast.WARNING,true).show();
    else if(v.getId()== R.id.button5)
        EmoToast.makeText(this,"Infomation Toast",EmoToast.LENGTH_LONG,EmoToast.INFO,true).show();
    else if(v.getId()== R.id.button6)
        EmoToast.makeText(this,"Confusing Toast",EmoToast.LENGTH_LONG,EmoToast.CONFUSING,false).show();
    else if(v.getId()== R.id.button7)
        EmoToast.makeText(this,"Custom Toast",EmoToast.LENGTH_LONG,EmoToast.CONFUSING, R.drawable.androidicon).show();
    }
}