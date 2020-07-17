package org.xrhm.mdsecurity.util.lang;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author xinruhuamu
 * @description Bean工具类，用于各类型转换
 * @date 2020/7/16 23:25
 */
public class BeanUtil {
    public Map<String, Object> toMap(Object source) {
        if (source == null) {
            return Collections.emptyMap();
        }

        HashMap<String, Object> map = new HashMap<>();
        Field[] fields = source.getClass().getDeclaredFields();

        Stream.of(fields).forEach(it -> {
            try {
                it.setAccessible(true);
                map.put(it.getName(), it.get(source));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        return map;
    }

    /**
     * @param source
     * @return
     */
    public Map<String, Object> toMapIgnoreNull(Object source) {
        if (source == null) {
            return Collections.emptyMap();
        }

        HashMap<String, Object> map = new HashMap<>();
        Field[] fields = source.getClass().getDeclaredFields();
        Stream.of(fields).forEach(it -> {
            try {
                it.setAccessible(true);
                String key = it.getName();
                Object value = it.get(source);
                if (value != null) {
                    map.put(key, value);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        return map;
    }

    /**
     * @param source
     * @param keys
     * @return
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     */
    public static Map<String, Object> put2Map(Object source, String... keys) throws NoSuchFieldException, IllegalAccessException {
        if (source == null) {
            return Collections.emptyMap();
        }

        HashMap<String, Object> map = new HashMap<>();
        for (String key : keys) {
            Field field = source.getClass().getDeclaredField(key);
            field.setAccessible(true);
            map.put(key, field.get(source));
        }

        return map;
    }

    public static BeanUtil getBeanUtil(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return BeanUtil.class.getConstructor().newInstance();
    }
}
