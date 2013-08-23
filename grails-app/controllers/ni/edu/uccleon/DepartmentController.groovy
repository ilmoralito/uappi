package ni.edu.uccleon

class DepartmentController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":["GET", "POST"]
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
}
