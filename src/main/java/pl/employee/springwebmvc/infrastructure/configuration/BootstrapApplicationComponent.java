package pl.employee.springwebmvc.infrastructure.configuration;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.employee.springwebmvc.infrastructure.database.entity.EmployeeEntity;
import pl.employee.springwebmvc.infrastructure.database.repository.EmployeeRepository;

import java.math.BigDecimal;

@Configuration(proxyBeanMethods = false)
@Slf4j
@Component
@AllArgsConstructor
public class BootstrapApplicationComponent implements ApplicationListener<ContextRefreshedEvent> {

    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public void onApplicationEvent(final @NonNull ContextRefreshedEvent event) {
        employeeRepository.deleteAll();

        employeeRepository.save(EmployeeEntity.builder()
                .name("Stefan")
                .surname("Jackson")
                .salary(new BigDecimal("52322.00"))
                .build());
        employeeRepository.save(EmployeeEntity.builder()
                .name("Agnieszka")
                .surname("Spring")
                .salary(new BigDecimal("62341.00"))
                .build());
        employeeRepository.save(EmployeeEntity.builder()
                .name("Tomasz")
                .surname("Hibernate")
                .salary(new BigDecimal("53231.00"))
                .build());
    }
}
