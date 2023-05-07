import java.sql.*;

public class query02 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("org.postgresql.Driver");
//2)DATABASE E BAGLAN
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","bu1sifre.");

        //3)STATEMENT
        Statement st = con.createStatement();
//Region id si 1 olan 'country name 'degerlerini cagirin

        String sql01="select country_name from countries where region_id=1";

        //4 ResultSet
        ResultSet veri = st.executeQuery(String.valueOf(02));
        while (veri.next()){
            System.out.println(veri.getString(1));
        }

    }
}
