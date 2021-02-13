package project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class main {
    static movieList ml = new movieList() ;  // creating a movie list, a container for storing the nodes of movieNode class with complete information of the movies
    public static void main(String[] args) {

            String line ="";
            String cvsSplitBy = ",";
            try (BufferedReader br = new BufferedReader(new FileReader("/Users/khawar/Downloads/IMDB Project Description and File/file.csv"))) // accessing the file
            {

                while (( line = br.readLine()) != null ) {
                    String[] word=line.split(cvsSplitBy);


                    movieNode movies = new movieNode( word[0] ,word[1],Integer.parseInt(word[2])   //passing the 28 parameters to the moviNode class's constructor
                    ,Integer.parseInt(word[3]),Integer.parseInt(word[4]),Integer.parseInt(word[5])
                    ,word[6],Integer.parseInt(word[7]),Integer.parseInt(word[8])
                    ,word[9],word[10],word[11]
                    ,Integer.parseInt(word[12]),Integer.parseInt(word[13]),word[14]
                    ,Integer.parseInt(word[15]),word[16],word[17]
                    ,Integer.parseInt(word[18]),word[19],word[20]
                    ,word[21],Integer.parseInt(word[22]),Integer.parseInt(word[23])
                    ,Integer.parseInt(word[24]),Double.parseDouble(word[25]),Double.parseDouble(word[26]),Integer.parseInt(word[27])) ;
                    ml.insertAtend(movies); // inserting it into the movie list created above




                }
            } catch (IOException e) {

                e.printStackTrace();

            }

ml.print();


}}
