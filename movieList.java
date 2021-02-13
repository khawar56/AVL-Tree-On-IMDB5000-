package project;

import java.util.Scanner;

public class movieList  {    //The list which will be holding movieNodes(whole movie details-title,actorname,directorname etc) in its nodes
    public class node{
        node next ;
        node previous ;
        movieNode data ;
    }
    node head,tail,loc ;

    public boolean isEmpty()
     {
         return head == null;
     }

    public void insertAtend(movieNode node)
    {
        node newNode = new node() ;
        newNode.data = node ;
        if(isEmpty())
        {
            head = newNode ;
            tail = newNode ;
        }

        else
        {
            newNode.previous = tail ;
            tail.next = newNode ;
            tail = newNode ;
        }
    }

    public void menu()                  //main menu
    {
        System.out.println("1. Search Movie");
        System.out.println("2. Search Actor");
        System.out.println("3. Search Director");
        System.out.println("4. Exit");

    }

    public void movie_menu()        //movie option's menu
    {
        System.out.println("1. Search movie by genre");
        System.out.println("2. Search movie by Title");
        System.out.println("3. Search movie by Actor");
        System.out.println("4. Search movie by Rating");
        System.out.println("5. Search movie by Year");
        System.out.println("6. Search movie by Director");
        System.out.println("7. Return to main menu");
    }

    public void actor_menu()        //actor option's menu
    {
        System.out.println("1. Movies actor has acted in");
        System.out.println("2. Co Actors ");
        System.out.println("3. Return to main menu");
    }

    public void director_menu()     //director option's menu
    {
        System.out.println("1. Search Director and Directed movies details");
        System.out.println("2. Return to main menu");
    }

    public void print() {
        while (true) {
            System.out.println();
            menu();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine() ;

            switch (choice)
            {
                case 1:
                    movie_menu();
                    int m_choice = input.nextInt();
                    input.nextLine() ;
                    switch (m_choice) {
                        case 1:
                            System.out.println("Enter the genre of the movies you want to search ");
                            String genre = input.nextLine();
                            loc = head;
                            while (loc != null) {
                                if (loc.data.genres.equalsIgnoreCase(genre)) {   // accessing this.node ->> movieNode ->> genre, if it is equal to required value
                                    System.out.println(loc.data.movie_title);    // print it
                                    loc = loc.next;                             // move to next node, node.next
                                } else{
                                    loc = loc.next;
                                   }
                            }
                            break;

                        case 2:
                            System.out.println("Enter the title of the movie you want to search");
                           String movie = input.nextLine();
                            loc = head;
                            while (loc != null) {
                                // accessing this.node ->> movieNode ->> title, if it is equal to required value
                                if (loc.data.movie_title.equalsIgnoreCase(movie)) {
                                    System.out.println(loc.data.movie_title+" -> "+loc.data.title_year+" "
                                            +loc.data.actor_1_name+"|"+loc.data.actor_2_name+"|"+loc.data.actor_3_name  //print name,year and actor names
                                            +"|"+" rating -> "+loc.data.imdb_score);
                                 loc = loc.next ;
                                } else
                                   {loc = loc.next;}
                            }
                            break;

                        case 3:
                            System.out.println("Enter the name of actor who's movies you want to search");
                            String actor_name = input.nextLine();
                            loc = head;
                            while (loc != null) {
                                //accessing the actors movie's data to get the movies they have acted in
                                if (loc.data.actor_1_name.equalsIgnoreCase(actor_name) || loc.data.actor_2_name.equalsIgnoreCase(actor_name) || loc.data.actor_3_name.equalsIgnoreCase(actor_name)) {
                                    System.out.println(loc.data.movie_title);
                                    loc = loc.next ;
                                } else
                                   {loc = loc.next;}
                            }
                            break;

                        case 4:
                            System.out.println("Enter the Rating");
                            double rating = input.nextDouble();
                            loc = head;
                            while (loc != null) {
                                //accessing all the movies with the same rating user asked for and then printing
                                if (loc.data.imdb_score==rating) {
                                    System.out.println(loc.data.movie_title);
                                    loc = loc.next ;
                                } else
                                    {loc = loc.next;}
                            }
                            break;

                        case 5:
                            System.out.println("Enter the release year of movies you want to search");
                            int year = input.nextInt();
                            loc = head;
                            while (loc != null) {
                                //accessing all the movies with the same release date user asked for and then printing  the movie names
                                if (loc.data.title_year==year) {
                                    System.out.println(loc.data.movie_title);
                                    loc =loc.next ;
                                } else
                                    {loc = loc.next;}
                            }
                            break;

                        case 6:
                            System.out.println("Enter name of director who's movies you want to search");
                            String dirName = input.nextLine();
                            loc = head;
                            while (loc != null) {
                                //accessing all the movies with the same director user asked for and then printing the movies
                                if (loc.data.director_name.equalsIgnoreCase(dirName)) {
                                    System.out.println(loc.data.movie_title);
                                    loc = loc.next ;
                                } else
                                    loc = loc.next;
                            }
                            break;

                        case 7:
                            print();   //back to main menu

                        default:
                            System.out.println("Invalid Input");
                    }
                    break ;
                case 2:
                    actor_menu();
                    int a_choice = input.nextInt();
                    input.nextLine() ;
                    switch (a_choice) {
                        case 1:
                            System.out.println("Enter the name of the actor you want to print movies of");
                            String Act_name = input.nextLine();
                            actor newActor = new actor();
                            // accessing that actor's individual list of movies user asked for
                            (newActor.getHolder_actorList()).search(Act_name).actor_moviesList.print();
                            break;
                        case 2:
                            System.out.println("Enter the name of the actor you want to print co-actors of");
                            String act_name = input.nextLine();
                            actor new_actor = new actor();
                            // accessing that actor's co-actors from his list of movies, whom user asked for
                            (new_actor.getHolder_actorList()).search(act_name).actor_moviesList.print(act_name);
                            break;
                        case 3:
                            print();  // main menu

                        default:
                            System.out.println("Invalid Input");
                    }
                    break ;
                case 3:
                    director_menu();
                    int d_choice = input.nextInt();
                    input.nextLine() ;
                    switch (d_choice) {
                        case 1:
                            System.out.println("enter the name of the director you want to see movies of");
                            String dir_name = input.nextLine();
                            director new_director = new director();
                            //accessing the individual director's movie list to print hte movies he directed along with their details
                            (new_director.getHolder_directorList()).search(dir_name).director_moviesList.print_Director_MovieDetails();
                            break;

                        case 2:
                            print();  // main menu

                        default:
                            System.out.println("Invalid Input");
                    }
                    break ;
                case 4:
                    System.exit(0);
            }

        }

    }

}
