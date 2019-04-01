package HeadFirstJava.Chapter16;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -14:08
 */
public class Song implements Comparable<Song> {

    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Song s= (Song) obj;
        return getTitle().equals(s.getTitle());
    }
}
