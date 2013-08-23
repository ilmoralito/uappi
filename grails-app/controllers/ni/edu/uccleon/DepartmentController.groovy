package ni.edu.uccleon

class DepartmentController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"],
    	"edit":"GET",
        "update":"POST",
        "show":"GET",
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

    def edit(Integer id) {
    	def department = Department.get(id)

    	if (!department) {
    		response.sendError 404
    	}

    	[department:department]
    }

    def update(Integer id) {
    	def department = Department.get(id)

    	if (!department) {
    		response.sendError 404
    	}

    	department.properties = params

    	if (!department.save()) {
    		render view:"edit", model:[department:department, id:id]
    		return false
    	}

    	flash.message = "department.updated"
    	redirect action:"edit", params:[id:id]
    }

    def show(Integer id) {
        def department = Department.get(id)

        if (!department) {
            response.sendError 404
        }

        [department:department]
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
