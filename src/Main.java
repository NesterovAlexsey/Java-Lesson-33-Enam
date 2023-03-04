import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  enum Month {
    UNKNOWN, // неизвестный месяц
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }

  enum Season { // ВремяГода
    WINTER, // ЗИМА
    SPRING, // ВЕСНА
    SUMMER, // ЛЕТО
    FALL, // ОСЕНЬ // AUTUMN - GB, FALL - US
  }

  public static Month readMonth() throws IOException {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter the month name: ");
    String month = read.readLine();

    try {
      return Month.valueOf(month.toUpperCase());
    } catch (IllegalArgumentException e) {
      return Month.UNKNOWN;
    }
  }

  public static void main(String[] args) {

  }
}