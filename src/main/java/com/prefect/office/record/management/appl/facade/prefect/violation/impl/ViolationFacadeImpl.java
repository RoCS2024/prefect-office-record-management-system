package com.prefect.office.record.management.appl.facade.prefect.violation.impl;

import com.prefect.office.record.management.appl.facade.prefect.violation.ViolationFacade;
import com.prefect.office.record.management.appl.model.violation.Violation;
import com.prefect.office.record.management.data.dao.prefect.violation.ViolationDao;
import com.prefect.office.record.management.data.dao.prefect.violation.impl.ViolationDaoImpl;

import java.util.List;


public class ViolationFacadeImpl implements ViolationFacade {
    private ViolationDao violationDAO;

    public ViolationFacadeImpl() {
        this.violationDAO = new ViolationDaoImpl();
    }

    @Override
    public void addViolation(String violation, String type, int commServHours) {
        try {
        Violation newViolation = new Violation(violation, type, commServHours);
        violationDAO.addViolation(newViolation);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add violation: " + e.getMessage(), e);
    }
}

    @Override
    public List<Violation> getAllViolation() {
        return violationDAO.getAllViolation();
    }
}