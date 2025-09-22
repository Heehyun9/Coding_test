package Algorithm.example;

import java.io.*;
import java.util.*;

class _10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        int currentX = (p + t) % (2 * w);
        int currentY = (q + t) % (2 * h);

        if(currentX > w) currentX = 2 * w - currentX;
        if(currentY > h) currentY = 2 * h - currentY;

        System.out.println(currentX + " " + currentY);
    }
}
