package defencesystem;
    
import java.util.ArrayList;

 interface  DefenceObservableInterFace{
     public void updatebutton();
     public void getMsgMain(String msg);
     public void areaClear(boolean  clear);
     public void setPosition(int position);
 }
 class DefenceObserverable implements DefenceObservableInterFace{
     int position;
        
        private final ArrayList<DefenceObserver>observerList = new ArrayList<>();
        public void addDefenceObserver(DefenceObserver ob){
            observerList.add(ob);
        }
     
        @Override
        public void updatebutton() {

        }

        @Override
        public void getMsgMain(String msg) {
            for (DefenceObserver defenceObserver : observerList) {
                defenceObserver.getMsgMain(msg);
            }
        }

        @Override
        public void areaClear(boolean clear) {
            for (DefenceObserver ob: observerList) {
                ob.areaClear(clear);
            }
        }

        @Override
        public void setPosition(int position) {
            if (this.position != position) {
                this.position = position;
                notifyDefence();
            }
            
        }
        public void notifyDefence(){
            for (DefenceObserver ob : observerList) {
                ob.update(position);
                updatebutton();
            }
        }
 }
public class DefenceSystem {
    public static void main(String[] args) {
        DefenceObserverable defenceObserverable = new DefenceObserverable();
        defenceObserverable.addDefenceObserver(new Helicopter());
        defenceObserverable.addDefenceObserver(new Submarine());
        defenceObserverable.addDefenceObserver(new Tank());
        new MainController(defenceObserverable).setVisible(true);
    }
    
}
