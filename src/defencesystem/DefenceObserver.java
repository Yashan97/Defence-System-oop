
package defencesystem;
public interface DefenceObserver {
     public void getMsgMain(String msg);
     public void areaClear(boolean  clear);
     public void setPosition(int position);
     public void update(int position);
    public void updatebutton(int position);
}
