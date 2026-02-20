public class Driver {
    public static void main(String [] args) {

        MyStuff playlist = new MyStuff();
        playlist.playlistName = "Top Hits of 2020";
        playlist.genres = "Pop";
        playlist.owner = "Spotify";
        playlist.listeners = 98561;
        playlist.totalSongs = 125;
        playlist.mostListenedSong = "Blinding Lights by The Weekend";
        playlist.topArtist = "BTS";
        playlist.AvgAge = 19.7;

        MyStuff playlist2 = new MyStuff();
        playlist2.playlistName = "Workout music";
        playlist2.genres = "Hip-Hop";
        playlist2.owner = "Spotify";
        playlist2.listeners = 561731;
        playlist2.totalSongs = 137;
        playlist2.mostListenedSong = "FE!N by Travis Scott & Playboi Carti";
        playlist2.topArtist = "Rihanna";
        playlist2.AvgAge = 22.3;

        System.out.println(playlist2.topArtist);
        System.out.println(playlist2.mostListenedSong);
        System.out.println(playlist. mostListenedSong);
        System.out.println(playlist.topArtist);
    }
}