package Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author juanc
 */
public class Projection implements Serializable {

    private Movie movie;
    private Screen screen;
    private LocalDateTime dateTime;
    private boolean is3D;
    private boolean is4D;
    private boolean blockGA[][];   //matrix that contains the availlability of general seats. Default is FALSE
    private boolean blockVIP[][];   //matrix that contains the availlability of VIP seats. Default is FALSE
    private boolean block4DX[][]; //matrix that contains the availlability of 4DX seats. Default is FALSE
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*
    public Projection(Movie movie, Screen screen, LocalDateTime dateTime, boolean is3D, boolean is4D) {
        this.movie = movie;
        this.screen = screen;
        this.dateTime = dateTime;
        this.is3D = is3D;
        this.is4D = is4D;
    }
     */
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isIs3D() {
        return is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean isIs4D() {
        return is4D;
    }

    public void setIs4D(boolean is4D) {
        this.is4D = is4D;
    }

}
