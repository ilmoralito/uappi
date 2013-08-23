package ni.edu.uccleon

class DepartmentController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET"
    ]

    def list() {
    	[departments:Department.list(params)]
    }
}
