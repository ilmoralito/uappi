package ni.edu.uccleon

class SchoolController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"],
    	"show":"GET",
    	"update":"POST"
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

    def show(Integer id) {
    	def school = School.get(id)

    	if (!school) {
    		response.sendError 404
    	}

    	[school:school]
    }

    def update(Integer id) {
    	def school = School.get(id)

    	if (!school) {
    		response.sendError 404
    	}

    	school.properties["name"] = params

    	if (!school.save()) {
    		render view:"show", model:[school:school, id:id]
    		return false
    	}

    	flash.message = "school.updated"

    	redirect action:"show", params:[id:id]
    }

}
