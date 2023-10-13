/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.FAP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author caomi
 */
@Service
public class StudentDetailsService{
    @Autowired
    private StudentRepository userRepository;
    public Student getStudent(Long id){
        return userRepository.getOne(id);
    }
}
