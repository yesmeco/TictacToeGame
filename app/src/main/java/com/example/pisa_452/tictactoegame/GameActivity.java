package com.example.pisa_452.tictactoegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    Button posA, posB, posC, posD, posE, posF, posG, posH, posI;
    int playerturn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twoplayers);

        posA = (Button) findViewById(R.id.posA);
        posB = (Button) findViewById(R.id.posB);
        posC = (Button) findViewById(R.id.posC);
        posD = (Button) findViewById(R.id.posD);
        posE = (Button) findViewById(R.id.posE);
        posF = (Button) findViewById(R.id.posF);
        posG = (Button) findViewById(R.id.posG);
        posH = (Button) findViewById(R.id.posH);
        posI = (Button) findViewById(R.id.posI);

        posA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posA.getText().toString().equals("")) {
                    if (playerturn == 1) {
                        playerturn = 2;
                        posA.setText("X");
                        endGame();
                    } else if (playerturn == 2) {
                        playerturn = 1;
                        posA.setText("O");
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
                        playerturn = 1;
                        posB.setText("O");
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
                        playerturn = 1;
                        posC.setText("O");
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
                        playerturn = 1;
                        posD.setText("O");
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
                        playerturn = 1;
                        posE.setText("O");
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
                        playerturn = 1;
                        posF.setText("O");
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
                        playerturn = 1;
                        posG.setText("O");
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
                        playerturn = 1;
                        posH.setText("O");
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
                        playerturn = 1;
                        posI.setText("O");
                        endGame();
                    }
                }

            }
        });
    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;
        boolean isThereaWinner = true;

        a = posA.getText().toString();
        b = posB.getText().toString();
        c = posC.getText().toString();
        d = posD.getText().toString();
        e = posE.getText().toString();
        f = posF.getText().toString();
        g = posG.getText().toString();
        h = posH.getText().toString();
        i = posI.getText().toString();

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
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }


            if (d.equals("X") && e.equals("X") && f.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (g.equals("X") && h.equals("X") && i.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("X") && d.equals("X") && g.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (b.equals("X") && e.equals("X") && h.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("X") && f.equals("X") && i.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("X") && e.equals("X") && i.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("X") && e.equals("X") && g.equals("X")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS XMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && b.equals("O") && c.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (d.equals("O") && e.equals("O") && f.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (g.equals("O") && h.equals("O") && i.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && d.equals("O") && g.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (b.equals("O") && e.equals("O") && h.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("O") && f.equals("O") && i.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (a.equals("O") && e.equals("O") && i.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
                end = true;
            } else {
                isThereaWinner = false;
            }

            if (c.equals("O") && e.equals("O") && g.equals("O")) {
                Toast.makeText(GameActivity.this, "GIVE TO THIS OMan A BEER", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(GameActivity.this, "Lanzen una moneda y decidan :V", Toast.LENGTH_SHORT).show();
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
            Button btReset = (Button) findViewById(R.id.btReset);
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
    }