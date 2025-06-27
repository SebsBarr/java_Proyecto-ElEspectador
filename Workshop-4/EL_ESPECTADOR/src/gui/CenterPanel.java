package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class CenterPanel extends JPanel {

    private OptionContainer sectionOptions;
    private StartPanel defaultSartPanel;
    private NewsView recentNews;
    private NewsView internationalNews;
    private CardLayout layout;
    private JPanel innerContainer;

    public CenterPanel() {
        layout = new CardLayout();
        this.setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        this.innerContainer = new JPanel();
        this.innerContainer.setLayout(layout);
        this.defaultSartPanel = new StartPanel();
        this.sectionOptions = new OptionContainer();
        this.recentNews = new NewsView(Constants.news_title[0], Constants.news_info[0]);
        this.internationalNews = new NewsView(Constants.news_title[1], Constants.news_info[1]);
        addPaneToLayout(this.defaultSartPanel, Constants.optionTitles[0]);
        addPaneToLayout(this.recentNews, Constants.optionTitles[1]);
        addPaneToLayout(this.internationalNews, Constants.optionTitles[2]);
        this.add(innerContainer, BorderLayout.CENTER);
        this.add(sectionOptions, BorderLayout.NORTH);

        for (int i = 0; i < sectionOptions.getOptions().size(); i++) {
            final int idx = i;
            sectionOptions.getOptions().get(i).addActionListener(e -> {
                layout.show(innerContainer, Constants.optionTitles[idx]);
                sectionOptions.displayOptionsExcept(idx);
            });
        }
        layout.show(innerContainer, Constants.optionTitles[0]);
        sectionOptions.displayOptionsExcept(0);
    }

    private void addPaneToLayout(JPanel desiredPanel, String name) {
        innerContainer.add(desiredPanel, name);
    }

    public void displayPanel(String panelName) {
        this.layout.show(this.innerContainer, panelName);
    }

    public OptionContainer getSectionOptions() {
        return sectionOptions;
    }

    public void setSectionOptions(OptionContainer sectionOptions) {
        this.sectionOptions = sectionOptions;
    }

    public StartPanel getDefaultSartPanel() {
        return defaultSartPanel;
    }

    public void setDefaultSartPanel(StartPanel defaultSartPanel) {
        this.defaultSartPanel = defaultSartPanel;
    }

    public NewsView getRecentNews() {
        return recentNews;
    }

    public void setRecentNews(NewsView recentNews) {
        this.recentNews = recentNews;
    }

    public NewsView getInternationalNews() {
        return internationalNews;
    }

    public void setInternationalNews(NewsView internationalNews) {
        this.internationalNews = internationalNews;
    }

}
