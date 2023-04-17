package org.example.app.services;

import org.example.app.entities.User;
import org.example.app.repositories.UserDeleteRepository;
import org.example.app.utils.Constants;
import org.example.app.utils.IdChecker;

public class UserDeleteService {

    UserDeleteRepository repository;

    public UserDeleteService(UserDeleteRepository repository) {
        this.repository = repository;
    }

    public String deleteUser(User user) {

        if (IdChecker.isIdExists(user)) {
            return repository.deleteUser(user);
        } else return Constants.ID_NO_EXISTS_MSG;
    }
}
