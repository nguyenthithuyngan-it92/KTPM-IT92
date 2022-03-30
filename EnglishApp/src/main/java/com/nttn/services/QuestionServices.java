/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttn.services;

import com.nttn.pojo.Question;
import com.nttn.utils.JdbcUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuestionServices {
    public List<Question> getQuestions(String kw) throws SQLException {
        try (Connection conn = JdbcUtils.getConn()) {
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM question WHERE content like concat('%', ?, '%')");
            if (kw == null)
                kw = "";
            
            stm.setString(1, kw);
            ResultSet rs = stm.executeQuery();
            
            List<Question> questions = new ArrayList<>();
            while (rs.next()) {
                String id = rs.getString("id");
                String content = rs.getString("content");
                int cateId = rs.getInt("category_id");
                questions.add(new Question(id, content, cateId));
            }
            
            return questions;
        }
    }
}
