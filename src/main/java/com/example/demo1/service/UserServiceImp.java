        package com.example.demo1.service;

        import com.example.demo1.entity.User;
        import com.example.demo1.repository.UserRepo;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        @Service
        public class UserServiceImp implements UserService {

            @Autowired
            private UserRepo userRepo;

            @Override
            public User findByUsername(String username) {
                return userRepo.findByUsername(username)
                        .orElse(null); // Handle if user is not found
            }
        }
