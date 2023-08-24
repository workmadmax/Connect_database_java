/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Conexao.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mdouglas <mdouglas@student.42sp.org.br>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/08/23 16:04:24 by mdouglas          #+#    #+#             */
/*   Updated: 2023/08/23 16:08:10 by mdouglas         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */


package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    private static final String url = "jdbc:mysql://localhost:3306/madmax42";
    private static final String user = "root";
    private static final String password = "062328@#";

    private static Connection conn;

    public static Connection getConexao()
    {
        try
        {
            if (conn == null)
            {
                conn = DriverManager.getConnection(url, user, password);
                return (conn);
            }
            else
            {
                return (conn);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return (null);
        }
    }
}
