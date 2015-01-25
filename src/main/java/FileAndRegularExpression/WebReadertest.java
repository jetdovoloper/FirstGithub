/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAndRegularExpression;

import java.io.IOException;
import java.util.Set;

/**
 *
 * @author jetDo
 */
public class WebReadertest {
    /*jsoup*/
    public static void main(String[] args) throws IOException {
        WebReader reader = new WebReader("https://www.facebook.com");
        System.out.println("HTML = " + reader.getHTML());
        System.out.println("LINK = " + reader.getLinks());
        Set<String> links = reader.getLinks();
        for (String link : links) {
            System.out.println("Link = " + link);
        }
    }
    
}
