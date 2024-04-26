package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SongServiceT implements SongService {
    private Map<Integer,Song> songs;

    public SongServiceT() {
        songs = new HashMap < > ();
        songs.put(1, new Song("Song 1", "Artist 1", "Album 1", 210));
        songs.put(2, new Song("Song 2", "Artist 2", "Album 1", 220));
        songs.put(3, new Song("Song 3", "Artist 3", "Album 2", 180));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Song> results = new ArrayList < > ();
        for (Song song: songs.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                results.add(song);
            }
        }
        return results;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List < Song > results = new ArrayList<>();
        for (Song song: songs.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                results.add(song);
            }
        }
        return results;
    }
}