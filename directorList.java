package project;

public class directorList {
    public class directorNode{
        String directorName ;
        movie_list director_moviesList ;
        directorNode next ;
    }
    directorNode head,loc,ploc ;
    public  boolean isEmpty()
    {
        return head==null ;
    }

    public void insertAtFront(String name,movieNode movieNode)
    {
        directorNode loc_directorSearched = search(name) ; //null
        if(isEmpty()||loc_directorSearched==null)
        {
            directorNode newNode_D = new directorNode() ;
            newNode_D.directorName = name ;
            newNode_D.next = head ;
            head = newNode_D ;
            movie_list movList_D = new movie_list() ;
            newNode_D.director_moviesList = movList_D ;
            movList_D.insert(movieNode);

        }
        else
        {
            if(loc_directorSearched!=null)
            {
                loc_directorSearched.director_moviesList.insert(movieNode);
            }
        }
    }

    public directorNode search(String name)   //searches for the director in directorList and returns its location if found
    {
        ploc = null ; loc = null ;
        if(!isEmpty())
        {
            loc = head ;
        }
        while(loc!=null&&!(loc.directorName.equalsIgnoreCase(name)))
        {
            ploc = loc ;
            loc = loc.next ;
        }
        if(loc!=null && !(loc.directorName.equalsIgnoreCase(name)))
        {
            loc = null ; return loc ;
        }
        return loc ;

    }

}
