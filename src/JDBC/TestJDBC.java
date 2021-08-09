package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestJDBC {
	public static void main(String[] args) {
        
        /*//��ʼ������
        try {
            //������com.mysql.jdbc.Driver
            //���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("���ݿ��������سɹ� ��");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
  
            // ���������ݿ��Connection����
            // ������Ҫ�ṩ��
            // ���ݿ������ڵ�ip:127.0.0.1 (����)
            // ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
            // ���ݿ����� how2java
            // ���뷽ʽ UTF-8
            // �˺� root
            // ���� admin
  
            Connection c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "abc4598871033");
  
            //System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
            Statement s = c.createStatement();
            //System.out.println("��ȡ Statement���� " + s);
            String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
            s.execute(sql);
            System.out.println("ִ�в������ɹ�");
  
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*Connection c = null;
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
 
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root",
                    "abc4598871033");
 
            s = c.createStatement();
 
            String sql = "insert into hero values(null," + "'��Ī'" + "," + 313.0f + "," + 50 + ")";
 
            s.execute(sql);
 
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            // ���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
            // �ȹر�Statement
            if (s != null)
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // ��ر�Connection
            if (c != null)
                try {
                    c.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
 
        }
        
        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        try (
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin");
            Statement s = c.createStatement();             
        )
        {
            String sql = "insert into hero values(null," + "'��Ī'" + "," + 313.0f + "," + 50 + ")";
            s.execute(sql);
              
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                    "root",
                    "abc4598871033");
            Statement s = c.createStatement();
            StringBuilder mysql = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                s.addBatch(String.format("insert into hero values(null,'Ӣ��%d', 313, 50);",i+1));
            }
            s.executeBatch();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
		
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "abc4598871033"); Statement s = c.createStatement();) {
 
            String sql = "select * from hero";
 
            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// ����ʹ���ֶ���
                String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }
            // ��һ��Ҫ������ر�ReultSet����ΪStatement�رյ�ʱ�򣬻��Զ��ر�ResultSet
            // rs.close();
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		/*CREATE TABLE user (
  id int(11) AUTO_INCREMENT,
  name varchar(30) ,
  password varchar(30),
  PRIMARY KEY (id)
) ;
insert into user values(null,'dashen','thisispassword');*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "abc4598871033");
                Statement s = c.createStatement();
                 
                ) {
            String name = "dashen";
            //��ȷ�������ǣ�thisispassword
            String password = "thisispassword1";
   
            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";
              
            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
            ResultSet rs = s.executeQuery(sql);
              
            if(rs.next())
                System.out.println("�˺�������ȷ");
            else
                System.out.println("�˺��������");
             
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {
 
            String sql = "select count(*) from hero";
 
            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next()) {
                total = rs.getInt(1);
            }
 
            System.out.println("��Hero���ܹ���:" + total+" ������");
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            // ����sql��䴴��PreparedStatement
            PreparedStatement ps = c.prepareStatement(sql);
        ) {
             
            // ���ò���
            ps.setString(1, "��Ī");
            ps.setFloat(2, 313.0f);
            ps.setInt(3, 50);
            // ִ��
            ps.execute();
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();
            PreparedStatement ps = c.prepareStatement(sql);
        ) {
            // Statement��Ҫ�����ַ���ƴ�ӣ��ɶ��Ժ�ά���ԱȽϲ�
            String sql0 = "insert into hero values(null," + "'��Ī'" + "," + 313.0f + "," + 50 + ")";
            s.execute(sql0);
  
            // PreparedStatement ʹ�ò������ã��ɶ��Ժã����׷���
            // "insert into hero values(null,?,?,?)";
            ps.setString(1, "��Ī");
            ps.setFloat(2, 313.0f);
            ps.setInt(3, 50);
            ps.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
                Statement s = c.createStatement();
                PreparedStatement ps = c.prepareStatement(sql);
            ) {
            // Statementִ��10�Σ���Ҫ10�ΰ�SQL��䴫�䵽���ݿ��
            // ���ݿ�Ҫ��ÿһ������SQL�����б��봦��
            for (int i = 0; i < 10; i++) {
                String sql0 = "insert into hero values(null," + "'��Ī'" + ","
                        + 313.0f + "," + 50 + ")";
                s.execute(sql0);
            }
            s.close();
  
            // PreparedStatement ִ��10�Σ�ֻ��Ҫ1�ΰ�SQL��䴫�䵽���ݿ��
            // ���ݿ�Դ�?��SQL����Ԥ����
  
            // ÿ��ִ�У�ֻ��Ҫ������������ݿ��
            // 1. ���紫������Statement��С
            // 2. ���ݿⲻ��Ҫ�ٽ��б��룬��Ӧ����
            for (int i = 0; i < 10; i++) {
                ps.setString(1, "��Ī");
                ps.setFloat(2, 313.0f);
                ps.setInt(3, 50);
                ps.execute();
            }
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        String sql = "select * from hero where name = ?";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
                Statement s = c.createStatement();
            PreparedStatement ps = c.prepareStatement(sql);
        ) {
            // ����name���û��ύ��������
            String name = "'����' OR 1=1";
            String sql0 = "select * from hero where name = " + name;
            // ƴ�ӳ�����SQL������
            // select * from hero where name = '����' OR 1=1
            // ��Ϊ��OR 1=1�����Ժ����
            // ��ô�ͻ�����е�Ӣ�۶������������ֻ�Ǹ���
            // ���Hero����������Ǻ����ģ����缸����������������������ȫ�������
            // �������ݿ⸺�ر�ߣ�CPU100%���ڴ����Ĺ⣬��Ӧ��ü��仺��
            System.out.println(sql0);
  
            ResultSet rs0 = s.executeQuery(sql0);
            while (rs0.next()) {
                String heroName = rs0.getString("name");
                System.out.println(heroName);
            }
  
            s.execute(sql0);
  
            // ʹ��Ԥ����Statement�Ϳ��Զž�SQLע��
  
            ps.setString(1, name);
  
            ResultSet rs = ps.executeQuery();
            // �鲻�����ݳ���
            while (rs.next()) {
                String heroName = rs.getString("name");
                System.out.println(heroName);
            }
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();) {
 
            String sqlInsert = "insert into Hero values (null,'����',616,100)";
            String sqlDelete = "delete from Hero where id = 100";
            String sqlUpdate = "update Hero set hp = 300 where id = 100";
 
            // ��ͬ�㣺������ִ�����ӣ�ɾ�����޸�
 
            s.execute(sqlInsert);
            s.execute(sqlDelete);
            s.execute(sqlUpdate);
            s.executeUpdate(sqlInsert);
            s.executeUpdate(sqlDelete);
            s.executeUpdate(sqlUpdate);
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 */
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();) {
  
            // ��ͬ1��execute����ִ�в�ѯ���
            // Ȼ��ͨ��getResultSet���ѽ����ȡ����
            String sqlSelect = "select * from hero";
  
            s.execute(sqlSelect);
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
            }
  
            // executeUpdate����ִ�в�ѯ���
            // s.executeUpdate(sqlSelect);
  
            // ��ͬ2:
            // execute����boolean���ͣ�true��ʾִ�е��ǲ�ѯ��䣬false��ʾִ�е���insert,delete,update�ȵ�
            boolean isSelect = s.execute(sqlSelect);
            System.out.println(isSelect);
  
            // executeUpdate���ص���int����ʾ�ж����������ܵ���Ӱ��
            String sqlUpdate = "update Hero set hp = 300 where id < 100";
            int number = s.executeUpdate(sqlUpdate);
            System.out.println(number);
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
         String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
                PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);          
                ) {
  
            ps.setString(1, "����");
            ps.setFloat(2, 616);
            ps.setInt(3, 100);
   
            // ִ�в������
            ps.execute();
   
            // ��ִ�����������MySQL��Ϊ�²�������ݷ���һ��������id
            // JDBCͨ��getGeneratedKeys��ȡ��id
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println(id);
            }
   
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");) {
  
            // �鿴���ݿ�����Ԫ����
            // �����ݿ�������汾�������汾��������Щ���ݿ�ȵ�
  
            DatabaseMetaData dbmd = c.getMetaData();
  
            // ��ȡ���ݿ��������Ʒ����
            System.out.println("���ݿ��Ʒ����:\t"+dbmd.getDatabaseProductName());
            // ��ȡ���ݿ��������Ʒ�汾��
            System.out.println("���ݿ��Ʒ�汾:\t"+dbmd.getDatabaseProductVersion());
            // ��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
            System.out.println("���ݿ�ͱ�ָ���:\t"+dbmd.getCatalogSeparator());
            // ��ȡ�����汾
            System.out.println("�����汾:\t"+dbmd.getDriverVersion());
  
            System.out.println("���õ����ݿ��б�");
            // ��ȡ���ݿ�����
            ResultSet rs = dbmd.getCatalogs();
  
            while (rs.next()) {
                System.out.println("���ݿ�����:\t"+rs.getString(1));
            }
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();) {
  
            //û�������ǰ����
            //����ҵ�����ʱ����Ѫ����Ѫ����һ��
            //������Ӣ�۵�Ѫ������
              
            //��Ѫ��SQL
            String sql1 = "update hero set hp = hp +1 where id = 22";
            s.execute(sql1);
              
            //��Ѫ��SQL
            //��С��д��д���� updata(����update)
              
            String sql2 = "updata hero set hp = hp -1 where id = 22";
            s.execute(sql2);
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		/*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root", "admin");
            Statement s = c.createStatement();) {
  
            // �������ǰ����
            // �������еĶ��������Ҫô���ɹ���Ҫô��ʧ��
  
            c.setAutoCommit(false);
  
            // ��Ѫ��SQL
            String sql1 = "update hero set hp = hp +1 where id = 22";
            s.execute(sql1);
  
            // ��Ѫ��SQL
            // ��С��д��д���� updata(����update)
  
            String sql2 = "updata hero set hp = hp -1 where id = 22";
            s.execute(sql2);
  
            // �ֶ��ύ
            c.commit();
  
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
    }

}
