package se.lexicon.util;

public class IDGenerator {

    private static int count=1;

    public static int generateId(){
        return count++;
    }
}
