package com.farm.common.validation;

import com.github.pagehelper.util.StringUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.UUID;

public class UUIDValidator implements ConstraintValidator<UUIDValueValidator, String> {
    private String message;
    private boolean isAllowEmpty;
    @Override
    public void initialize(UUIDValueValidator constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.isAllowEmpty = constraintAnnotation.isAllowEmpty();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(isAllowEmpty){
            if(StringUtil.isEmpty(value))
                return true;
        }else{
            if(StringUtil.isEmpty(value))
                return false;
        }

        try{
            UUID.fromString(value);
            return true;
        }catch (IllegalArgumentException ex){
            return false;
        }
    }
}

