package com.capgemini.pecunia.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.bean.Customerdata;
@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext	
	 EntityManager em;
	
	@Override
	public Customerdata addCustomer(Customerdata c) {
		// TODO Auto-generated method stub
		Customerdata e=em.merge(c);
		return e;
	}
	
	
	@Override
	public List<Customerdata> getAllCustomers() {
		Query q=em.createQuery("select m from Customerdata m");
		List<Customerdata> customerlist=q.getResultList();
		return customerlist;
	}
	
	@Override
	public Customerdata updateCustomer(Customerdata c) {
		Customerdata ud=em.find(Customerdata.class,c.getCustomerId());
		if(ud!=null)
		{

			ud.setCustomerName(c.getCustomerName());
			ud.setCustomerType(c.getCustomerType());
			ud.setCustomerPassword(c.getCustomerPassword());
			ud.setCustomerPhoneno(c.getCustomerPhoneno());
			ud.setCustomerEmail(c.getCustomerEmail());
		}
		return ud;
			
	}
	@Override	
	public Customerdata deleteCustomer(int customerId) {
		Customerdata ud=em.find(Customerdata.class,customerId);
		if(ud!=null)
			{em.remove(ud);
			}
        return ud;
	}
	
	@Override
	public Boolean adminLoginCustomer(Customerdata c) {
		String a=c.getCustomerName();
		String b=c.getCustomerPassword();
		Query q=em.createQuery("select m.customerType from Customerdata m where m.customerName=?1 and m.customerPassword=?2");
		q.setParameter(1, a);
		q.setParameter(2,b);
		Object result = q.getSingleResult();
		String customerType=result.toString();
		boolean flag=false;
		if(customerType.contentEquals("admin"))
		{
	Query q1=em.createQuery("select m from Customerdata m where m.customerName=?1 and m.customerPassword=?2");
	q1.setParameter(1, a);
	q1.setParameter(2,b);
	try
	{
		Object m=q.getSingleResult();
		flag=true;
	}catch(javax.persistence.NoResultException e)
    {
        e.printStackTrace();
    }}
	return flag;
	}
}
	