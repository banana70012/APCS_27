package pkg.*;
import java.util.*;
public class Movie{
    private String moviename;
    private double rating;
    private int amountof;
    private int revenue;
    public Movie(){
        moviename = "Avengers";
        rating = 8.0;
        amountof = 33;
        revenue = 623375910;
        
    }
    public Movie(String n, double ra, int ar, int r){
        moviename = n;
        rating = ra;
        amountof = ar;
        revenue = r;
        
    }
    public void movieToString(){
        System.out.println("Movie: "+moviename);
        System.out.println("Rating:" +rating);
        System.out.println("Number of ratings: "+amountof);
        System.out.println("Revenue: $"+revenue);
        System.out.println(" ");
    }
    public String getMovieName(){
        return moviename;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double r){
        amountof++;
        rating = ((rating*amountof)+r)/amountof;
        amountof++;
    }
    public boolean compareRatings(Movie a){
        if(a.rating>=rating){
            return false;
        }
        else{
            return true;
        }
    }
    
}
