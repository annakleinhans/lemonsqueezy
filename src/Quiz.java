public class Quiz {
    public String [] question = new String[10];
    public int[] answer = new int[10];
    public String name;

    public Quiz(String name){

        makeQuestions();
    }

    public void makeQuestions(){
        question[0] = "How often do you eat in one day? 1 is very often, 5 is never.";
        question[1] = "How big are your meal portions? 1 is very large, 5 is very small.";
        question[2] = "How healthy are your meals? 1 is not healthy, 5 is very healthy.";
        question[3] = "How often do you eat vegetables with your meals? 1 is all the time, 5 is never.";
        question[4] = "How often do you eat dessert? 1 is all the time, 5 is never.";
        question[5] = "How often do you exercise? 1 is all the time, 5 is never.";
        question[6] = "How often do you see your doctor? 1 is never, 5 is every year.";
        question[7] = "How likely are you to change your diet? 1 is unlikely, 5 is very likely.";
        question[8] = "Do you smoke? 1 is habitually, 5 is never.";
        question[9] = "Are you vaccinated? 1 is no, not for anything. 5 is yes, completely.";
    }

    public int process() {
       int life = 0;
       for(int i = 0; i < answer.length; i++){
           life = life + answer[i];
       }
       return life;
    }

    public String evaluate(){
        String vida = "";
        int hi = process();
        if (hi > 0 && hi <= 10){
            vida = "You will die at 40. Good luck :/";
        }
        if (hi > 10 && hi <= 20){
            vida = "You will die at 50. Start your midlife crisis early.";
        }
        if (hi > 20 && hi <= 30){
            vida = "You will die at 60. Have fun meeting your grandchildren!";
        }
        if (hi > 30 && hi <= 40){
            vida = "You will die at 70. Enjoy retirement big fella.";
        }
        if (hi > 40 && hi <= 50){
            vida = "You will never die. Remember to never tell the US government and recreate your identity every 23.4 years.";
        }
        return vida;
    }


}

