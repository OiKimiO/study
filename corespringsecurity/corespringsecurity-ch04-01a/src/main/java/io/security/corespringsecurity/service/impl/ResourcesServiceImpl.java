package io.security.corespringsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.security.corespringsecurity.domain.entity.Resources;
import io.security.corespringsecurity.repository.ResourcesRepository;
import io.security.corespringsecurity.service.ResourcesService;

@Service("resourceService")
public class ResourcesServiceImpl implements ResourcesService{

	@Autowired
	private ResourcesRepository resourcesRepository;
	
	@Override
	public Resources selectResources(long id) {
		return resourcesRepository.findById(id).orElse(new Resources());
	}

	@Override
	public List<Resources> selectResources() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertResource(Resources resources) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteResources(long id) {
		// TODO Auto-generated method stub
		
	}

}
