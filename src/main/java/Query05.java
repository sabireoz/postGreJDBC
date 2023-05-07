import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        //2)DATABASE E BAGLAN
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","bu1sifre.");

        //3)STATEMENT
        Statement st = con.createStatement();
//soru ogrenciler tablosuna yeni bir kayit ekleyin (300,'Sena Can',12,'K')
        String sql01="insert into ogrenciler values(300,'Sena Can',12,'K')";
 //st.executeUpdate(01);
//soru ;ogrenciler tablosuna birden fazla veri ekleyiniz.
        System.out.println(""+ "satir datbase ekklendi");
        //(400,'Sena Can',12,'K'),(401,'Sena Can',12,'K'),(403,'Sena Can',12,'K')




    }

}
