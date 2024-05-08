package org.example;

import org.example.memento.BrowserHistory;
import org.example.memento.WebBrowser;

public class Main {

    public static void main(String[] args) {
        WebBrowser browser = new WebBrowser();
        BrowserHistory history = new BrowserHistory();

        browser.goToPage("https://refactoring.guru/es/design-patterns/memento");
        history.saveState(browser.save());

        browser.goToPage("https://www.openai.com");
        history.saveState(browser.save());

        browser.goToPage("https://www.wikipedia.org");
        history.saveState(browser.save());

        browser.goToPage("https://www.github.com");

        // Deshacer dos veces
        browser.restore(history.undo());
        browser.restore(history.undo());

        System.out.println();
        System.out.println("I'm going to return to the openAI page :)");
        System.out.println("I returned to : " +browser.getCurrentPage());
    }
}