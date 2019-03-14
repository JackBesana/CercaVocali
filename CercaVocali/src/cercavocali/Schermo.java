/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cercavocali;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author besan
 */
public class Schermo {

    /**
     *
     * coda di stringhe usata dai thread per la visualizzazione su schermo
     *
     */

    private Queue<String> buffer;

    public Schermo() {

        this.buffer = new ArrayDeque();

    }

    public synchronized void add(String str) {

        buffer.add(str);

    }

    @Override

    public synchronized String toString() {

        return buffer.toString();

    }

    void reset() {

        buffer.clear();

    }
}
