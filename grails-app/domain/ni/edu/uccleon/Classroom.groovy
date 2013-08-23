package ni.edu.uccleon

class Classroom {

    String code
    String name

	Date dateCreated
	Date lastUpdated

    static constraints = {
        code blank:false, unique:true
        name nullable:true, unique:true
    }

    def beforeInsert() {
        code = code.toUpperCase()
    }

    def beforeUpdate() {
        code = code.toUpperCase()
    }

    static mapping = {
    	version false
    }

    String toString() {
        code
    }
}
