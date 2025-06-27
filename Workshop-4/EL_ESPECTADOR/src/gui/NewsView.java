package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class NewsView extends JPanel {
    private JPanel headerPanel;
    private JTextArea infoLabel;
    private JLabel newsTitle;

    public NewsView(String title, String sectionInfo) {
        this.setLayout(new BorderLayout());
        createHeader();
        createTitleLabel(title);
        createInfoLabel(sectionInfo);
        this.add(headerPanel, BorderLayout.NORTH);
        createOtherNews();
    }

    public void createHeader() {
        this.headerPanel = new JPanel();
        this.headerPanel.setOpaque(false);
        this.headerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 1));
        this.headerPanel.setPreferredSize(new Dimension(0, 105));
    }

    public void createTitleLabel(String title) {
        this.newsTitle = new JLabel(title);
        this.newsTitle.setHorizontalAlignment(SwingConstants.LEFT);
        this.newsTitle.setHorizontalTextPosition(SwingConstants.LEFT);
        this.newsTitle.setFont(Constants.titleFont);
        this.headerPanel.add(newsTitle);
    }

    public void createInfoLabel(String info) {
        this.infoLabel = new JTextArea(info);
        this.infoLabel.setPreferredSize(new Dimension(1000, 50));
        this.infoLabel.setLineWrap(true);
        this.infoLabel.setAlignmentX(LEFT_ALIGNMENT);
        this.infoLabel.setEditable(false);
        this.infoLabel.setEditable(false);
        this.infoLabel.setForeground(Color.DARK_GRAY);
        this.infoLabel.setOpaque(false);
        this.infoLabel.setForeground(Constants.newsInfoColor);
        this.headerPanel.add(infoLabel);
    }

    private void createOtherNews() {
        int n = Math.min(Constants.newsRecent.length, Constants.newsDescrip.length);
        int cols = 3;
        int rows = (int) Math.ceil(n / (double) cols);
        JPanel auxContainer = new JPanel(new GridLayout(rows, cols, 10, 10));
        auxContainer.setPreferredSize(new Dimension(cols * 180, rows * 220));
        for (int i = 0; i < n; i++) {
            JPanel imgDescPanel = new JPanel();
            imgDescPanel.setLayout(new BorderLayout());
            JLabel auxIMG = createLabelIcon(Constants.newsRecent[i]);
            auxIMG.setHorizontalAlignment(SwingConstants.CENTER);
            JLabel aux = new JLabel(Constants.newsDescrip[i], SwingConstants.CENTER);
            imgDescPanel.add(auxIMG, BorderLayout.CENTER);
            imgDescPanel.add(aux, BorderLayout.SOUTH);
            auxContainer.add(imgDescPanel);
        }
        int totalCells = rows * cols;
        for (int i = n; i < totalCells; i++) {
            auxContainer.add(new JPanel());
        }
        this.add(auxContainer, BorderLayout.CENTER);

    }

    private JLabel createLabelIcon(String path) {
        URL location = this.getClass().getResource(path);
        ImageIcon img = new ImageIcon(location);
        JLabel imgHolder = new JLabel(img);
        return imgHolder;
    }

}
