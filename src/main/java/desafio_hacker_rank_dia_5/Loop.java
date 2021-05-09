package desafio_hacker_rank_dia_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Loop {
    private Loop() {
    }

    /**
     * 
     * @author Felipi Santana
     * @since 07/05/2021
     * 
     */

     public static class Calculator{
        
        private int number;

        public Calculator(int n){
            this.number = n;
        }

        public int getNumber(){
            return this.number;
        }

        public void setNumber(int n){
            this.number = n;
        }

        //Overriding the toString method
        public String toString(){
            String listString = "";
            for (int i=1; i < 11; i++){
                listString += Integer.toString(this.getNumber()) + 
                " x " + Integer.toString(i) + 
                " = " + Integer.toString(this.getNumber()*i)+"\n";
            }
            return listString;
        }
     }

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Calculator multiple = new Calculator(n);
        System.out.println(multiple.toString());

        bufferedReader.close();
    }
}
