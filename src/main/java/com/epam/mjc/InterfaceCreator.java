package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> result = new ArrayList<>(x);
            for (int i = 0; i < result.size(); i++) {
                result.set(i, result.get(i) / divider);
            }

            return result;
        };
    }
}
