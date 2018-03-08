
package ta;

/**
 * @author st20063247
 */
public class RootObject {
    //static {
  private String id;

  public String getId() { return this.id; }

  public void setId(String id) { this.id = id; }

  private String processed_lang;

  public String getProcessedLang() { return this.processed_lang; }

  public void setProcessedLang(String processed_lang) { this.processed_lang = processed_lang; }

  private String source;

  public String getSource() { return this.source; }

  public void setSource(String source) { this.source = source; }

  private Tree tree;

  public Tree getTree() { return this.tree; }

  public void setTree(Tree tree) { this.tree = tree; }

  private int word_count;

  public int getWordCount() { return this.word_count; }

  public void setWordCount(int word_count) { this.word_count = word_count; }

  private String word_count_message;

  public String getWordCountMessage() { return this.word_count_message; }

  public void setWordCountMessage(String word_count_message) { this.word_count_message = word_count_message; }

}
