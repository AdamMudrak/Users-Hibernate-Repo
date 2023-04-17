package org.example.app.repositories;

import jakarta.persistence.Query;
import org.example.app.entities.User;
import org.example.app.utils.Constants;
import org.example.app.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserCreateRepository {

    @SuppressWarnings("deprecation")
    public String createUser(User user) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            String hql = "INSERT INTO User (firstName, lastname, phone, email) " +
                    "VALUES (:firstName, :lastName, :phone, :email)";

            Query query = session.createQuery(hql);
            query.setParameter("firstName", user.getFirstName());
            query.setParameter("lastname", user.getLastName());
            query.setParameter("phone", user.getPhone());
            query.setParameter("email", user.getEmail());
            query.executeUpdate();

            transaction.commit();
            return Constants.DATA_INSERT_MSG;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            return e.getMessage();
        }
    }
}
