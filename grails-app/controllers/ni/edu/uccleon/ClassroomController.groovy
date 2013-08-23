package ni.edu.uccleon

class ClassroomController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"]
    ]

    def list() {
    	[classrooms:Classroom.list(params)]
    }

    def create() {
    	if (request.method == "POST") {
    		def classroom = new Classroom(params)

    		if (!classroom.save()) {
    			return [classroom:classroom]
    		}

    		flash.message = "classroom.created"
    	} else {
    		return [classroom:new Classroom(params)]
    	}
    }

}
