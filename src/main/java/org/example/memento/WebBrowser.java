package org.example.memento;

// Originator
public class WebBrowser {
    private String currentPage;
    private String name;
    private String version;

    public void goToPage(String url){
        this.currentPage = url;
        System.out.println("Navigate to : " + currentPage);
    }

    public String getCurrentPage(){
        return this.currentPage;
    }

    public Memento save(){
        return new Memento(this.currentPage);
    }

    public void restore(Memento memento) {
        this.currentPage = memento.getSavedPage();
    }
}
