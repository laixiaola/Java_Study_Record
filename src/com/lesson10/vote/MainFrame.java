/*
    题目：
         编写一个班级推选优秀生的软件，可列出参与推优的学生名单，
         能够显示当前投票人数以及每名候选者得票数，以图形化显示得票数。
 */
package com.lesson10.vote;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JTextField num=new JTextField(10);
    JTextField max=new JTextField(10);
    JCheckBox[] box=new JCheckBox[5];
    JLabel[] showVote=new JLabel[5];
    int[] vote=new int[5];
    int voteNum=0;
    int maxVote=0;
    String[] people={"威斯特","肯得里克","德雷克","杰兹","马歇尔"};
//    String win;
    public MainFrame(){
        setLocation(300,300);
        setSize(600,500);
        setTitle("班级推优");
        setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pNorth=new JPanel();
        JPanel pEast=new JPanel();
        JPanel pSouth=new JPanel();
        JPanel pWest=new JPanel();
        JPanel pCenter=new JPanel();
        add("East",pEast);
        add("North",pNorth);
        add("West",pWest);
        add("South",pSouth);
        add("Center",pCenter);

        //北部布局
        pNorth.setLayout(new FlowLayout());
        pNorth.add(new JLabel("投票人数"));
        pNorth.add(num);
        num.setEditable(false);
        pNorth.add(new JLabel("最高票"));
        pNorth.add(max);
        max.setEditable(false);

        //西部布局
        pWest.setLayout(new GridLayout(6,2));
        pWest.add(new JLabel("候选人"));
        pWest.add(new JLabel(""));
        for (int i = 0; i < 5; i++) {
            int j=i+1;
            ImageIcon img=new ImageIcon("src/com/lesson10/vote/icon/s"+j+".jpg");
            pWest.add(new JLabel(img));

            box[i]=new JCheckBox(people[i]);
            pWest.add(box[i]);
        }

        //东部布局
        pEast.setLayout(new GridLayout(6,1));
        pEast.add(new JLabel("票数"));
        for (int i = 0; i < 5; i++) {
            showVote[i]=new JLabel("0票");
            pEast.add(showVote[i]);
        }

        //南部布局
        pSouth.setLayout(new FlowLayout());
        JButton voteBtn=new JButton("投票");
        JButton cancelBtn=new JButton("取消");
        voteBtn.addActionListener(this);
        cancelBtn.addActionListener(new ExitListener());
        pSouth.add(voteBtn);pSouth.add(cancelBtn);

        setVisible(true);
    }

    static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        voteNum++;
        Graphics g=getGraphics();
        g.setColor(Color.red);
        for (int i = 0; i < 5; i++) {
            if(box[i].isSelected()) {
                vote[i]++;
                if(vote[i]>maxVote) {
                    maxVote=vote[i];
//                    win=people[i];
                }
            }
            showVote[i].setText(vote[i]+"票");
            num.setText(""+voteNum);
            max.setText(maxVote+"票");
            g.fillRect(200,150+60*i,vote[i]*30,50);
        }
    }
}
