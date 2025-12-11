class Quiz{
    private int qno;
    private String question;
    private String op1,op2,op3,op4,answer;

    public Quiz(int qno,String question,String op1,String op2,String op3,String op4,String answer){
        this.qno = qno;
        this.question = question;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer = answer;
    }

    public int getQno(){
        return qno;
    }
    public String getQuestion(){
        return question;
    }
    public String getOp1(){
        return op1;
    }
    public String getOp2(){
        return op2;
    }
    public String getOp3(){
        return op3;
    }
    public String getOp4(){
        return op4;
    }
    public String getAnswer(){
        return answer;
    }

    public void logic(){

    }

}