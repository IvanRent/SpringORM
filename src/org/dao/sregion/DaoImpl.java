package org.dao.sregion;

import java.util.ArrayList;
import java.util.List;

import org.modelo.sregion.Region_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl {
	@Autowired
	 private HibernateTemplate template;
	 
	
	public void add(Region_2 region)
	{
		template.save(region);
	}
	public void update(Region_2 region)
	{
		template.update(region);
	}
	public void delete(Region_2 region)
	{
		template.delete(region);
	}
	public Region_2 getRegion_2(int id)
	{
		Region_2 region = (Region_2) template.get(Region_2.class, id);
		return region;
	}
	 public List<Region_2> listRegion_2()
	 {
		 List<Region_2> list = new ArrayList<Region_2>();
		 list= template.loadAll(Region_2.class);
		 return list;
	 }
	 
}
