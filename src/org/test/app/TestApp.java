package org.test.app;

import java.util.List;

import org.dao.sregion.DaoImpl;
import org.modelo.sregion.Region_2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	
	
	public static void add()
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		Region_2 region = new Region_2();
		region.setNombre("putos");
		dao.add(region);
	}
	public static void update()
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		Region_2 region = new Region_2();
		region.setId(1);
		region.setNombre("putos");
		dao.update(region);
	}
	public static void delete()
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		Region_2 region = new Region_2();
		region.setId(11);
		
		dao.delete(region);
	}
	public static void selectAll()
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		
		List<Region_2> lista = dao.listRegion_2();
		for(Region_2 x : lista)
		{
			System.out.println(x.getId()+","+ x.getNombre());
		}
	}
	
	public static void select()
	{
		ApplicationContext context =
				new ClassPathXmlApplicationContext("spring.xml");
		DaoImpl dao = context.getBean("daoImpl", DaoImpl.class);
		Region_2 region = dao.getRegion_2(1);
		System.out.println(region.getId()+","+ region.getNombre());
		
	}
	public static void main(String[] args) {
		//add();
		//update();
	  //delete();
		//selectAll();
		select();
	}

}
