package project;

public class director {
    static directorList holder_directorList;
    static int flag = 1 ;

    // some stories are better un-told, #MYSTERY_METHOD :P
        /*
        purpose of this class :
        1. Initialize directors list once.
        2. Return the reference of the actor list (holder_directorlist)
         */


    static void mysteryInsert(String name, movieNode movieNode) {
        if (flag == 1) {
            directorList directorlist = new directorList();
            holder_directorList = directorlist;  //so that it can be accessed outside the if block
            directorlist.insertAtFront(name, movieNode);
            flag++;
        } else {

            holder_directorList.insertAtFront(name, movieNode);
        }

    }
        public  directorList getHolder_directorList() {
            return holder_directorList;
        }


}