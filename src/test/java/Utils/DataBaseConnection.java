package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataBaseConnection{

    public static String URL =//"jdbc:sqlserver://TV4-SQL-01\\INSTANCE1;Initial Catalog=CG_T_DB_DEBICHECK;Integrated Security=true;encrypt=false;trustServerCertificate=true;";
            "jdbc:sqlserver://CG-T-SQL-07V\\INSTANCE1;" +
                    "databaseName=CG_T_DB_DEBICHECK;" +
                    "encrypt=false;" +
                    "trustServerCertificate=true;";

    public static String USERNAME = "CLIENTELE\\Mnyinyi";
    public static final String PASSWORD = "Billings123$";

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void getMandatesByPolicyReference(String policyReferenceNumber) {

        String sql = """
                SELECT *
                FROM Mandates m
                INNER JOIN PolicyReference pr
                    ON m.PolicyReferenceId = pr.Id
                WHERE pr.PolicyReferenceNumber = ?
                ORDER BY m.Id DESC
                """;

        try (
                Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, policyReferenceNumber);

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {

                    System.out.println("Mandate Id: " + rs.getLong("Id"));
                    System.out.println("Policy Reference Number: "
                            + rs.getString("PolicyReferenceNumber"));

                    // Add other columns as needed
                    System.out.println("connect please ");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getMandatesByPolicyReference("6675357766");
    }
}