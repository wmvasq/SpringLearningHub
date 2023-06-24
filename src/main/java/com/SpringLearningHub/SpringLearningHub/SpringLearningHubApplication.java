package com.SpringLearningHub.SpringLearningHub;

import com.SpringLearningHub.rest.Controller;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class SpringLearningHubApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringLearningHubApplication.class, args);
  }

  //decryptor method
  public String decryptor(String token) {
    String[] arr = token.split("[,: ]");
    String str = "";
    // create custom comparator 
    Comparator<String> sumComparator = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        int sum1 = Arrays
          .stream(s1.split(""))
          .filter(c -> c.matches("\\d")) // numbers filter
          .mapToInt(Integer::parseInt)
          .sum();
        int sum2 = Arrays
          .stream(s2.split(""))
          .filter(c -> c.matches("\\d")) // Fnumbers filter
          .mapToInt(Integer::parseInt)
          .sum();
        return Integer.compare(sum1, sum2);
      }
    };

    // sort 
    Arrays.sort(arr, sumComparator);

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].replaceAll("\\d", "");
      if (i == arr.length - 1) {
        str = str + arr[i];
      } else {
        str = str + arr[i] + " ";
      }
    }
    return str;
  }
}
