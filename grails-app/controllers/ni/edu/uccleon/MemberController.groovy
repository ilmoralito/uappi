package ni.edu.uccleon

class MemberController {

    //static defaultAction = "actionName"
    static allowedMethods = [
    	"create":"POST"
    ]

    def create(Integer id) {
    	def member = new Member(params)
    	def department = Department.get(id)

    	department.addToMembers(member)

    	if (!member.save()) {
    		chain controller:"department", action:"show", params:[id:params.id], model:[member:member]
    		return false
    	}

    	flash.message = "member.successfuly.created"

    	redirect controller:"department", action:"show", params:[id:params.id]
    }
}
