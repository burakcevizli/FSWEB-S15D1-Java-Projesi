package MobilePhoneOdev2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber,List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public void setMyContacts(ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact param){
        if(myContacts.contains(param)){
            return false;
        }else{
            myContacts.add(param);
            return true;
        }
    }

    public boolean updateContact(Contact param1 , Contact param2){
        if(myContacts.contains(param1)){
            int index = myContacts.indexOf(param1);
           myContacts.set(index,param2);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeContact(Contact param){
        if(myContacts.contains(param)){
            myContacts.remove(param);
            return true;
        }else{
            return false;
        }
    }

    public int findContact(Contact param){

        return myContacts.indexOf(param);
    }
    public int findContact(String param) {
        for (int i = 0; i < myContacts.size(); i++) {
            String currentName = myContacts.get(i).getName();
            if (currentName.equals(param)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String param){

        for(Contact myContanct : myContacts){
            if(myContanct.getName().equals(param)){
                return myContanct;
            }
        }
        return null;
    }

     public void printContact(){
        for(int i = 0; i<myContacts.size();i++){
            System.out.println((i+1) + "." + myContacts.get(i).getName() + "->" + myContacts.get(i).getPhoneNumber());
        }
    }

}
