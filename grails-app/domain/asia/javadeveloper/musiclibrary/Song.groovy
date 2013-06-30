package asia.javadeveloper.musiclibrary

class Song {
    static belongsTo = Artist

    Artist artist
    String title
    String lyrics

    static constraints = {
        artist(blank: false, nullable:false)
        title(blank: false, nullable:false)
        lyrics(blank: false, nullable:false, maxSize:65535 )
    }
}
