package SignUp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DetailsDao
{
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("harshith");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(Details details)
	{
		entityTransaction.begin();
		entityManager.persist(details);
		entityTransaction.commit();
	}
	
	public Details fetch(int id)
	{
		Details details = entityManager.find(Details.class, id);
		return details;
	}
		
	
}
