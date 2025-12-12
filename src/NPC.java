public class NPC {
    private String name;
    private String phrase;

    public NPC(String name, String phrase){
        this.name = name;
        this.phrase = phrase;
    }

    public String getName(){
        return name;
    }

    public String getPhrase(){
        return phrase;
    }

    public void NPCspeak(String name, String phrase){
        System.out.println(name + ": " + phrase);
    }
}
