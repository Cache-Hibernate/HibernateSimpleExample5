package com.javacodegeeks.enterprise.hibernate;


import org.hibernate.Session;

import com.javacodegeeks.enterprise.hibernate.utils.HibernateUtil;

public class App {

    public static void main( String[] args ){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Student student1 = new Student("Jeremny-2","23");
        Student student2 = new Student("Robert-2","24");
        Class class1 = new Class("Security-2","Spring-2");
        Class class2 = new Class("Databases-2","Winter-2");
        Class class3 = new Class("Hibernate-2","Winter-2");

        student1.getStudentClasses().add(class1);
        student1.getStudentClasses().add(class2);
        student2.getStudentClasses().add(class1);
        student2.getStudentClasses().add(class2);
        student2.getStudentClasses().add(class3);
        
        class1.getAssignedStudents().add(student1);
        class1.getAssignedStudents().add(student2);
        class2.getAssignedStudents().add(student1);
        class2.getAssignedStudents().add(student2);
        class3.getAssignedStudents().add(student2);
        
        session.save(student1);
        session.save(student2);
        session.getTransaction().commit();

        System.out.println("Great! Students were saved");
    }

}