package objects;

public class GameBoard{

    public GameBoard(){
    }

    private String[] question = {"is yellow a color?", "what is the best flavor of paint?", "what is love?"};

    public String getQuestion(int i) {
        return question[i];
    }

    private String[] answer = {"no", "robin's egg blue", "baby don't hurt me"};

    public String getAnswer(int i){
        return answer[i];
    }



    // Put your code for the GameBoard object here
    // This could be stuff like questions, players, or points
}