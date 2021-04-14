package com.farm.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Method;

public class EnumValidator implements ConstraintValidator<EnumValueValidator, String> {
    private Class<? extends Enum<?>> enumClass;
    private String enumMethod = "valueOf";
    private boolean isAllowEmpty;
    @Override
    public void initialize(EnumValueValidator constraintAnnotation) {
        this.enumClass = constraintAnnotation.enumClass();
        this.isAllowEmpty = constraintAnnotation.isAllowEmpty();

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(isAllowEmpty){
            if(value == null)
                return true;
        }else{
            if(value == null)
                return false;
        }

        Class<?> valueClass = value.getClass();

        try {
            Method method = enumClass.getMethod(enumMethod, valueClass);
            Object result = method.invoke(null, value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

