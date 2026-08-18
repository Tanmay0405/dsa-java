class fristUpper{
    public static void main(String[] args) {
        String str = "geeksforGeeKS";
        char res = first(str,0);
        if (res == ' ')
            System.out.println("No uppercase letter");
        else
            System.out.println (res );
    }
    private static char first(String s,int c){
        if(c>=s.length()){
            return ' ';
        }
        char x=s.charAt(c);
        if(Character.isUpperCase(x)){
            return x;
        }
        return first(s,c+1);
    }
}