package ni.edu.uccleon

class DepartmentController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":["GET", "POST"],
    	"delete":["GET", "DELETE"]
    ]

    def list() {
    	if (request.method == "POST") {
    		def department = new Department(params)

    		if (!department.save()) {
    			return [department:department, departments:Department.list(params)]
    		}

    		flash.message = "department.created"
    	}

    	[departments:Department.list(params)]
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
