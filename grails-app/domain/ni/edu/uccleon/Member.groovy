package ni.edu.uccleon

class Member {

    String name
    String position

	Date dateCreated
	Date lastUpdated

    static constraints = {
        name blank:false
        position blank:false
    }

    static mapping = {
    	version false
    }

    static belongsTo = [department:Department]

    String toString() {
        "$name - $position"
    }
}
