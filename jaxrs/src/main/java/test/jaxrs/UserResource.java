package test.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import test.jaxrs.domain.User;


@Path("/users")
public class UserResource
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers()
	{
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("1", "Test", "Testerson", 35));
		return list;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public User getUser(@PathParam("id") String id)
	{
		System.out.println("Getting user id " + id);
		return new User("1", "Test", "Testerson", 35);
	}

	@DELETE
	@Path("{id}")
	public void deleteUser(@PathParam("id") String id)
	{
		System.out.println("Deleting user id " + id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createUser(User user)
	{
		System.out.println("Creating user first name " + user.getFirstname());
	}

	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void updateUser(User user)
	{
		System.out.println("Updating user id " + user.getId());
	}
}
