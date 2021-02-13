package project;

public class actor {
    static actorList holder_actorList;
    static int flag = 1 ;

    // some stories are better un-told, #MYSTERY_METHOD :P
        /*
        purpose of this class :
        1. Initialize actors list once.
        2. Return the reference of the actor list (holder_actorlist)
         */

    static void mysteryInsert(String name, movieNode movieNode) {
        if (flag == 1) {
            actorList actorlist = new actorList();
            holder_actorList = actorlist;   //so that it can be accessed outside the if block
            actorlist.insertAtFront(name, movieNode);
            flag++;
        }
          else {

                holder_actorList.insertAtFront(name, movieNode);
            }
        }

    public  actorList getHolder_actorList() {
        return holder_actorList;
    }
}


