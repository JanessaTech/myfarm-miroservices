package com.farm.common.validation;

import com.github.pagehelper.util.StringUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.UUID;

public class MultipleUUIDValidator implements ConstraintValidator<MultipleUUIDValueValidator, String> {
    private String message;
    private boolean isAllowEmpty;
    @Override
    public void initialize(MultipleUUIDValueValidator constraintAnnotation) {
        this.message = constraintAnnotation.message();
        this.isAllowEmpty = constraintAnnotation.isAllowEmpty();
    }

    @Override
    public boolean isValid(String uuids, ConstraintValidatorContext context) {
        if(isAllowEmpty){
            if(StringUtil.isEmpty(uuids))
                return Boolean.TRUE;
        }else{
            if(StringUtil.isEmpty(uuids))
                return Boolean.FALSE;
        }

        String[] uuidArr = uuids.split(",");
        try{
            for(String uuid : uuidArr){
                UUID.fromString(uuid);
            }
        }catch(Exception ex){
            //ex.printStackTrace();
            return false;
        }


        return true;
    }
}
