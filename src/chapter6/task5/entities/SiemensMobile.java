package chapter6.task5.entities;

import chapter6.task5.impl.Mobile;

/**
 *
 * @author Sukhocheva Maryana
 */
abstract class SiemensMobile implements Mobile {
    boolean incomingCall;
    boolean isTalkingNow;
    int siemensSerialNumber;
    abstract void connectToSiemensOnline();
}