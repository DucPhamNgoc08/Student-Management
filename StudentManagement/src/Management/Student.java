/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

/**
 *
 * @author Duc Pham Ngoc
 */
public class Student {
    public String id;
    public String name;
    public double marks;
    public String course;
    
    public Student(){
    }
    
    public Student(String id, String name, double marks, String course){
        this.id = id;
        this.course = course;
        this.marks = marks;
        this.name = name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMarks(double marks){
        this.marks = marks;
    }
    
    public void setCourse(String course){
        this.course = course;
    }
    
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String getCourse() {
        return course;
    }
}
