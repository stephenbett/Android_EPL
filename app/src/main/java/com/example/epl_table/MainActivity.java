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
        listView =findViewById(R.id.list_view);
        wordsArray();
        adapter =new MainAdapter(getApplicationContext(),words);
        listView.setAdapter(adapter);
    }

    private void wordsArray() {
        words =new ArrayList<>();
        words.add(new WordModal(R.drawable.arsenal,"Arsenal",31,23,5,3,74,31,43,74));
        words.add(new WordModal(R.drawable.cityz,"Man.City",30,22,4,4,78,28,50,70));
        words.add(new WordModal(R.drawable.manunt,"Man.Unt",30,18,5,7,46,37,9,59));
        words.add(new WordModal(R.drawable.newc ,"Newcastle",30,15,11,4,48,24,24,56));
        words.add(new WordModal(R.drawable.tote,"Tottenham",28,15,4,9,52,40,12,47));
        words.add(new WordModal(R.drawable.aston,"Aston Villa",31,15,5,11,44,40,4,50));
        words.add(new WordModal(R.drawable.brighton,"Brighton",30,15, 11, 6, 41, 35, 6, 50));
        words.add(new WordModal(R.drawable.liverpool, "Liverpool", 30,15, 11, 6, 41, 35, 6, 50));
        words.add(new WordModal(R.drawable.brentford, "Brentford", 30,15, 11, 6, 41, 35,6,50));
        words.add(new WordModal(R.drawable.fullham, "Fulham", 30,15,11,6,41,35,6,50));
        words.add(new WordModal(R.drawable.chelsea, "Chelsea", 30,15, 11,6,41,35,6,50));
//        words.add(new WordModal(R.drawable.cy, "Crystal Palace", 30,15,11,6,41,35,6,50));
//        words.add(new LeagueList(13, R.drawable.wolves, "Wolves", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(14, R.drawable.bonmouth, "Bournmouth", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(15, R.drawable.westham, "West Ham", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(16, R.drawable.leads, "Leads United", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(17, R.drawable.evaton, "Everton", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(18, R.drawable.nottm, "Nottm Forest", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(19, R.drawable.leister, "Leicester City", "30","15", "11", "6", "41", "35", "6", "50"));
//        words.add(new LeagueList(20, R.drawable.southampton, "Southampton", "30","15", "11", "6", "41", "35", "6", "50"));


    }
}