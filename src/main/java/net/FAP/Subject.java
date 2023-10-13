/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.FAP;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author caomi
 */
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_id;

    @OneToMany(mappedBy = "subject")
    private List<MarkReport> markReports;

    private String subject_name;

    public Subject() {
    }

    public Subject(Long subject_id, List<MarkReport> markReports, String subject_name) {
        this.subject_id = subject_id;
        this.markReports = markReports;
        this.subject_name = subject_name;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public List<MarkReport> getMarkReports() {
        return markReports;
    }

    public void setMarkReports(List<MarkReport> markReports) {
        this.markReports = markReports;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    
}
