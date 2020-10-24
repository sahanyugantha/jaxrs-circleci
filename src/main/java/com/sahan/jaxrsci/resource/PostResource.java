package com.sahan.jaxrsci.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sahan.jaxrsci.dao.PostDao;
import com.sahan.jaxrsci.model.Post;

@Path("/posts")
public class PostResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllPosts() {
		Gson gson = new Gson();
		PostDao postDao = new PostDao();
		List<Post> posts = postDao.fakeDbList();
		
		String jsonString = gson.toJson(posts);
		return jsonString;
		
	}

}
