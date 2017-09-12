package com.example.agterra.sel3;

import android.content.Context;
import android.provider.Settings;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by Agterra on 12/09/2017.
 */

public class LessonsArrayAdapter extends ArrayAdapter {

    private Context applicationContext;

    private ArrayList<String> objects;

    private ArrayList<String> lessonsName;

    public LessonsArrayAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<String> objects1, ArrayList<String> lessonsName) {

        super(context, resource, objects1);

        this.objects = objects1;

        this.applicationContext = context;

        this.lessonsName = lessonsName;

        System.out.println(lessonsName);

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        LayoutInflater layoutInflater = (LayoutInflater)this.applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = layoutInflater.inflate(R.layout.cell_lessons, null);

        TextView lessonNameTextView = view.findViewById(R.id.lessonNameTextView);

        lessonNameTextView.setText(this.lessonsName.get(position));

        return view;

    }
}
