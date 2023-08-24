/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   amigosDAO.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mdouglas <mdouglas@student.42sp.org.br>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/08/23 16:01:24 by madmax42          #+#    #+#             */
/*   Updated: 2023/08/23 16:20:09 by mdouglas         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.amigos;

public class amigosDAO
{
    public void cadastrarUsuario(amigos amigos)
    {
        String sql = "INSERT INTO amigos (nome, apelido, idade) VALUES (?, ?, ?)";

        PreparedStatement stmt = null;
        try
        {
            stmt = Conexao.getConexao().prepareStatement(sql);
            stmt.setString(1, amigos.getNome());
            stmt.setString(2, amigos.getApelido());
            stmt.setInt(3, amigos.getIdade());
            stmt.executeUpdate();
            stmt.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
