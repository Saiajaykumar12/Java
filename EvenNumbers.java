class EvenNumbers{
    public static void main(String[] args) {
        int n = 50;
        int i = 0;
        int count = 0;
        while(i<=50){
            if(i % 2 == 0){
                System.out.println(i);
                count++;
            }
            i++;  
        }
        System.err.println(count);
    }
}