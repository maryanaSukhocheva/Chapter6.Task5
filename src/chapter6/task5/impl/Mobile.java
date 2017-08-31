package chapter6.task5.impl;

/**
 *
 * @author Sukhocheva Maryana
 */
public interface Mobile {
    void startCall (String number);
    String searchForCall ();
    void acceptCall (String number);
    void breakCall ();
}
