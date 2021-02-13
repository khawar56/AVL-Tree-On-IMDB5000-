package project;

public class movieNode  {
    String color ;
    String director_name ;
    int num_critic_for_reviews ;
    int duration ;
    int director_facebook_likes ;
    int actor_3_facebook_likes ;
    String actor_2_name ;
    int actor_1_facebook_likes ;
    int gross ;
    String genres ;
    String actor_1_name ;
    String movie_title ;
    int num_voted_users ;
    int cast_total_facebook_likes ;
    String actor_3_name ;
    int facenumber_in_poster ;
    String plot_keywords ;
    String movie_imdb_link ;
    int num_user_for_reviews ;
    String language ;
    String country ;
    String content_rating ;
    int budget ;
    int title_year ;
    int actor_2_facebook_likes ;
    double imdb_score ;
    double aspect_ratio ;
    int movie_facebook_likes ;

    public movieNode() {}

    //takes in 28 parameters, updates its field variables and then performs respective actions upon the director & actor's data

    public movieNode(String color, String director_name, int num_critic_for_reviews, int duration,
                     int director_facebook_likes, int actor_3_facebook_likes, String actor_2_name,
                     int actor_1_facebook_likes, int gross, String genres, String actor_1_name,
                     String movie_title, int num_voted_users, int cast_total_facebook_likes, String actor_3_name,
                     int facenumber_in_poster, String plot_keywords, String movie_imdb_link, int num_user_for_reviews,
                     String language, String country, String content_rating, int budget, int title_year,
                     int actor_2_facebook_likes, double imdb_score, double aspect_ratio, int movie_facebook_likes) {

        this.color = color;
        this.director_name = director_name ;
        this.num_critic_for_reviews = num_critic_for_reviews;
        this.duration = duration;
        this.director_facebook_likes = director_facebook_likes;
        this.actor_3_facebook_likes = actor_3_facebook_likes;
        this.actor_2_name = actor_2_name ;
        this.actor_1_facebook_likes = actor_1_facebook_likes;
        this.gross = gross;
        this.genres = genres;
        this.actor_1_name = actor_1_name ;
        this.movie_title = movie_title;
        this.num_voted_users = num_voted_users;
        this.cast_total_facebook_likes = cast_total_facebook_likes;
        this.actor_3_name = actor_3_name ;
        this.facenumber_in_poster = facenumber_in_poster;
        this.plot_keywords = plot_keywords;
        this.movie_imdb_link = movie_imdb_link;
        this.num_user_for_reviews = num_user_for_reviews;
        this.language = language;
        this.country = country;
        this.content_rating = content_rating;
        this.budget = budget;
        this.title_year = title_year;
        this.actor_2_facebook_likes = actor_2_facebook_likes;
        this.imdb_score = imdb_score;
        this.aspect_ratio = aspect_ratio;
        this.movie_facebook_likes = movie_facebook_likes;
        director.mysteryInsert(director_name,this);   //forwards director's name and this movie object to director class
        actor.mysteryInsert(actor_2_name,this); //forwards actor's name and this movie object to actor class
        actor.mysteryInsert(actor_3_name,this); //forwards actor's name and this movie object to actor class
        actor.mysteryInsert(actor_1_name,this); //forwards actor's name and this movie object to actor class





    }
}
