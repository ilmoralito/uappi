package ni.edu.uccleon

class SchoolController {

    def schoolService

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"],
    	"show":"GET",
    	"update":"POST",
    	"delete":["GET", "DELETE"]
    ]

    def list() {
    	[schools:School.list()]
    }

    def create() {
    	if (request.method == "POST") {
   			def school = new School(
                name:params?.name,
                acronym:schoolService.getSchoolNameAcronym(params?.name)
            )

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

    	school.name = params?.name
        school.acronym = schoolService.getSchoolNameAcronym(params?.name)

    	if (!school.save()) {
    		render view:"show", model:[school:school, id:id]
    		return false
    	}

    	flash.message = "school.updated"

    	redirect action:"show", params:[id:id]
    }

    def delete() {
    	def school = School.findByName(params.name)

    	if (!school) {
    		response.sendError 404
    	}

    	school.delete()

    	flash.message = "school.deleted"
    	redirect action:"list"
    }

}
