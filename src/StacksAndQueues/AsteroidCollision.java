package StacksAndQueues;
import java.util.*;

public class AsteroidCollision {

    public static List<Integer> asteroidCollision(int[] asteroid){
          int n = asteroid.length;
          List<Integer> st = new ArrayList<>();
          for (int i = 0; i < n; i++){
              if (asteroid[i] >= 0){
                  st.add(asteroid[i]);
              }
              else{
                  while(!st.isEmpty() && st.get(st.size() - 1) > 0 && st.get(st.size() - 1) < Math.abs(asteroid[i])){
                      st.remove(st.size() - 1);
                  }

                  if(!st.isEmpty() && st.get(st.size() - 1) == Math.abs(asteroid[i])){
                      st.remove(st.size() - 1);
                  }

                  else if (st.isEmpty() || st.get(st.size() - 1) < 0){
                      st.add(asteroid[i]);
                  }
              }
          }

          return st;
    }
}
