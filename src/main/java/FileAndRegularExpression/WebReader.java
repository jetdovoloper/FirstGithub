/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FileAndRegularExpression;

import java.io.*;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jetDo
 */
public class WebReader {
    
    private String url;

    public WebReader(String url) {
        this.url = url;
    }
    
    public String getHTML() throws IOException{
        
        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader br = null;
        StringBuilder builder = new StringBuilder();
        
        try {
            URL urlObject = new URL(url);
            inputStream =  urlObject.openStream();
            reader = new InputStreamReader(inputStream);
            br = new BufferedReader(reader);
            String data = br.readLine();
            
            while( (data = br.readLine())!= null ){
//                System.out.println(data);
                builder.append(data);
            }
            
        } finally {
            
            if (br != null) {
                br.close();                               
            }
            
            if (reader != null) {
                reader.close();
            }
            
            if (inputStream == null) {
                inputStream.close();                
            }
        }
        
        
        return builder.toString();
    }
    
    public Set<String> getLinks() throws IOException{
        
        Set<String> set = new HashSet<>();
//        String pattern = "^(https?|//)(://)?[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
//        String pattern = "\\(?\\b(http://|www[.])[-A-Za-z0-9+&amp;@#/%?=~_()|!:,.;]*[-A-Za-z0-9+&amp;@#/%=~_()|]";
        String pattern = "href=\"(.*?)\"";
        Pattern compiled = Pattern.compile(pattern);
        Matcher matcher = compiled.matcher(getHTML());
        
        while (matcher.find()) {
            
            System.out.println("link = " + matcher.group(1) ); 
            set.add(matcher.group(1));
        }
        return set;
    }
    
    
}
