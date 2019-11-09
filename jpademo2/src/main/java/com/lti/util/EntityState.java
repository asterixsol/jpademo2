package com.lti.util;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import com.lti.db.DatabaseConnector;

public class EntityState
{
	public static boolean isDetached(Entity e)
	{
		boolean detached=false;
		EntityManager em=new DatabaseConnector().getEntityManager();
		if(em.contains(e))
		{
			detached=false;
		}
		else
		{
			detached=true;
		}
		
		return detached;
	}

}
