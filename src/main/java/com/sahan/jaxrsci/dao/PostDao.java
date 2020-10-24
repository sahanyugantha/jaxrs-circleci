package com.sahan.jaxrsci.dao;

import java.util.ArrayList;
import java.util.List;

import com.sahan.jaxrsci.model.Post;

public class PostDao {
	
	public List<Post> fakeDbList(){
		List<Post> postList = new ArrayList<Post>();
		postList.add(new Post(1, "Post one", "Sample description one"));
		postList.add(new Post(1, "Post two", "Sample description two"));
		postList.add(new Post(1, "Post three", "Sample description three"));
		return postList;
	}

}
