package kg.MMusic;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalNusic () {
        return  new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("DoMyInit void");
    }

    public void doMyDestroy() {
        System.out.println("DoMyDestroy void");
    }

    @Override
    public String getSong() {
        return "liking park";
    }
}
