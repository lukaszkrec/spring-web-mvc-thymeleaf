package pl.employee.springwebmvc.util;

import pl.employee.springwebmvc.infrastructure.database.entity.EmployeeEntity;

import java.math.BigDecimal;

public class EntityFixtures {

    public static EmployeeEntity someEmployee1() {
        return EmployeeEntity.builder()
                .name("Leszek")
                .surname("Piesek")
                .salary(new BigDecimal("45141.32"))
                .build();
    }
}
