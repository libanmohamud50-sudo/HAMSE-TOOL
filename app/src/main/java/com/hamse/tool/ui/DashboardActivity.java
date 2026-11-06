package com.hamse.tool.ui;
import android.app.Activity; import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager; import androidx.recyclerview.widget.RecyclerView;
import com.hamse.tool.R; import com.hamse.tool.modules.ModuleRegistry; import java.util.List;
public class DashboardActivity extends Activity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s); setContentView(R.layout.activity_dashboard);
        RecyclerView rv = findViewById(R.id.rvModules);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
