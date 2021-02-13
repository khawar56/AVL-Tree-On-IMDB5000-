package project;


public class actorList
{

    public class actorNode
        {
            String actorName;
            movie_list actor_moviesList ;
            actorNode next;

        }
     actorNode  head , loc , ploc ;


    public  boolean isEmpty()
    {
        return head==null ;
    }
    public void insertAtFront(String name,movieNode movieNode)
    {
        actorNode loc_actorSearched = search(name) ;
        if(isEmpty()||loc_actorSearched==null)
        {
            actorNode newNode_A = new actorNode() ;
            newNode_A.actorName = name ;
            newNode_A.next = head ;
            head = newNode_A ;
            movie_list movList_A = new movie_list() ;
            newNode_A.actor_moviesList = movList_A ;
            movList_A.insert(movieNode);

        }
        else
        {
            if(loc_actorSearched!=null)
            {
                loc_actorSearched.actor_moviesList.insert(movieNode);
            }
        }

    }

    public actorNode search(String name)   //searches for the actor in actorList and returns its location if found
    {
        ploc = null ; loc = null ;
        if(!isEmpty())
        {
            loc = head ;
        }
        while(loc!=null&&!(loc.actorName.equalsIgnoreCase(name)))
        {
            ploc = loc ;
            loc = loc.next ;
        }
        if(loc!=null && !(loc.actorName.equalsIgnoreCase(name)))
        {
            loc = null ; return loc ;
        }
        return loc ;

    }




}
