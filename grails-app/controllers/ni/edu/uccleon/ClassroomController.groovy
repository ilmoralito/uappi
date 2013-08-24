package ni.edu.uccleon

import grails.plugin.gson.converters.GSON

class ClassroomController {

    static defaultAction = "list"
    static allowedMethods = [
    	"list":"GET",
    	"create":["GET", "POST"],
    	"delete":["GET", "DELETE"]
    ]

    def list() {
        withFormat {
            html {
                return [classrooms:Classroom.list(params)]
            }

            json {
                render Classroom.list() as GSON
            }
        }
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

    def delete(Integer id) {
    	def classroom = Classroom.get(id)

    	if (!classroom) {
    		response.sendError 404
    	}

    	classroom.delete()
    	flash.message = "classroom.deleted"

    	redirect action:"list"
    }

}
