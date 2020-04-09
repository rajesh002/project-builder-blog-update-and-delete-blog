package dao;

import java.sql.SQLException;
import java.util.List;

import model.Blog;

public interface BlogDaoInterface {
	
		void insertBlog(Blog blog) throws SQLException, Exception;
		Blog selectBlog(int blogid) throws Exception;
	    List<Blog> selectAllBlogs() throws Exception;
		boolean deleteBlog(int id) throws SQLException, Exception;
		boolean updateBlog(Blog blog) throws SQLException, Exception;
	
}

