package com.prefect.office.record.management.data.utils;

/**
 * Inside the QueryConstants class contains constants representing SQL queries for managing prefect office system.
 */

public class QueryConstants {

    /**
     * SQL query to retrieves all employees from the database.
     */
    public static final String GET_ALL_CS_STATEMENT = "SELECT * FROM comm_serv_rendered";

    /**
     * SQL query to retrieves an CS by their Student Number from the database.
     */
    public static final String GET_CS_BY_ID_STATEMENT = "SELECT * FROM comm_serv_rendered WHERE id = ?";

    /**
     * SQL query to render the CS to the database.
     */
    public static final String RENDER_CS_STATEMENT = "UPDATE comm_serv_rendered SET student_id = ?, date_rendered = ?, hours_rendered = ? WHERE id = ?";


    /**
     * SQL query to retrieves all offenses from the database.
     */
    public static final String GET_ALL_OFFENSES_STATEMENT = "SELECT * FROM offense";

    /**
     * SQL query to retrieves an Offense by their Student Number from the database.
     */
    public static final String GET_OFFENSE_BY_ID_STATEMENT = "SELECT * FROM offense WHERE id = ?";

    /**
     * SQL query to updates an existing offense in the database.
     */
    public static final String UPDATE_OFFENSE_STATEMENT = "UPDATE offense SET violation_id = ?, student_id = ?, offense_date = ? WHERE id = ?";

    /**
     * SQL query that adds a new offense to the database.
     */
    public static final String ADD_OFFENSE_STATEMENT = "INSERT INTO offense (violation_id, student_id, offense_date) VALUES (?, ?, ?)";


    /**
     * SQL query that adds a new violation to the database.
     */
    public static final String ADD_VIOLATION_STATEMENT = "INSERT INTO violation (violation, type, comm_serv_hours) VALUES (?, ?, ?)";

    /**
     * SQL query to retrieves all violation from the database.
     */
    public static final String GET_ALL_VIOLATION_STATEMENT = "SELECT * FROM violation";
}