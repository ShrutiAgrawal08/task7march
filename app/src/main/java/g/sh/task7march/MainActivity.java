package g.sh.task7march;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user =et1.getText().toString().trim();
                String pass =et2.getText().toString().trim();
                if(user.equals(s1)&& pass.equals(s2))
                {
                    Toast.makeText(MainActivity.this, "PAss", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "fail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences=getSharedPreferences("g.sh.task7march",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username","shruti.agrawal_mca18@gla.ac.in");
        editor.putString("password","123456");
        editor.putBoolean("bool",true);
        editor.apply();

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences=getSharedPreferences("g.sh.task7march",MODE_PRIVATE);
        String s1=sharedPreferences.getString("shruti.agrawal_mca18@gla.ac.in","username");
        String s2=sharedPreferences.getString("123456","password");
        Boolean remeber=sharedPreferences.getBoolean("bool",false);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        et1.setText(s1);
        et2.setText(s2);
    }
}
