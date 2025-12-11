import java.util.Scanner;

class QuizService{
    Scanner sc = new Scanner(System.in);
    Quiz[] q = new Quiz[5];
    String[] selected = new String[5];
    public QuizService(){
       q[0] = new Quiz(1,"What is the capital of France?","Berlin","Madrid","Paris","Rome","Paris");
       q[1] = new Quiz(2,"What is 2 + 2?","3","4","5","6","4");
       q[2] = new Quiz(3,"What is the largest planet in our solar  system?","Earth","Mars","Jupiter","Saturn","Jupiter");  
        q[3] = new Quiz(4,"Who wrote 'Hamlet'?","Charles Dickens","William Shakespeare","Mark Twain","Jane Austen","William Shakespeare") ;
         q[4] = new Quiz(5,"What is the boiling point of water?","90°C","100°C","110°C","120°C","100°C");
    }
    public void playQuiz(){
        int i = 0;
        for(Quiz qz : q){
            System.out.println(qz.getQno()+") "+qz.getQuestion());
            System.out.println(qz.getOp1());
            System.out.println(qz.getOp2());
            System.out.println(qz.getOp3());
            System.out.println(qz.getOp4());
            selected[i] = sc.nextLine();
            i++;
        }

        // display scores
        int score = 0;
        for(int j=0;j<=q.length-1;j++){
            String admin_answer = q[j].getAnswer();
            String user_answer = selected[j];

            if(user_answer.equals(admin_answer)){
                score++;
            }
        }
        System.out.println("Your score is: "+score+"/"+q.length);
    }
}