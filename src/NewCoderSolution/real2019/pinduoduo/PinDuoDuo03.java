package NewCoderSolution.real2019.pinduoduo;

import java.util.*;

/**
 * @author KiroScarlet
 * @date 2019-05-06  -20:08
 */

class Line {
    int left;
    int right;

    public Line(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Line{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
public class PinDuoDuo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Line> lines = new ArrayList<>(k);
        for (int i = 0; i < n; i++) {
            Line newLine = new Line(scanner.nextInt(), scanner.nextInt());
            lines.add(newLine);
        }


        Collections.sort(lines,new  Comparator<Line>() {
            @Override
            public int compare(Line o1, Line o2) {
                return o1.left - o2.left;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(lines.get(i).toString());
        }

        int count = 0;
        int isleft = 0;
        ArrayList<Line> result = new ArrayList<>();
        for (int i = lines.get(0).left; i < lines.get(lines.size() - 1).left; i++) {
            for (Line line : lines) {
                if (i == line.left) {
                    count++;
                }
                if (i == line.right) {
                    count--;
                }

            }

        }

    }
}
