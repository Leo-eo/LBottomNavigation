package lucky.bottomnavigation;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.wc.daily.utils.DisplayUtil;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        ColorStateList list = ContextCompat.getColorStateList(this, R.color.nav_bg);
        navigation.setItemIconTintList(list);
        navigation.setItemTextColor(list);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                mTextMessage.setText(item.getTitle().toString().toUpperCase());
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        return true;
                    case R.id.navigation_dashboard:

                        return true;
                    case R.id.navigation_notifications:

                        return true;
                }
                return false;
            }
        });
        Log.i("MainActivity", DisplayUtil.dip2px(this, 5) + "");
    }

}
