import java.io.*;
import java.net.*;

class RSSReader {

    public static void main(String[] args) {
        System.out.println(readRSS("http://rss.cnn.com/rss/edition.rss"));
    }

    public static String readRSS(String urlAddress) {
        try {
            URL rssURL = new URL(urlAddress);
            BufferedReader in = new BufferedReader(new InputStreamReader(rssURL.openStream()));
            String sourceCode = "";
            String line;
            while ((line = in.readLine()) != null) {
                while (line.contains("<title>")) {
                    int lastChar = line.length();
                    int firstPos = line.indexOf("<title>");
                    String temp = line.substring(firstPos);
                    temp = temp.replace("<title>", "");
                    int lastPos = temp.indexOf("</title>");
                    temp = temp.substring(0, lastPos);
                    if (temp.startsWith("<![CDATA[")) {
                        temp = temp.substring(9);
                        int lengthTemp = temp.length();
                        temp = temp.substring(0, lengthTemp-3);
                    }
                    sourceCode += temp + "\n";
                    line = line.substring((firstPos + lastPos + temp.length()));
                }

            }

            in.close();
            return sourceCode;
        } catch (MalformedURLException ue) {
            System.out.println("Malformed URL");
        } catch (IOException ioe) {
            System.out.println("Something went wrong reading UL");
        }
        return null;
    }
}

/* returns
CNN.com - RSS Channel - App International Edition
CNN.com - RSS Channel - App International Edition
Trump: Summit will be 'special moment for World Peace'
History in the making as Trump welcomes prisoners home
Israel and Iran trade fire in most direct confrontation yet
Iran's economy dealt massive blow by Trump
CNN Poll: 77% of Americans approve Trump's plans to meet with Kim
104-year-old scientist takes own life at Swiss clinic
Unbridled Trump storms the global stage
Malaysia's Mahathir becomes the world's oldest leader
At least 32 killed after dam bursts
Rolls-Royce reveals its first SUV
Explosive eruptions worry Hawaii residents
RBS to pay another $5B to settle probe
Ex-chief of Chinese insurer Anbang jailed for 18 years
How heroic doctor stopped the spread of Ebola in Nigeria
Inside Michael Cohen's aggressive pitch promising access to Trump
Heroic Southwest pilot describes fatal flight
CIA chief nominee vows not to restart interrogation program
Rockefeller 'sale of the century' sets auction record on first night
Ford suspends production of F-150 trucks
One student called police on another who napped in the common room
Video shows bizarre world on the ocean floor
Want to do business in China? Be prepared to bend to their demands
Side effects: Potential treatment for baldness
Cannabis provider recommends products to pregnant women
1 in 5 children are never breastfed here
How does the royal family make its money?
Will this wild card spoil the royal wedding?
Deadly E. coli outbreak tied to romaine spreads
Photo of Trump's lookalike goes viral
Snøhetta's UFO-like home in a Norwegian forest
Europe's epic gorge reopens to visitors
This rare asteroid was 'exiled' from our solar system
Guide to Thailand's top beach
These historic buildings are under threat
Massive chocolate spill closes highway
See 11-year-old Meghan Markle fight sexist ad
Meek Mill's advice to Kanye West: 'Think 10 times before you speak'
Man who defied fashion rules
Is this island the next Iceland?
The royal family's most extraordinary gifts
Mickelson 'calls out' Woods for golf duel
The Syrian refugee swimmer 'representing millions'
History in the making as Trump welcomes prisoners home
Trump says it was 'nice' of Kim to release the three men
See Trump greet the freed Americans
13 hours in North Korea: How US prisoners were released
Israel: Iranian forces fire rockets at Golan Heights
Can Europe keep doing business with Iran?
Trump's nuclear decision is bleak news for Americans held in Iran
US-China trade fight: Company at the center

 */