package org.bobmarks.lang.other;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 * Display words with special symbols in them.
 *
 * @author Bob Marks
 */
public class GcseApp {

    private static final String LANG_FILE = "lang.xml";

    private Element root;

    /**
     * Constructor.
     */
    public GcseApp() throws Exception {
        loadFile();
        display(false);
    }

    /**
     * Load file.
     *
     * @throws JDOMException
     * @throws IOException
     */
    private void loadFile() throws JDOMException, IOException {
        File file = new File(LANG_FILE);

        // Parse XML
        SAXBuilder builder = new SAXBuilder();
        Document dom = builder.build(file);

        this.root = dom.getRootElement();
    }

    @SuppressWarnings("unchecked")
    private void display(boolean showHint) {
        List<Element> courseElms = root.getChildren("course");

        List<String> words = new ArrayList<String>();
        for (Element courseElm : courseElms) {

            List<Element> lessonElms = courseElm.getChildren("lesson");

            for (Element lessonElm : lessonElms) {
                String lessonName = lessonElm.getAttributeValue("name");

                if ("AS Speaking Revision".equals(lessonName)) {

                    List<Element> topicElms = lessonElm.getChildren("topic");

                    for (Element topicElm : topicElms) {
                        // String topicName = topicElm.getAttributeValue("name");

                        List<Element> itemElms = topicElm.getChildren("item");

                        for (Element itemElm : itemElms) {
                            String answer = itemElm.getAttributeValue("a");
                            // answer = answer.replace(",", ".");
                            answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
                            String question = itemElm.getAttributeValue("q");

                            // 1) Print out question and answer
                            // System.out.println(question + "");
                            // System.out.println(answer + "");
                            // System.out.println();
                            // words.addAll(Arrays.asList(question.split(" ")));

                            // 2) Print out question / first letter of each answer
                            System.out.println(question);
                            String [] answerWords = answer.split(" ");
                            int i = 0;
                            for (String word : answerWords) {
                                i++;
                                System.out.print(word.charAt(0) + (i % 5 == 0 ? " " : ""));
                            }
                            System.out.println();
                            System.out.println();

                        }
                    }
                }
            }
        }
        int i = 0;
        for (String word : words) {
            System.out.println(++i + "\t" + word);
        }

        // Print word counts
        // System.out.println(words);
        // Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        // for (String word : words) {
        // wordCounts.put(word, wordCounts.containsKey(word) ? wordCounts.get(word) + 1 : 1);
        // }
        //
        // for (String word : wordCounts.keySet()) {
        // System.out.println(wordCounts.get(word) + "\t" + word);
        // }
    }

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String [] args) throws Exception {
        new GcseApp();
    }
}