public class RandomCharacter {
    public static void main(String[] args) {
        char CH1=getRandomUpperCaseLetter();
        char CH2=getRandomUpperCaseLetter();
        char ch1=getRandomLowerCaseLetter();
        char ch2=getRandomLowerCaseLetter();
        char CH=getRandomCharacter(CH1, CH2);
        char ch=getRandomCharacter(ch1, ch2);
        System.out.println("The twp Random Upper Letters are "+CH1+" and "+CH2+".The Random Letter between "+CH1+" and "+CH2+" is "+CH+".The two Random Lower Letters are "+ch1+" and "+ch2+".The Random Letter between "+ch1+" and "+ch2+" is "+ch);
    }
    public static char getRandomCharacter(char ch1,char ch2){
        return(char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }
}
