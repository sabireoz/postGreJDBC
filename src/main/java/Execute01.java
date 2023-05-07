
import java.sql.*;

public class Execute01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//1)DRIVER I TANIMLA
        Class.forName("org.postgresql.Driver");
//2)DATABASE E BAGLAN
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","bu1sifre.");

       //3)STATEMENT
        Statement st = con.createStatement();

        System.out.println ("Connection Success");
        ResultSet veri=st.executeQuery("select * from ogrenciler");

        while (veri.next()){
            System.out.println(veri.getInt(1)
            +veri.getString(2)
            +veri.getString(3)
            +veri.getString(4));
        }
        //baglantilri kapatma
        con.close();
        st.close();
        veri.close();
    }

}
