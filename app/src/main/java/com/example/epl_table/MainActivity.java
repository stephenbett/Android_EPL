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
        words.add(new WordModal(R.drawable.arsenal,"Arsenal",28,22,3,3,66,26,40,69));
        words.add(new WordModal(R.drawable.cityz,"Man.City",27,19,4,4,67,25,42,61));
        words.add(new WordModal(R.drawable.manunt,"Man.Unt",26,15,5,6,52,28,13,50));
        words.add(new WordModal(R.drawable.tote,"Totenham",28,15,4,9,52,40,12,49));
        words.add(new WordModal(R.drawable.newc ,"Newcastle",26,12,11,3,39,19,20,47));
    }
}