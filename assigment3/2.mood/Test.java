package Mood;

public class Test {
    public static void main(String[] args) {
    MoodyObject a = new HappyObject();
    MoodyObject b = new SadObject();
    PsychiatristObject ps = new PsychiatristObject();
    ps.examine(a);
    ps.observe(a);
    ps.examine(b);
    ps.observe(b);
    }
}
