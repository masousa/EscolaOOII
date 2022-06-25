package br.com.letscode.eightfortyfive.ooii.utils;

import java.util.List;

public class GetFromIndex {

    public static <T> T fromList(List<T> list, int index) {
        index--;
        return list.get(index);
    }
}
