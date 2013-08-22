package ni.edu.uccleon

class SchoolController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"]
    ]

    def list() {
    	[schools:School.list()]
    }

    def create() {
    	if (request.method == "POST") {
   			def school = new School(params)

   			if (!school.save()) {
   				return [school:school]
   			}

   			log.info "school [$school] saved"
   			flash.message = "school.saved"
    	} else {
    		return [school:new School(params)]
    	}
    }

}
