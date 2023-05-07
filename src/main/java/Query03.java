import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Query03 {




            public static void main(String[] args) throws ClassNotFoundException, SQLException {

                Class.forName("org.postgresql.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/jdbc",
                        "postgres",
                        "bu1sifre.");

                Statement st = (Statement) con.createStatement();

                //"workers" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.


              // String sql01=" create table workers(worker_id int,worker_name varchar(20),worker_salary int)";


              // st.execute(sql01);

               //tabloya workers_address sutunu ekleyelim

              //  String sql02="Alter table workers add worker_address varchar(50)";
                //st.execute(sql02);

                //soru workers tablosunu silelim.
               // String sql03="drop table workers";
               // st.execute(sql03);
                //execute -create,drop,alter table==DDL icin kullanilir.
                //select icinde executeqery kullaniyoruz
                //veri cekeceksek resultset kullaniyoruz..

                con.close();

            }

        }
