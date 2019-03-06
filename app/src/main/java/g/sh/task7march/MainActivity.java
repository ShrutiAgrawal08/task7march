package g.sh.task7march;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText1);
        et2=findViewById(R.id.editText2);
        btn=findViewById(R.id.button);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences=getSharedPreferences("g.sh.task7march",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username","shruti.agrawal_mca18@gla.ac.in");
        editor.putString("password",123456);
        editor.putBoolean("bool",true);
        editor.apply();

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences=getSharedPreferences("g.sh.task7march",MODE_PRIVATE);
        String s1=sharedPreferences.getString("shruti.agrawa")
    }
}
