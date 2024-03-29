package com.prefect.office.record.management.data.dao.prefect.offense;

import com.prefect.office.record.management.appl.model.offense.Offense;

import java.util.List;

public interface OffenseDao {
    List<Offense> getAllOffenses();
    Offense getOffenseByID (int id);
    boolean updateOffense (Offense offense);

    boolean addOffense(Offense offense);
}
