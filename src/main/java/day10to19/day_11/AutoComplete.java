package day10to19.day_11;

public class AutoComplete {
    public static void main(String[] args) {
        String[] input={"manohar","manu","yaseen","Rajesh","yash","thiru","balu"};
        String queryString="ma";
        autocomplete(input, queryString);
    }

    private static void autocomplete(String[] input, String queryString) {
        for(int i = 0; i< input.length; i++){
            if(input[i].contains(queryString)){
                System.out.println(input[i]);
            }
        }
    }
}
