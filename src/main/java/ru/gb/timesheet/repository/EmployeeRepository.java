package ru.gb.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.timesheet.model.Timesheet;

public interface EmployeeRepository extends JpaRepository<Timesheet, Long> {
}
