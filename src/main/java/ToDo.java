package main.java;

public class ToDo {
    //attributes
    private String name;
    private String time;
    private String date;
    private double duration;
    private String repetition;
    private String deadline;

    //costructor
    public ToDo() {
        this.name = "";
        this.time = "";
        this.date = "";
        this.duration = 0;
        this.repetition = "";
        this.deadline = "";
    }
    // costructor override
    public ToDo(String name, String time, String date, String repetition, String deadline, double duration){
        this.name = name;
        this.time = time;
        this.date = date;
        this.deadline = deadline;
        this.duration = duration;
        this.repetition = repetition;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setTime(String time){
        this.time = time;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }
    public void setRepetition(String repetition){
        this.repetition = repetition;
    }
    public void setDeadline(String deadline){
        this.deadline = deadline;
    }


    public String getName(){
        return name;
    }
    public String getTime(){
        return time;
    }
    public String getDate(){
        return date;
    }
    public double getDuration(){
        return duration;
    }
    public String getRepetition(){
        return repetition;
    }
    public String getDeadline(){
        return deadline;
    }
}