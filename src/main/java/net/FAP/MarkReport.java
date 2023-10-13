/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.FAP;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author caomi
 */
@Entity
@Table(name = "mark_report")
public class MarkReport {

    @Id
    @Column(name = "mr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
    
    
    private double as1, as2, pt1, pt2, pe, fe;

    public MarkReport(Student student, Subject subject, double as1, double as2, double pt1, double pt2, double pe, double fe) {
        
        this.student = student;
        this.subject = subject;
        this.as1 = as1;
        this.as2 = as2;
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.pe = pe;
        this.fe = fe;
    }

    public MarkReport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getAs1() {
        return as1;
    }

    public void setAs1(double as1) {
        this.as1 = as1;
    }

    public double getAs2() {
        return as2;
    }

    public void setAs2(double as2) {
        this.as2 = as2;
    }

    public double getPt1() {
        return pt1;
    }

    public void setPt1(double pt1) {
        this.pt1 = pt1;
    }

    public double getPt2() {
        return pt2;
    }

    public void setPt2(double pt2) {
        this.pt2 = pt2;
    }

    public double getPe() {
        return pe;
    }

    public void setPe(double pe) {
        this.pe = pe;
    }

    public double getFe() {
        return fe;
    }

    public void setFe(double fe) {
        this.fe = fe;
    }

}
