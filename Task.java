public class Task {
    //instance variables
    String title;
    boolean isdone;

    //constructor 
    public Task(String title){
        this.title=title;
        this.isdone=false;
    }
    //mark task as done
    public void markdone(){
        this.isdone=true;
    }
    public void displaytask(int index){
        System.out.println(index + ". " + title + " [" + (isdone ? "Done" : "pending" ) + "]");
    }

}