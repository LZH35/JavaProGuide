package org.codeman.empty;

import org.apache.commons.lang3.ObjectUtils;

import java.util.List;
import java.util.Objects;

/**
 * @author hdgaadd
 * created on 2022/07/10
 *
 * description: org.apache.commons.langs
 */
public class Empty {

    private static final List<Integer> list = List.of();

    public static void main(String[] args) {
        System.out.println(Objects.isNull(list));
        System.out.println(ObjectUtils.isEmpty(list));
        System.out.println(ObjectUtils.isNotEmpty(list));
    }
}
