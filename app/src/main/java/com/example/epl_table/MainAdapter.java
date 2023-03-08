package com.example.epl_table;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MainAdapter extends BaseAdapter {
    ImageView imgArsenal;
    TextView  clubName, played, won, drawn, lost,goalF,goalA,goalD,totalPoints;
    private String name;
    private int img,  gplayed, gwon,gdrawn,glost,goF,goA,goD,points;
    private Context context;
    private List<WordModal> words;

    public MainAdapter(Context applicationContext,List<WordModal>words){
        context =applicationContext;
        this.words =words;
    }

    public int getCount(){return words.size();}

    @Override
    public Object getItem(int i) {return null;}

    @Override
    public long getItemId(int i) {return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.standings,viewGroup, false);
//       position =view.findViewById(R.id.pos);
       imgArsenal =view.findViewById(R.id.Imgarsenal);
       clubName =view.findViewById(R.id.txtArsenal);
       played = view.findViewById(R.id.played);
       won =view.findViewById((R.id.gwon));
       drawn =view.findViewById(R.id.gdraw);
       lost =view.findViewById(R.id.glost);
       goalF =view.findViewById(R.id.goalF);
       goalA =view.findViewById(R.id.goalA);
       goalD =view.findViewById(R.id.goalD);
       totalPoints =view.findViewById(R.id.Total_points);


//       imgArsenal.setImageResource(words.get(Integer.parseInt(String.valueOf(img))).getClubImage());
//       clubName.setText(Integer.parseInt(words.get(Integer.parseInt(name)).getClubName()));
       played.setText(words.get(i).getPlayed());
       won.setText(words.get(i).getWon());
       drawn.setText(words.get(i).getDrawn());
       lost.setText(words.get(i).getLost());
       goalF.setText(words.get(i).getgF());
       goalA.setText(words.get(i).getgA());
       goalD.setText(words.get(i).getgD());
       totalPoints.setText(words.get(i).getPoints());

        return  view;
    }



}
