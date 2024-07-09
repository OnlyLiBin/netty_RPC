package Li.rpc.user;

import java.util.List;

import Li.rpc.consumer.param.Response;



public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
