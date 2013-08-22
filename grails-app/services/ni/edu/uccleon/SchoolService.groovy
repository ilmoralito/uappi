package ni.edu.uccleon

class SchoolService {

    def getSchoolNameAcronym(String name) {
    	def letters = name.split(" ").findAll { it.size() > 3 }
        def acronym = letters.collect { it[0] }

        acronym*.toUpperCase().join()
    }
}
