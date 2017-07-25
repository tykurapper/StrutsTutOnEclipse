package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by Tyku on 7/7/2017.
 */
public class LoginAction extends ActionSupport {

    private String user;
    private String password;
    private String name;

    public String execute()
    {
        String ret = "error";
        Connection conn = null;

        try {
            String URL = "jdbc:mysql://localhost:3306/struts_tutorial";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, "root", "root123");
            if(conn == null) {
                System.out.println("Cant connect");
                System.exit(0);
            }
            String sql = "SELECT name FROM login WHERE";
            sql += " user = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, password);
            System.out.println("dmm");
            System.out.println(user + " " + password);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                name = rs.getString(1);
                ret = "success";
            }
        }
        catch (Exception e)
        {
            ret = "error";
        }
        finally {
            if (conn != null)
            {
                try {
                    conn.close();
                }
                catch (Exception e) {
                }
            }
        }

    return ret;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
