package com.example.epl_table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    WordModal wordModal =new WordModal();
    MainAdapter adapter;
    List<WordModal> words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.listView);
        wordsArray();
        adapter =new MainAdapter(getApplicationContext(),words);
        listView.setAdapter(adapter);
    }

    private void wordsArray() {
        words =new ArrayList<>();
        words.add(new WordModal(R.drawable.arsenal,"Arsenal",25,19,3,3,52,23,29,60));
        words.add(new WordModal(R.drawable.cityz,"Man.City",24,19,4,4,52,23,38,55));
        words.add(new WordModal(R.drawable.manunt,"Man.Unt",24,19,4,5,52,28,13,49));

    }
}