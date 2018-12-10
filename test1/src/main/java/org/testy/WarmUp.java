package org.testy;

public class WarmUp {


    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }
}
