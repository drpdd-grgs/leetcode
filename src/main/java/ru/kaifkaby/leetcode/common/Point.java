package ru.kaifkaby.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public record Point(int x, int y) {

    private static int maxX = Integer.MAX_VALUE;
    private static int maxY = Integer.MAX_VALUE;

    public static void setMaxX(int x) {
        maxX = x;
    }

    public static void setMaxY(int y) {
        maxY = y;
    }

    public List<Point> neighbours(NeighbourType neighbourType) {
        ArrayList<Point> points = new ArrayList<>();
        int x, y;
        for (int[] offset : neighbourType.offsets()) {
            x = this.x + offset[0];
            y = this.y + offset[1];
            if (validate(x, y)) {
                points.add(new Point(x, y));
            }
        }
        return points;
    }

    private boolean validate(int x, int y) {
        return x >= 0 && x <= maxX
                && y >= 0 && y <= maxY;
    }

    public enum NeighbourType {

        ALL_NEARBY(new int[][]{
                {-1, -1}, {0, -1}, {1, -1},
                {-1, 0}, {1, 0},
                {-1, 1}, {0, 1}, {1, 1},
        }),
        HORIZONTAL_VERTICAL(new int[][]{
                {0, -1},
                {-1, 0}, {1, 0},
                {0, 1}
        });

        private final int[][] offsets;

        NeighbourType(int[][] offsets) {
            this.offsets = offsets;
        }

        public int[][] offsets() {
            return offsets;
        }
    }
}
