public class remainPopulation {
  public static void main(String[] args) {
    int sum=312032486;
    double birth=1.0/7,dead=1.0/13,move=1.0/45;
    int year=365*24*60*60;
    int firstYear=(int)(sum+year*birth-year*dead+year*move);
    int secondYear=(int)(firstYear+year*birth-year*dead+year*move);
    int thirdYear=(int)(secondYear+year*birth-year*dead+year*move);
    int fourthYear=(int)(thirdYear+year*birth-year*dead+year*move);
    int fifthYear=(int)(fourthYear+year*birth-year*dead+year*move);
    System.out.println("First yaer:"+firstYear);
    System.out.println("Second year:"+secondYear);
    System.out.println("Third yaer:"+thirdYear);
    System.out.println("Fourth yaer:"+fourthYear);
    System.out.println("Fifth yaer:"+fifthYear);
  }
}