package main.java;

public class ToDo {
    //attributes
    private String name;
    private String time;
    private String date;
    private double duration;
    private String repetition;
    private String deadline;
    private boolean completed;

    //costructor
    public ToDo() {
        this.name = "";
        this.time = "";
        this.date = "";
        this.duration = 0;
        this.repetition = "";
        this.deadline = "";
        this.completed = false;
    }
    // costructor override
    public ToDo(String name, String time, String date, String repetition, String deadline, double duration, boolean completed){
        this.name = name;
        this.time = time;
        this.date = date;
        this.deadline = deadline;
        this.duration = duration;
        this.repetition = repetition;
        this.completed = completed;
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
    public void setCompleted (boolean completed){
        this.completed = completed;
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
    public boolean getCompleted(){
        return completed;
    }

    // this boolean says that if the effective date = date or not completed, the houldShowToday = true. Otherwise do not return shouldShowToday
    public boolean shouldShowToday(String effectiveDate){
        if ((effectiveDate.equals(date)) || (!completed)) {
            return true;
        }
        return false;  
    }
        
}