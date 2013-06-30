package asia.javadeveloper.musiclibrary

class Genre {
    String name
    static constraints = {
        name(blank: false, nullable:false, unique: true)
    }
}
