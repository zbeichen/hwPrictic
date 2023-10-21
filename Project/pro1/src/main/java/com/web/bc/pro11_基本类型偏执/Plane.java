package com.web.bc.pro11_基本类型偏执;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Plane {
    private final Logger logger = Logger.getLogger("Plane");

    public static void main(String[] args) {
        List<int[]> airLine = new ArrayList<>();
        int[] a1 = new int[]{43,24};
        int[] a2 = new int[]{11,53};
        int[] a3 = new int[]{14,67};
        airLine.add(a1);
        airLine.add(a2);
        airLine.add(a3);
        new Plane().fly(airLine, "domestic");
    }

    public void fly(List<int[]> airLine, String airLineType) {
        for (int[] coordinate : airLine) {
            if (coordinate.length != 2) {
                throw new IllegalArgumentException("xxxxx");
            }
            if ("domestic".equals(airLineType)) { // 国内航班
                if (coordinate[0] < 0 || coordinate[0] >= 100) {
                    throw new IllegalArgumentException("xxxxx");
                }
                if (coordinate[1] < 0 || coordinate[1] >= 100) {
                    throw new IllegalArgumentException("xxxxx");
                }
            }
            if ("international".equals(airLineType)) { // 国际航班
                if (coordinate[0] < 100) {
                    throw new IllegalArgumentException("xxxxx");
                }
                if (coordinate[1] < 100) {
                    throw new IllegalArgumentException("xxxxx");
                }
            }
        }
        airLine.forEach(this::fly);
    }

    private  void fly(int[] coordinate) {
        logger.info(MessageFormat.format("Fly to ({0},{1})", coordinate[0], coordinate[1]));
    }
}
