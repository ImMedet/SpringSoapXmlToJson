package kz.medet.test_spring_h2_soap.service.impl;

import kz.medet.test_spring_h2_soap.model.User;
import kz.medet.test_spring_h2_soap.repository.UserRepository;
import kz.medet.test_spring_h2_soap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return(List<User>) userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);

    }

    @Override
    public User updateUser(User user, long id) {
        User user1 = userRepository.findById(id).get();
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        user1.setEmail(user.getEmail());
        return userRepository.save(user1);
    }
}
