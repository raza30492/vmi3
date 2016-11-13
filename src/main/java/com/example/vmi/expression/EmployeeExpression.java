package com.example.vmi.expression;

import com.example.vmi.entity.QEmployee;
import com.querydsl.core.types.dsl.BooleanExpression;

public class EmployeeExpression {

    private EmployeeExpression() {}

    public static BooleanExpression hasEmail(String email){
        return QEmployee.employee.email.eq(email);
    }
    
    public static BooleanExpression hasPassword(String password){
        return QEmployee.employee.password.eq(password);
    }
}
