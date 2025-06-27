package model;
//* This is the Section abstract class that separates the different news sections and creates lists with the latest news depending on the section */

import java.util.ArrayList;
import java.util.List;

//implementing the open/closed principle by means of an abstract class.
public abstract class Section {

    // Attributes
    private String name;
    private List<News> newsList;

    // Constructor
    public Section(String name, List<News> newsList) {// wrongly defined changed List<News>, newsList to List<News>
                                                      // newsList
        this.name = name;
        this.newsList = newsList;
    }

    // Methods

    protected void addNews(News news) {
        if (news != null) {
            this.newsList.add(news);
        }
    }

    protected void removeNews(News news) {
        this.newsList.remove(news);
    }

    public void displayLatestNews (){
        System.out.println ("--- Sección: " + this.name + " ---");
        List<News> LatestNews = this.getLatestNews(9);
        if (LatestNews.isEmpty()){
            System.out.println("There is no recent news in this section."); 
        }else {
            //for missing logic 
        }
    }
    // logic outside method commented
    /*
     * System.out.println ("--- Sección: " + this.name + " ---");
     * List<News> LatestNews = this.getLatestNews(9);
     * if (LatestNews.iempty){
     * System.out.println("There is no recent news in this section.");
     * }
     * else {
     * for
     * }
     */

    // abstract methods

    public abstract List<News> getFeaturedNews (int limit){

    }

    public List<News> getLatestNews(int limit) {

    }

    // Getters

    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException(" The name of the section cannot be empty ");
        }
        this.name = name;
    }

}
