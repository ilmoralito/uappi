package ni.edu.uccleon

class School {

    String name
    String acronym
    byte[] logo

	Date dateCreated
	Date lastUpdated

    static constraints = {
        name blank:false, unique:true
        acronym blank:false
        logo nullable:true, maxSize:10000
    }

    static mapping = {
    	version false
    }

    String toString() {
        name
    }
}
