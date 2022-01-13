package de.bs.jdbc.exercise.custom;

import de.bs.jdbc.util.MYSQLManager;

import java.sql.Connection;

/**
 * exercise 3. print
 */

public class jdbc03Connect {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = MYSQLManager.getSession();
            MYSQLManager.View.print(MYSQLManager.Statements.query("desc LIEFERANT"));
            MYSQLManager.View.print(MYSQLManager.Statements.query("SELECT * FROM LIEFERANT ORDER BY id DESC"));
        } catch (Exception e) { e.printStackTrace(); }
        finally { MYSQLManager.close(); }
    }
}
