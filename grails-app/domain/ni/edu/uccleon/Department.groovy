package ni.edu.uccleon

class Department {

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
