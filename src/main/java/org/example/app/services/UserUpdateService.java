package org.example.app.services;

import org.example.app.entities.User;
import org.example.app.exceptions.UpdateException;
import org.example.app.repositories.UserUpdateRepository;
import org.example.app.utils.Constants;
import org.example.app.utils.IdChecker;
import org.example.app.utils.PhoneValidator;

import java.util.HashMap;
import java.util.Map;

public class UserUpdateService {

    UserUpdateRepository repository;

    public UserUpdateService(UserUpdateRepository repository) {
        this.repository = repository;
    }

    public String updateUser(User user) {

        Map<String, String> errors = validateData(user);

        if (errors.size() > 0) {
            try {
                throw new UpdateException("Check inputs", errors);
            } catch (UpdateException ue) {
                return ue.getErrors(errors);
            }
        }
        return repository.updateUser(user);
    }

    private Map<String, String> validateData(User user) {

        Map<String, String> errors = new HashMap<>();

        if (Integer.toString(user.getId()).isEmpty())
            errors.put("id", Constants.INPUT_REQ_MSG);

        if (user.getId() <= 0)
            errors.put("id", Constants.ID_NO_EXISTS_MSG);

        if (!IdChecker.isIdExists(user))
            errors.put("id", Constants.ID_NO_EXISTS_MSG);

        if (PhoneValidator.isPhoneValid(user.getPhone()))
            errors.put("phone", Constants.WRONG_PHONE_MSG);

        return errors;
    }
}
