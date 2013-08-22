package ni.edu.uccleon

class School {

    String name

	Date dateCreated
	Date lastUpdated

    static constraints = {
        name blank:false, unique:true
    }

    static mapping = {
    	version false
    }

    String toString() {
        name
    }
}
