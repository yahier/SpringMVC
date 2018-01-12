package com.cenyol.example.repository;

import com.cenyol.example.vo.Blog;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogDao {

    @Autowired
    private SessionFactory sessionFactory;

    //获取和当前线程绑定的Seesion
    private Session getSession()
    {
        return sessionFactory.getCurrentSession();
    }

//    public String findBookById(int id) {
//        String hql = "SELECT bookName from Book where id=?";
//        Query query = getSession().createQuery(hql).setInteger(0, id);
//        String str = query.uniqueResult().toString();
//        return str;
//    }
    public void save(Blog book) {
        getSession().save(book);
    }
}
