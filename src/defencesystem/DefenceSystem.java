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

        }

        @Override
        public void areaClear(boolean clear) {
            
        }

        @Override
        public void setPosition(int position) {
            
        }
 }
public class DefenceSystem {
    public static void main(String[] args) {
        
    }
    
}
