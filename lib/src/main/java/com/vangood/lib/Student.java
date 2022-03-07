package com.vangood.lib;

class Student {
    String name;
    int english;
    int math;

    public Student(){
        this("",0,0);
    }
    public Student(String name, int english, int math){
        this.name = name;
        this.english=english;
        this.math=math;
    }
    public char getGrade(){
        int avg =getAverage()/10;
        char grade='F';
        switch(avg){
            case 10:
            case 9:
                grade='A';
                break;
            case 8:
                grade='B';
                break;
            case 7:
                grade='C';
                break;
        }
        return grade;
    }

    public int getAverage(){
        return(english+math)/2;
    }

    public int getMath() {
        return math;
    }


}
