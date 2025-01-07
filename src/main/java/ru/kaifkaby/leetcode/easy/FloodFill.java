package ru.kaifkaby.leetcode.easy;

import ru.kaifkaby.leetcode.common.Point;

import java.util.HashSet;
import java.util.Set;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        Point.setMaxX(image.length - 1);
        Point.setMaxY(image[0].length - 1);

        int oldColor = image[sr][sc];
        image[sr][sc] = color;

        Set<Point> floodFill = new HashSet<>();
        floodFill.add(new Point(sr, sc));

        do {
            floodFill = floodFill(image, floodFill, oldColor, color);
        } while (!floodFill.isEmpty());

        return image;
    }

    private Set<Point> floodFill(int[][] image, Set<Point> points, int oldColor, int color) {
        HashSet<Point> floodFill = new HashSet<>();
        for (Point point : points) {
            for (Point neighbour : point.neighbours(Point.NeighbourType.HORIZONTAL_VERTICAL)) {
                if (image[neighbour.x()][neighbour.y()] == oldColor) {
                    image[neighbour.x()][neighbour.y()] = color;
                    floodFill.add(neighbour);
                }
            }
        }
        return floodFill;
    }
}
