package com.home.designpattern;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_patterns);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FunctionsAdapter adapter = new FunctionsAdapter();
        recyclerView.setAdapter(adapter);

    }

    private class FunctionsAdapter extends RecyclerView.Adapter<FunctionsAdapter.FunctionsHolder> {
        @NonNull
        @Override
        public FunctionsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = getLayoutInflater().inflate(android.R.layout.simple_list_item_1, viewGroup, false);
            return new FunctionsHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull FunctionsHolder functionsHolder, int i) {
//            functionsHolder.tvItem.setText();
        }

        @Override
        public int getItemCount() {
            return 25;
        }

        private class FunctionsHolder extends RecyclerView.ViewHolder {
            TextView tvItem;
            public FunctionsHolder(@NonNull View itemView) {
                super(itemView);
                tvItem = itemView.findViewById(android.R.id.text1);
            }
        }
    }

}
