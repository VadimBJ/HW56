import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    List<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }
    Collections.sort(numbers);
    Collections.reverse(numbers);
    System.out.println(numbers);

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Результат: " + FindNumber.findNumberInList(numbers, target));
  }
}
