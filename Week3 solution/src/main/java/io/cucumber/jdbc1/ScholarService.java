package io.cucumber.jdbc1;
import io.cucumber.jdbc1.*;
import io.cucumber.jdbc1.Scholar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ScholarService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Database Connection
        try (Connection conn = DbUtil.getConnection()) {
            if (conn != null) {
                System.out.println("Connected to Database Successfully!");
            }

            // SQL Query
            String sql = "INSERT INTO Scholar (Name, Email, Mobile) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Read inputs at runtime
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details for Scholar " + i + ":");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("Mobile: ");
                String mobile = scanner.nextLine();

                // Set parameters
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, mobile);

                // Execute Insert
                pstmt.executeUpdate();
                System.out.println("Scholar " + i + " added successfully!\n");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}

