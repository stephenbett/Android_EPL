package com.example.epl_table;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainAdapter extends BaseAdapter {
    ImageView imgArsenal,formwon,formlos,formdown,formwon2,formwon3;
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

//        clubName, played, won, drawn, lost,goalF,goalA,goalD,totalPoints;
//        TextView teamNumber = view.findViewById(R.id.team_id);
        imgArsenal = view.findViewById(R.id.team_image_id);
        clubName = view.findViewById(R.id.team_name_id);
        played = view.findViewById(R.id.mp_id);
        won = view.findViewById(R.id.wins_id);
        drawn = view.findViewById(R.id.draws_id);
        lost = view.findViewById(R.id.loose_id);
        goalF= view.findViewById(R.id.goalForward_id);
        goalA= view.findViewById(R.id.goalAgainst_id);
        goalD= view.findViewById(R.id.goalDifference_id);
        totalPoints= view.findViewById(R.id.points_id);


        imgArsenal.setImageResource(words.get(i).getClubImage());
        clubName.setText(words.get(i).getClubName());
        played.setText(Integer.toString(words.get(i).getPlayed()));
        won.setText(Integer.toString(words.get(i).getWon()));
        drawn.setText(Integer.toString(words.get(i).getDrawn()));
        lost.setText(Integer.toString(words.get(i).getLost()));
        goalF.setText(Integer.toString(words.get(i).getgF()));
        goalA.setText(Integer.toString(words.get(i).getgA()));
        goalD.setText(Integer.toString(words.get(i).getgD()));
        totalPoints.setText(Integer.toString(words.get(i).getPoints()));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Position" + i, Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }

}
//       position =view.findViewById(R.id.pos);
//       imgArsenal =view.findViewById(R.id.Imgarsenal);
//       formwon =view.findViewById(R.id.fomwin);
//       formlos =view.findViewById(R.id.fomlos);
//       formwon2 =view.findViewById(R.id.fomwin2);
//       formdown =view.findViewById(R.id.fomdown);
//       formwon3 =view.findViewById(R.id.fomwin3);
//
//
//       clubName =view.findViewById(R.id.txtArsenal);
//       played = view.findViewById(R.id.played);
//       won =view.findViewById((R.id.gwon));
//       drawn =view.findViewById(R.id.gdraw);
//       lost =view.findViewById(R.id.glost);
//       goalF =view.findViewById(R.id.goalF);
//       goalA =view.findViewById(R.id.goalA);
//       goalD =view.findViewById(R.id.goalD);
//       totalPoints =view.findViewById(R.id.Total_points);
//

//

//       formwon.setImageResource(words.get(i).get);



