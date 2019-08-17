package JavaConcurrent.test;

import java.sql.*;

/**
 * @author KiroScarlet
 * @date 2019-08-15  -21:24
 * @title JDBCtransaction
 * @project MyBookCodes
 * @desc JDBC事务的测试
 */
public class JDBCtransaction {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/miaosha";
    private static String USER = "root";
    private static String PASS = "123456";

    public static void main(String[] args) throws SQLException {
        test();
    }

    public static void test() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {


            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            //开启事务，禁止自动提交
            connection.setAutoCommit(false);

            String sql = "UPDATE user_info SET age =10123 WHERE telphone =111111";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

            sql = "UPDATE useriiiiii";
            statement.executeUpdate(sql);

            //执行成功，提交事务
            connection.commit();

        } catch (SQLException e) {

            //发生异常，事务回滚
            connection.rollback();
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }
}
