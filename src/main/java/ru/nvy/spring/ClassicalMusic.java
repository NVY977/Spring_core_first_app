package ru.nvy.spring;

/**
 * @author NVY
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic(){ }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void testInit(){
        System.out.println("Test init - complete");
    }
    public void testDestroy(){
        System.out.println("Test destroy - complete");
    }
    @Override
    public String getSong() {
        return "Rhapsody";
    }
}
