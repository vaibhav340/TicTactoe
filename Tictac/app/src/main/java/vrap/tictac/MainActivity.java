package vrap.tictac;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buClick(View view) {
        Button buSelected=(Button)view;
        int CellID=0;
        switch ((buSelected.getId())){
            case R.id.bt1:
                CellID=1;
                break;
            case R.id.bt2:
                CellID=2;
                break;
            case R.id.bt3:
                CellID=3;
                break;
            case R.id.bt4:
                CellID=4;
                break;
            case R.id.bt5:
                CellID=5;
                break;
            case R.id.bt6:
                CellID=6;
                break;
            case R.id.bt7:
                CellID=7;
                break;
            case R.id.bt8:
                CellID=8;
                break;
            case R.id.bt9:
                CellID=9;
                break;
        }
        PlayGame(CellID,buSelected);
    }
    int ActivePlayer=1;
    ArrayList<Integer> Player1=new ArrayList<Integer>();
    ArrayList<Integer> Player2=new ArrayList<Integer>();

    void PlayGame(int CellID,Button buSelected){
        if (ActivePlayer==1){
            buSelected.setText("X");
            buSelected.setBackgroundColor(Color.GREEN);
            Player1.add(CellID);
            ActivePlayer=2;
            Autoplay();
        }
        else if (ActivePlayer==2){
            buSelected.setText("O");
            buSelected.setBackgroundColor(Color.BLUE);
            Player2.add(CellID);
            ActivePlayer=1;
        }
        buSelected.setEnabled(false);
        CheckWinner();
    }
    void CheckWinner(){
        int Winner=-1;
        if(Player1.contains(1)&& Player1.contains(2)&& Player1.contains(3)){
            Winner=1;
        }
        if(Player2.contains(1)&& Player2.contains(2)&& Player2.contains(3)){
            Winner=2;
        }
        if(Player1.contains(4)&& Player1.contains(5)&& Player1.contains(6)){
            Winner=1;
        }
        if(Player2.contains(4)&& Player2.contains(5)&& Player2.contains(6)){
            Winner=2;
        }
        if(Player1.contains(7)&& Player1.contains(8)&& Player1.contains(9)){
            Winner=1;
        }
        if(Player2.contains(7)&& Player2.contains(8)&& Player2.contains(9)){
            Winner=2;
        }
        if(Player1.contains(1)&& Player1.contains(4)&& Player1.contains(7)){
            Winner=1;
        }
        if(Player2.contains(1)&& Player2.contains(4)&& Player2.contains(7)){
            Winner=2;
        }
        if(Player1.contains(2)&& Player1.contains(5)&& Player1.contains(8)){
            Winner=1;
        }
        if(Player2.contains(2)&& Player2.contains(5)&& Player2.contains(8)){
            Winner=2;
        }
        if(Player1.contains(3)&& Player1.contains(6)&& Player1.contains(9)){
            Winner=1;
        }
        if(Player2.contains(3)&& Player2.contains(6)&& Player2.contains(9)){
            Winner=2;
        }
        if(Player1.contains(1)&& Player1.contains(5)&& Player1.contains(9)){
            Winner=1;
        }
        if(Player2.contains(1)&& Player2.contains(5)&& Player2.contains(9)){
            Winner=2;
        }
        if(Player1.contains(3)&& Player1.contains(5)&& Player1.contains(7)){
            Winner=1;
        }
        if(Player2.contains(3)&& Player2.contains(5)&& Player2.contains(7)){
            Winner=2;
        }
        if(Winner !=-1){
            if (Winner==1){
                Toast.makeText(this,"Player1 is Winner",Toast.LENGTH_LONG).show();


            }
            if (Winner==2){
                Toast.makeText(this,"Player2 is Winner",Toast.LENGTH_LONG).show();

            }
        }

    }
    void Autoplay()
    {
        ArrayList<Integer>EmptyCells=new ArrayList<Integer>();
        for (int cellID=1;cellID<10;cellID++){
            if (!(Player1.contains(cellID)||Player2.contains(cellID))){
                EmptyCells.add(cellID);
            }
        }
        Random r=new Random();
        int RandIndex=r.nextInt(EmptyCells.size()-0)+0;
        int CellID=EmptyCells.get(RandIndex);
        Button buSelected;
        switch (CellID){
            case 1:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 2:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 3:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 4:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 5:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 6:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 7:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 8:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            case 9:
                buSelected=(Button)findViewById(R.id.bt1);
                break;
            default:
                buSelected=(Button)findViewById(R.id.bt1);
                break;

        }
        PlayGame(CellID,buSelected);
    }
}
