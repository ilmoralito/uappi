package ni.edu.uccleon

class DepartmentController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"],
    	"delete":["GET", "DELETE"]
    ]

    def list() {
    	[departments:Department.list(params)]
    }

    def create() {
    	if (request.method == "POST") {
    		def department = new Department(params)

    		if (!department.save()) {
    			return [department:department]
    		}

    		flash.message = "department.created"
    	} else {
    		return [department:new Department(params)]
    	}
    }

    def delete(Integer id) {
    	def department = Department.get(id)

    	if (!department) {
    		response.sendError 404
    	}

    	department.delete()
    	flash.message = "department.deleted"

    	redirect action:"list"
    }

}
