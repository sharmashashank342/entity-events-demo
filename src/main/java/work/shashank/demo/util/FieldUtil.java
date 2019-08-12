package work.shashank.demo.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldUtil {

    public static String getAnnotatedFieldValue(Object object, Class<? extends Annotation> annotationClass) {

        try {
            for (Field field: object.getClass().getDeclaredFields()) {
                if (field.isAnnotationPresent(annotationClass)) {
                    field.setAccessible(true);
                    return field.get(object).toString();
                }
            }
        }catch (Exception e) {
            // Ignored
        }

        return null;
    }
}
