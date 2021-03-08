package crackthecode.models;

public class CTC {

    private int id;
    private String guess;
    private int guessNum;
    private boolean finished;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getGuess(){
        return guess;
    }

    public void setGuess(String guess){
        this.guess = this.guess;
    }

    public boolean isFinished(){
        return finished;
    }

    public void setFinished(boolean finished){
        this.finished = finished;
    }
}
