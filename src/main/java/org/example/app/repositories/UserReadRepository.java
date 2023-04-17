package org.example.app.repositories;

import org.example.app.entities.User;
import org.example.app.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.Collections;
import java.util.List;

public class UserReadRepository {

    public List<User> readUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM User", User.class).list();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
