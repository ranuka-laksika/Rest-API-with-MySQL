package com.firstproeject.firstproject.service;
import com.firstproeject.firstproject.dto.UserDTO;
import com.firstproeject.firstproject.entity.User;
import com.firstproeject.firstproject.repo.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO userSave(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    public List<UserDTO> getUser(){
        List<User> users = userRepository.findAll();
        return modelMapper.map(users,new TypeToken<List<UserDTO>>(){}.getType());

    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepository.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepository.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

    public UserDTO getUserByUserId(String userId){
        User user=userRepository.getUserById(userId);
        return modelMapper.map(user,UserDTO.class);
    }

    public UserDTO getUserByIDAndEmail(String userId,String email){
        User user=userRepository.getUserByIdAndEmail(userId,email);

        return modelMapper.map(user,UserDTO.class);
    }
}
