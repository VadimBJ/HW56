import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FindNumber {
  public static int findNumberInList(List<Integer> list, int target) {
    if (list instanceof LinkedList<Integer> intList) {
      return arrayListCase(linkedListCase(intList), target);
    }
    return arrayListCase(list, target);
  }

  public static int arrayListCase(List<Integer> list, int target) {
    System.out.println("1");
    int left = 0;
    int right = list.size() - 1;
    int mid = (right - left) / 2;
    while (left < right) {
      int number = list.get(mid);
      if (number == target) return mid;
      if (number < target) {
        right = mid;
      } else left = mid;
    }
    return -1;
  }

  public static ArrayList<Integer> linkedListCase(LinkedList<Integer> list) {
    return new ArrayList<>(list);
  }
}
