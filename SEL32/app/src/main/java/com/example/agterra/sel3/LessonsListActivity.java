package com.example.agterra.sel3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LessonsListActivity extends AppCompatActivity {

    private ArrayList<String> lessonsURL;

    private ArrayList<String> lessonsName;

    private ArrayAdapter arrayAdapter;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lessons_list);

        ListView listView = (ListView)findViewById(R.id.lessonsListView);

        this.listView = listView;

        final ArrayList<String> lessonsURL = new ArrayList<String>();

        lessonsURL.add(getResources().getString(R.string.url_reseau));

        lessonsURL.add(getResources().getString(R.string.url_algo_prog_complex));

        lessonsURL.add(getResources().getString(R.string.url_bdd));

        lessonsURL.add(getResources().getString(R.string.url_logique_classique));

        lessonsURL.add(getResources().getString(R.string.url_theorie_langages));

        this.lessonsURL = lessonsURL;

        ArrayList<String> lessonsName = new ArrayList<String>();

        lessonsName.add("Reseaux");

        lessonsName.add("Algo, prog et complexité");

        lessonsName.add("BDD");

        lessonsName.add("Logique classique");

        lessonsName.add("Théorie des langages");

        this.lessonsName = lessonsName;

        LessonsArrayAdapter lessonsArrayAdapter = new LessonsArrayAdapter(getBaseContext(), R.layout.activity_lessons_list, this.lessonsName, this.lessonsName);

        this.arrayAdapter = lessonsArrayAdapter;

        this.listView.setAdapter(lessonsArrayAdapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String URL = lessonsURL.get(i);

                Intent intent = new Intent(LessonsListActivity.this, WebViewActivity.class);

                intent.putExtra("url", URL);

                startActivity(intent);

            }

        }
        );

    }

}
