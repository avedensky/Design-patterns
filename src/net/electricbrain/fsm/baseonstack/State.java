package net.electricbrain.fsm.baseonstack;

/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 27.05.17
 */


/**
 * Universal State
 * @param <T> T type is heritor from Entity
 */
public interface State <T> {
    void enter (T t);
    void execute (T t);
    void exit (T t);
}
