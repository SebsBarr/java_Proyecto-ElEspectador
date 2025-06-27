package model;
/* Authors: Nathaly Cisneros
            Sebastian Correa
            
    This is the Homepage of the project where you will find the most relevant news and news sections */

import java.util.ArrayList;
import java.util.List;

public class Homepage{

    //Attributes
    private News mainNews;
    private List<Section> sections;  // Depends on abstraction 'Section'.

    //Constructor

    public Homepage(News mainNews, List<Section> sections){

        this.mainNews = mainNews;
        this.sections = new ArrayList<>(sections);

    }

    //Methods

    public void displayMainNews(){
        if  (mainNews != null){
            System.out.println("Title: " + mainNews.getTitle());//MISSING PARAMETER
            System.out.println("Summary: "+ mainNews.getSummary());
        }
        else{
            System.out.println("There is not main news yet");
        }
    }
    public void displayFeaturedNews(int limit){
        System.out.println("\n--- Featurd News ---");
         for (Section section: sections){
             //List <News> section.getFeaturedNews(limit);
             List <News> test = section.getFeaturedNews(limit);//attempt to fix definition of array
             /**
             * if (!featured.isEmpty()) {
                System.out.println("En la sección '" + section.getName() + "':");
                for (News news : featured) {
                    System.out.println("  Destacada: " + news.getTitle());
                }
            }
             */
         }
    }
    public void displaySections(){
        /**
         * System.out.println("\n--- Secciones de Noticias ---");
        if (sections.isEmpty()) {
            System.out.println("No hay secciones para mostrar.");
        } else {
            for (Section section : sections) {
                section.displayLatestNews(); // Delega la visualización a cada sección
                System.out.println("--------------------"); // Separador entre secciones
            }
        }
    }
         */
    }

    public void addSection(Section section){
        if (section != null && !this.sections.contains(section) ) {
            this.sections.add(section);
            System.out.println("Section " + section.getName() + "' added.");
        }
        
    }
    public void removeSection(Section section){
        this.sections.remove(section);

        if (section != null && this.sections.remove(section) ){
            System.out.println("Section "+ section.getName() + " remove. ");
        }
        else{
            System.out.println("Section no found or null");
        }
    }

    //Getters

    public News getMainNews() {
        return mainNews;
    }
    
}
