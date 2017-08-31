package chapter6.task5.entities;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Model extends SiemensMobile {
 
    @Override
    public void connectToSiemensOnline() {
        System.out.println("Подсоединились к сервису Сименс Онлайн");
    }
 
    @Override
    public void startCall(String number) {
       if (!number.isEmpty() && number!=null) {
           if (!isTalkingNow) {
                isTalkingNow = true;
           } else {
               isTalkingNow = false;
           }
        } else {
             isTalkingNow = true;
        }
       System.out.println("Звонок начат");
    }
 
    @Override
    public String searchForCall() {
        if (isTalkingNow){
           return "Линяя занята";
        } else {
           return "Вызов принят";
        }
        }
 
    @Override
    public void acceptCall(String number) {
        if (!number.isEmpty() && number!=null) {
            isTalkingNow = true;
            
        } else {
             isTalkingNow = false;
        }
 
    }
 
    @Override
    public void breakCall() {
        isTalkingNow = false;
        System.out.println("Звонок окончен");
    }
}