package proxy;

import java.util.List;

public class MusicStreamingApp {
    public static void main(String[] args) {
        SongService realService = new SongServiceT();
        SongService songProxy = new SongProxy(realService);

        // Search for songs using the proxy
        Song song1 = songProxy.searchById(1);
        Song song2 = songProxy.searchById(2);
        List<Song> songsWithTitle = songProxy.searchByTitle("Title");
        List<Song> songsWithAlbum = songProxy.searchByAlbum("Album");

        // Display retrieved song metadata
        System.out.println(song1);
        System.out.println(song2);
        songsWithTitle.forEach(System.out::println);
        songsWithAlbum.forEach(System.out::println);
    }
}