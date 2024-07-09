package Remote;

import javax.annotation.Resource;

import annotation.Remote;
import model.Response;
import model.User;
import service.TestService;
import until.ResponseUtil;

@Remote
public class TestRemoteImpl implements TestRemote{
	
	@Resource
	private TestService service;
	
	public Response testUser(User user){
		service.test(user);
		Response response = ResponseUtil.createSuccessResponse(user);
		
		return response;
	}
	
//	public Response saveUsers(List<User> userlist){
//		service.saveUSerList(userlist);
//		Response response = ResponseUtil.createSuccessResponse(userlist);
//		
//		return response;
//	}
}
