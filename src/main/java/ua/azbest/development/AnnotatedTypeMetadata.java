package ua.azbest.development;

import org.springframework.util.MultiValueMap;

import java.util.Map;

public interface AnnotatedTypeMetadata {
    boolean isAnnotated(String annotationType);
    Map<String, Object> getAnnotationAttributes(String annotationType);
    Map<String, Object> getAnnotationAttributes(
            String annotationType, boolean classValuesAsString);
    MultiValueMap<String, Object> getAllAnnotationAttributes(
            String annotationType);
    MultiValueMap<String, Object> getAllAnnotationAttributes(
            String annotationType, boolean classValuesAsString);
}
