package com.blog.service;

import com.blog.entity.Manager;

public interface ManagerService {

	public void save(Manager manager);

	public void delete(Integer id);

	public void update(Manager manager);

	public Manager querty(Integer id);

	public Manager querty(String account);

}