package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame{

    private HeaderContainer header;
    private CenterPanel content;

    public MainFrame (){
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        initView();
    }

    private void initView(){
        this.header = new HeaderContainer();
        this.content = new CenterPanel();
        this.add(header, BorderLayout.NORTH);
        this.add(content, BorderLayout.CENTER);
        this.setVisible(true);
    }



}
