package asia.javadeveloper.musiclibrary

class Artist {
    static hasMany = [songs: Song]

    String name
    String description
    static constraints = {
        name(blank: false, nullable:false, unique: true)
        description(blank: true, nullable:true)
    }
}
