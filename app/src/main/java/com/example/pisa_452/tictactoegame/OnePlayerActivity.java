package com.example.pisa_452.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static android.media.CamcorderProfile.get;

public class OnePlayerActivity extends AppCompatActivity {

    Button posA, posB, posC, posD, posE, posF, posG, posH, posI;
    String a, b, c, d, e, f, g, h, i;
    int playerturn = 1;
    boolean end = false;
    Random random = new Random();
    int randomitem = random.nextInt(4) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_player);

        posA = findViewById(R.id.posA);
        posB = findViewById(R.id.posB);
        posC = findViewById(R.id.posC);
        posD = findViewById(R.id.posD);
        posE = findViewById(R.id.posE);
        posF = findViewById(R.id.posF);
        posG = findViewById(R.id.posG);
        posH = findViewById(R.id.posH);
        posI = findViewById(R.id.posI);

        a = posA.getText().toString();
        b = posB.getText().toString();
        c = posC.getText().toString();
        d = posD.getText().toString();
        e = posE.getText().toString();
        f = posF.getText().toString();
        g = posG.getText().toString();
        h = posH.getText().toString();
        i = posI.getText().toString();

        //String [][] matrix = {{a, b, c}, {d, e, f}, {g, h, i}};

        posA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posA.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posA.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }
            }
        });
        posB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posB.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posB.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }

            }
        });
        posC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posC.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posC.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }
            }
        });
        posD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posD.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posD.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }
            }
        });
        posE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posE.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posE.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }
            }
        });
        posF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posF.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posF.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }

            }
        });
        posG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posG.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posG.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }

            }
        });
        posH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posH.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posH.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }

            }
        });
        posI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posI.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posI.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        computerMove();
                        playerturn = 1;
                        endGame();
                    }
                }

            }
        });

    }

    public void endGame() {
        boolean end = false;
        boolean isThereaWinner = true;

        ArrayList<Boolean> buttonStatus = new ArrayList<>();
        buttonStatus.add(a.isEmpty());
        buttonStatus.add(b.isEmpty());
        buttonStatus.add(c.isEmpty());
        buttonStatus.add(d.isEmpty());
        buttonStatus.add(e.isEmpty());
        buttonStatus.add(f.isEmpty());
        buttonStatus.add(g.isEmpty());
        buttonStatus.add(h.isEmpty());
        buttonStatus.add(i.isEmpty());

        if (isThereaWinner == true) {
            if ((a.equals("X") && b.equals("X") && c.equals("X"))) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }


            if (d.equals("X") && e.equals("X") && f.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (g.equals("X") && h.equals("X") && i.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("X") && d.equals("X") && g.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (b.equals("X") && e.equals("X") && h.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("X") && f.equals("X") && i.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("X") && e.equals("X") && i.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("X") && e.equals("X") && g.equals("X")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && b.equals("O") && c.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (d.equals("O") && e.equals("O") && f.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (g.equals("O") && h.equals("O") && i.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && d.equals("O") && g.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (b.equals("O") && e.equals("O") && h.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("O") && f.equals("O") && i.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && e.equals("O") && i.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("O") && e.equals("O") && g.equals("O")) {
                Toast.makeText(OnePlayerActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }
            if (((buttonStatus.get(0).equals(false))
                    && (buttonStatus.get(1).equals(false))
                    && (buttonStatus.get(2).equals(false))
                    && (buttonStatus.get(3).equals(false))
                    && (buttonStatus.get(4).equals(false))
                    && (buttonStatus.get(5).equals(false))
                    && (buttonStatus.get(6).equals(false))
                    && (buttonStatus.get(7).equals(false))
                    && (buttonStatus.get(8).equals(false)))&& isThereaWinner==false) {
                Toast.makeText(OnePlayerActivity.this, "Lanzen una moneda y decidan :V", Toast.LENGTH_SHORT).show();
                end = true;
            }
        }
        //-------------------------------------------Desabilitar botones despues de finalizar partida-------
        if (end == true)

        {
            posA.setEnabled(false);
            posB.setEnabled(false);
            posC.setEnabled(false);
            posD.setEnabled(false);
            posE.setEnabled(false);
            posF.setEnabled(false);
            posG.setEnabled(false);
            posH.setEnabled(false);
            posI.setEnabled(false);
        }

        //-------------------------------------------------Boton de Reiniciar Partida ----------------------
        Button btReset = (Button) findViewById(R.id.btReset2);
        btReset.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                posA.setText("");
                posB.setText("");
                posC.setText("");
                posD.setText("");
                posE.setText("");
                posF.setText("");
                posG.setText("");
                posH.setText("");
                posI.setText("");
                boolean end = false;

                posA.setEnabled(true);
                posB.setEnabled(true);
                posC.setEnabled(true);
                posD.setEnabled(true);
                posE.setEnabled(true);
                posF.setEnabled(true);
                posG.setEnabled(true);
                posH.setEnabled(true);
                posI.setEnabled(true);

            }
        });
    }

    public void computerMove(){
        Random random = new Random();
        int randomitem = random.nextInt(9) + 1;

        if(posA.toString().isEmpty()){
            if (randomitem ==1) {
                posA.setText("O");
            }
        }else if(posC.toString().isEmpty()){
            if(randomitem==2){
                posC.setText("O");
            }
        } else if (posG.toString().isEmpty()){
            if (randomitem==3){
                posG.setText("O");
            }
        } else if (posI.toString().isEmpty()) {
            if (randomitem==4){
                posI.setText("O");
            }
        } else if (posE.toString().isEmpty()) {
            if (randomitem == 5) {
                posE.setText("O");
            }
        }else if(posD.toString().isEmpty()) {
            if(randomitem==6) {
                posD.setText("O");
            }
        }else if(posH.toString().isEmpty()) {
            if (randomitem==7) {
                posH.setText("O");
            }
        }else if(posB.toString().isEmpty()) {
            if(randomitem==8) {
                posB.setText("O");
            }
        }else if (posF.toString().isEmpty()){
            if (randomitem==9){
                    posF.setText("O");
            }
        }
    }
}