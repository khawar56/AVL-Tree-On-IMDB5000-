package project;

public class movie_list {
    public class movie_node{
        movieNode movies ;
        movie_node next ;

    }
    movie_node head,loc;
    public void insert(movieNode node) //inserts nodes at front
    {
       movie_node newNode = new movie_node() ;
       newNode.movies = node ;
        if(isEmpty())
        {
            head = newNode ;
            newNode.next = null ;
        }else
        {
            newNode.next = head ;
            head = newNode ;
        }
    }
    public boolean isEmpty()
    {
        return head==null ;
    }

    public void print()  //print movies of an actor or director
    {
        movie_node temp;
        temp=head;

        while(temp!=null)
        {
            System.out.println(temp.movies.movie_title);
            temp=temp.next;
        }
    }

    public void print(String name)  // print co actors of an actor
    {
        movie_node temp;
        temp=head;

        while(temp!=null)
        {
            if(temp!=null&&temp.movies.actor_1_name.equalsIgnoreCase(name))
            {
                System.out.println(temp.movies.actor_2_name);
                System.out.println(temp.movies.actor_3_name);

            }
            else if(temp!=null&&temp.movies.actor_1_name.equalsIgnoreCase(name))
            {
                System.out.println(temp.movies.actor_2_name);
                System.out.println(temp.movies.actor_3_name);
            }
            else if(temp!=null&&temp.movies.actor_1_name.equalsIgnoreCase(name))
            {
                System.out.println(temp.movies.actor_2_name);
                System.out.println(temp.movies.actor_3_name);
            }
            temp=temp.next;
        }
    }

    public void print_Director_MovieDetails()  // print movies of some director and its movie details
    {
        movie_node temp;
        temp=head;

        while(temp!=null)
        {
            System.out.println();
            System.out.println(temp.movies.movie_title);
            System.out.println("imdb score "+temp.movies.imdb_score);
            System.out.println(temp.movies.plot_keywords);
            System.out.println("facebook likes "+temp.movies.movie_facebook_likes);
            System.out.println("---------------------------------------");
            System.out.println();
            temp=temp.next;
        }
    }


}
