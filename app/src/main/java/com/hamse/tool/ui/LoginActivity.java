package com.hamse.tool.ui;
import android.app.Activity; import android.os.Bundle; import android.widget.*;
import com.hamse.tool.R;
public class LoginActivity extends Activity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s); setContentView(R.layout.activity_login);
        Button b = findViewById(R.id.btnLogin);
        b.setOnClickListener(v -> startActivity(new android.content.Intent(this, DashboardActivity.class)));
    }
}
