package ni.edu.uccleon

class Department {

    String name
    String manager
    String extention

	Date dateCreated
	Date lastUpdated

    static constraints = {
        name blank:false, unique:true
        manager blank:false
        extention blank:false, unique:true
    }

    static mapping = {
    	version false
    }

    static hasMany = [members:Member]
    List members

    String toString() {
        name
    }
}
