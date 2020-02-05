package com.osb.dao;

import java.util.List;

import com.osb.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();

	Category get(int id);
	

}
