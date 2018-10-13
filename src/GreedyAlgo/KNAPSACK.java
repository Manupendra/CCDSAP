package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class KNAPSACK {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        int m = 0;    //sum of all the weight
        KnapsackObject k[] = new KnapsackObject[n];
        //Take input and initialise the knapsack object
        for (int i = 0; i < n; i++) {
            int w = br.read();
            int c = br.read();
            k[i] = new KnapsackObject(w, c);
            m += c;
        }

        //sort the knapsack object and we are being greedy about the ratio of cost/weight



        System.out.println(s);
    }
}

class KnapsackObject {
    int weight;
    int cost;

    public KnapsackObject(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public double getRatio(){
        return cost/weight;
    }

}
