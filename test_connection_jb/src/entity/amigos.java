/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   amigos.java                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: mdouglas <mdouglas@student.42sp.org.br>    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2023/08/23 16:04:16 by mdouglas          #+#    #+#             */
/*   Updated: 2023/08/23 16:18:49 by mdouglas         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package entity;

public class amigos
{
    
    private int     id;
    private int     idade;
    private String  nome;
    private String  apelido;

    public int getId()
    {
        return (this.id);
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getIdade()
    {
        return (this.idade);
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public String getNome()
    {
        return (this.nome);
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getApelido()
    {
        return (this.apelido);
    }
    public void setApelido(String apelido)
    {
        this.apelido = apelido;
    }
}
