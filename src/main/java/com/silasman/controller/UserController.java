//package com.silasman.controller;
//
//import com.silasman.model.User;
//import com.silasman.repositoty.UserRepository;
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1")
//public class UserController {
//    @Autowired
//    private UserRepository userRepository;
//
//    @RequestMapping(value="/users", method = RequestMethod.GET)
//    public List<User> getAllUsers(){
//        return userRepository.findAll();
//    }
//
//    @RequestMapping(value = "/users", method = RequestMethod.POST)
//    public User createUser(@RequestBody User user){
//        user.setId(ObjectId.get());
//        userRepository.save(user);
//        return userRepository.save(user);
//    }
//
//    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
//    public User getInfo(@PathVariable("id") ObjectId id){
//        return userRepository.findBy_id(id);
//    }
//
//    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
//    public void deleteUser(@PathVariable("id") ObjectId id){
//        userRepository.delete(userRepository.findBy_id(id));
//    }
//
//    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
//        public User updateUser(@PathVariable("id") ObjectId id, @RequestBody User user){
//
//        user.set_id(id);
//        return userRepository.save(user);
//    }
//}
