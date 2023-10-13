/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.FAP;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author caomi
 */
@Service
public class MarkReportDetailsService {
    @Autowired
    MarkReportRepository markReportRepository;
    public List<MarkReport>findByStudentId(long id){
        return markReportRepository.findByStudentId(id);
    }
}
