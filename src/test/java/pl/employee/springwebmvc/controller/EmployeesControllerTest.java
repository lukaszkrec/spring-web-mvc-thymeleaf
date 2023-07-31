package pl.employee.springwebmvc.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ExtendedModelMap;
import pl.employee.springwebmvc.infrastructure.database.entity.EmployeeEntity;
import pl.employee.springwebmvc.infrastructure.database.repository.EmployeeRepository;
import pl.employee.springwebmvc.util.EntityFixtures;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class EmployeesControllerTest {

    @Mock
    EmployeeRepository employeeRepository;


    @InjectMocks
    EmployeesController employeesController;


    @Test
    void someTest() {
        //given
        Integer employeeId = 10;
        EmployeeEntity employeeEntity = EntityFixtures.someEmployee1();
        ExtendedModelMap model = new ExtendedModelMap();

        Mockito.when(employeeRepository.findById(employeeId)).thenReturn(Optional.of(employeeEntity));

        //when
        String result = employeesController.showEmployeeDetails(employeeId, model);

        //then
        Assertions.assertThat(result).isEqualTo("employeeDetails");
        Assertions.assertThat(model.getAttribute("employee")).isEqualTo(employeeEntity);

    }
}
