package pl.employee.springwebmvc.controller;


import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import pl.employee.springwebmvc.infrastructure.database.repository.EmployeeRepository;

@WebMvcTest(controllers = EmployeesController.class)
@AllArgsConstructor(onConstructor = @__(@Autowired))
class EmployeeControllerMvcTest {


    private MockMvc mockMvc;

    @MockBean
    private EmployeeRepository employeeRepository;


    @Test
    void someAntoherInegrationTestForWebMvcc() {
        //given

        //when

        //then

    }
}
