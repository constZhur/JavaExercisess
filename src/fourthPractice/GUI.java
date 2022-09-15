package fourthPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JButton buttonMilan = new JButton("AC Milan");
    private JButton buttonMadrid = new JButton("Real Madrid");
    private JLabel currentScore = new JLabel ("Result: 0 X 0");
    private JLabel lastScore = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    int scoreReal, scoreMilan;

    GUI() {
        super("App");
        setLayout(new FlowLayout());
        setSize(500, 100);
        setVisible(true);

        add(buttonMilan);

        buttonMilan.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        scoreMilan++;
                        currentScore.setText(
                                "Result: " + scoreMilan + " X " + scoreReal
                        );
                        lastScore.setText("Last Scorer: AC Milan");
                        if (scoreMilan > scoreReal) {
                            winner.setText("Winner: AC Milan");
                        } else if (scoreMilan == scoreReal) {
                            winner.setText("Winner: DRAW");
                        }
                    }

                    @Override
                    public void mousePressed(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseReleased(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }
                }
        );

        buttonMadrid.addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        scoreReal++;
                        currentScore.setText(
                                "Result: " + scoreMilan + " X " + scoreReal
                        );
                        lastScore.setText("Last Scorer: Real Madrid");
                        if (scoreReal > scoreMilan) {
                            winner.setText("Winner: Real Madrid");
                        } else if (scoreMilan == scoreReal) {
                            winner.setText("Winner: DRAW");
                        }
                    }

                    @Override
                    public void mousePressed(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseReleased(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseEntered(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseExited(java.awt.event.MouseEvent e) {
// TODO Auto-generated method stub

                    }
                }
        );

        add(buttonMadrid);
        add(currentScore);
        add(lastScore);
        add(winner);
    }

    public static void main(String[] args) {
        new GUI();
    }


}
