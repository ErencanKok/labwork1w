import java.util.ArrayList;
import java.util.List;

/**
 * MusicPlayer sınıfı, müzik çalma işlevselliğini sağlar.
 */
 class MusicPlayer {
    private static MusicPlayer instance;
    private List<String> playlist;

    /**
     * MusicPlayer yapıcı metodu, çalma listesini başlatır.
     */
    private MusicPlayer() {
        playlist = new ArrayList<>();
    }

    /**
     * Singleton Pattern ile tekil MusicPlayer örneğini döndürür.
     * @return MusicPlayer örneği
     */
    public static synchronized MusicPlayer getInstance() {
        if (instance == null) {
            instance = new MusicPlayer();
        }
        return instance;
    }

    /**
     * Verilen şarkıyı çalar.
     * @param song çalınacak şarkı
     */
    public void play(String song) {
        System.out.println("Playing " + song + "...");
    }

    /**
     * Çalma listesine şarkı ekler.
     * @param song eklenecek şarkı
     */
    public void addToPlaylist(String song) {
        playlist.add(song);
        System.out.println("Added " + song + " to playlist.");
    }

    /**
     * Çalma listesinden şarkıyı kaldırır.
     * @param song kaldırılacak şarkı
     */
    public void removeFromPlaylist(String song) {
        if (playlist.remove(song)) {
            System.out.println("Removed " + song + " from playlist.");
        } else {
            System.out.println(song + " not in the playlist.");
        }
    }

    /**
     * Çalma listesini gösterir.
     */
    public void showPlaylist() {
        System.out.println("Current Playlist:");
        for (String song : playlist) {
            System.out.println(" " + song);
        }
    }

    /**
     * Kullanıcı adı ve şifreyi doğrular.
     * @param username kullanıcı adı
     * @param password şifre
     */
    public void authenticateUser(String username, String password) {
        if (username.equals("user") && password.equals("password")) {
            System.out.println("Authentication successful : " + username);
        } else {
            System.out.println("Authentication fail");
        }
    }

    /**
     * Belirtilen olayı günlüğe kaydeder.
     * @param event kaydedilecek olay
     */
    public void logEvent(String event) {
        System.out.println("Logging event: " + event);
    }
}