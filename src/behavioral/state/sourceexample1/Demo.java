package behavioral.state.sourceexample1;

import behavioral.state.sourceexample1.context.CeilingFanPullChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();

        while (true) {
            System.out.println("Press ENTER");
            getLine();
            chain.pull();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return line;
    }
}
